package kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import kafka.ITaskProducer;
import kafka.properties.KafkaProperties;
import models.Product;

public class SimpleProducer implements ITaskProducer {
	public Producer<String, Product> producer;
	
	/**
	 * Open Producer 
	 */
	@Override
	public void open() {
		producer = new KafkaProducer<String, Product>(KafkaProperties.getInstance());
	}
	
	/**
	 * Send Product to topic of kafka
	 * @param product
	 */
	@Override
	public void send(String topic, Product product) {
		if(product == null) {
			throw new NullPointerException("Producer no initialization");
		}
		
		producer.send(new ProducerRecord<String, Product>(topic, "key", product));
		System.out.println("successfully send " + product.toString());
	}
	
	/**
	 * Close Producer 
	 */
	@Override
	public void close() {
		producer.close();
	}
}
