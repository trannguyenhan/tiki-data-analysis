package demo.runable;

//import java.io.IOException;
//import java.util.List;
//
//import kafka.producer.SimpleProducer;
//import models.Product;
//import parse.ParseData;

/**
 * if you want run with multi-thread ( faster run with one thread main), use Runable.
 * if you can out of memory if configuration no good
 */
//public class CrawlWorker implements Runnable{
//	private int category;
//	private int page;
//	
//	public CrawlWorker(int category, int page) {
//		this.category = category;
//		this.page = page;
//	}
//	
//	@Override
//	public void run() {
//		ParseData parse = new ParseData();
//		SimpleProducer producer = new SimpleProducer();
//		
//		parse.set(category, page);
//		
//		List<Product> list;
//		
//		try {
//			list = parse.getData().getListProducts();
//		} catch (IOException e) {
//			return;
//		}
//		
//		producer.open();
//		for(Product product : list) {
//			product.setCategory(category); // set category of product is URL when crawl
//			producer.send("hello-kafka", product);
//		}
//		
//		System.out.println("DONE! category " + category + " page " + page + " total products is " + list.size());
//	}
//
//}
