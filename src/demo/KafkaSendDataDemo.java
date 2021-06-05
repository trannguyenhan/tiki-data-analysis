package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kafka.ITaskProducer;
import kafka.producer.SimpleProducer;
import models.Product;
import parse.ParseData;

public class KafkaSendDataDemo {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// get category of tiki
		Scanner sc = new Scanner(new File("resource/tiki_cate.csv"));
		sc.useDelimiter("\n");
		List<Integer> listCategories = new ArrayList<Integer>();
		
		sc.next(); // pass the title
		while(sc.hasNext()) {
			listCategories.add(Integer.parseInt(sc.next().split(",")[1]));
		}
		int sizeOfCategory = listCategories.size();
		
		// create parse object
		ParseData parse = new ParseData();
		ITaskProducer producer = new SimpleProducer();
		
		// cate 1999
		// cate 16x
		for(int ca=0; ca<sizeOfCategory; ca++) {
			int cate = listCategories.get(ca);
			for(int pa=0; pa<300; pa++) {
				parse.set(cate, pa);
				List<Product> list = null;
				try {
					if(parse.getData() != null) {
						list = parse.getData().getListProducts();
					}
				} catch (IOException e) {
					Thread.sleep(10); // sleep 10s if exception
					continue;
				}
				
				if(list.size() == 0 || list == null) break;
				
				producer.open();
				for(Product product : list) {
					product.setCategory(cate); // set category of product is URL when crawl
					producer.send("tiki-read-data-1", product);
				}
				
				System.out.println("DONE! number of category " + ca + " category " + cate + " page " + pa + " total products is " + list.size());
			}
		}
	
		producer.close();
		
		
	}
}