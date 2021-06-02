package demo;

import java.io.IOException;
import java.util.List;

import kafka.producer.SimpleProducer;
import models.Product;
import parse.ParseData;

public class KafkaSendDataDemo {
	public static void main(String[] args) throws IOException {
		ParseData parse = new ParseData();
		List<Product> list = parse.getData().getListProducts();
		
		SimpleProducer producer = new SimpleProducer();
		producer.open();
		for(Product product : list) {
			producer.send("hello-kafka", product);
		}
		producer.close();
	}
}
