package parse;

import java.io.IOException;

import models.Data;

public class ParseData implements ParseObject{
	private int category;
	private int page;
	
	public ParseData() {
		this(2549, 200);
	}
	
	public ParseData (int category, int page) {
		this.category = category;
		this.page = page;
	}
	
	public Data getData() throws IOException {
		String url = "https://tiki.vn/api/v2/products?limit=50&include=advertisement&aggregations=1&category=" 
				+ this.category + "&page="
				+ this.page;

		ParseUrl parseUrl = new ParseUrl(url);
		
		return parseUrl.getData();
	}
}
