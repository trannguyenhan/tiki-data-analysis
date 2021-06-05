package parse;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

import models.Data;

public class ParseUrl implements IParseObject{
	private String path;
	
	public ParseUrl() {
		this("https://tiki.vn/api/v2/products?limit=50&include=advertisement&aggregations=1&category=2549&page=200");
	}
	
	public ParseUrl(String path) {
		this.path = path;
	}
	
	@SuppressWarnings("unchecked")
	public Data getData() throws IOException {
		URL url = new URL(path);
		InputStreamReader input = new InputStreamReader(url.openStream());
		Data data = null;
		
		try {
			// you will be blocked because the confirmation is robot, you will return null if this is the case
			data = new Gson().fromJson(input, Data.class);
		} catch (Exception e) {
			return null;
		}
		
		
		return data;
	}
}
