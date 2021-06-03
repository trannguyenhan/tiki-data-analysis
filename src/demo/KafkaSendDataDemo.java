package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kafka.producer.SimpleProducer;
import models.Product;
import parse.ParseData;

public class KafkaSendDataDemo {
	public static void main(String[] args) throws FileNotFoundException {
		// get category of tiki
		Scanner sc = new Scanner(new File("resource/tiki_cate.csv"));
		sc.useDelimiter("\n");
		List<Integer> listCategories = new ArrayList<Integer>();
		
		sc.next(); // pass the title
		while(sc.hasNext()) {
			listCategories.add(Integer.parseInt(sc.next().split(",")[1]));
		}
		
		// create parse object
		ParseData parse = new ParseData();
		SimpleProducer producer = new SimpleProducer();
		
		for(int ca : listCategories) {
			for(int pa=0; pa<300; pa++) {
				parse.set(ca, pa);
				List<Product> list;
				try {
					list = parse.getData().getListProducts();
				} catch (IOException e) {
					continue;
				}
				
				
				producer.open();
				for(Product product : list) {
					product.setCategory(ca); // set category of product is URL when crawl
					producer.send("hello-kafka", product);
				}
				
				System.out.println("DONE! category " + ca + " page " + pa + " total products is " + list.size());
			}
		}
	
		producer.close();
		
		
	}
}
