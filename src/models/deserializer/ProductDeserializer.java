package models.deserializer;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Product;

public class ProductDeserializer implements Deserializer<Product>{

	@Override
	public Product deserialize(String topic, byte[] data) {
		ObjectMapper mapper = new ObjectMapper();
		Product product = null;
		
		try {
			product = mapper.readValue(data, Product.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}
	
}
