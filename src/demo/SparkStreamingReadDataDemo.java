package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;

import com.google.gson.Gson;

import kafka.properties.SSKafkaProperties;
import models.Product;
import services.HandleParquetFile;

public class SparkStreamingReadDataDemo {
	public static void main(String[] args) throws InterruptedException {
		// create object handle parquet file
		HandleParquetFile handle = new HandleParquetFile();
		List<Product> listProducts = new ArrayList<Product>();
		
		// Create a local StreamingContext and batch interval of 10 second
        SparkConf conf = new SparkConf().setMaster("local").setAppName("Kafka Spark Integration");
        JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(10));

        // Define a list of Kafka topic to subscribe
        Collection<String> topics = Arrays.asList("hello-kafka");

        // Create an input DStream which consume message from Kafka topics
        JavaInputDStream<ConsumerRecord<String, String>> stream;
        stream = KafkaUtils.createDirectStream(jssc,LocationStrategies.PreferConsistent()
        		,ConsumerStrategies.Subscribe(topics, SSKafkaProperties.getInstance()));
        
        // Read value of each message from Kafka
        JavaDStream<String> lines = stream.map((Function<ConsumerRecord<String, String>, String>) kafkaRecord -> kafkaRecord.value());
        lines.cache().foreachRDD(line -> {
        	List<String> list = line.collect();
        	if(line != null) { // if have text send to queue
        		for(String l : list) {
        			if(!l.contains("{") || !l.contains("}") || !l.contains(":")) { // if not JSON
        				continue;
        			}
        			
        			Product product = new Gson().fromJson(l, Product.class);
        			listProducts.add(product);
        			
        			if(listProducts.size() == 100) { // if reach threshold, save to hadoop HDFS parquet file and clear
        				handle.saveToHDFSParquetFile(listProducts);
        				System.out.println("SAVED");
        				listProducts.clear();
        			}
        			
        		}
        	}
        });

        // Start the computation
        jssc.start();
        jssc.awaitTermination();
	}
}
