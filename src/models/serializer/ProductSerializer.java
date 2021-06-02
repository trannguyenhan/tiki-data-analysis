package models.serializer;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Product;

public class ProductSerializer implements Serializer<Product>{

	@Override
	public byte[] serialize(String topic, Product data) {
		byte[] value = null;
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			value = mapper.writeValueAsString(data).getBytes();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}

}
