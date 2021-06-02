package models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Data {
	@SerializedName("data")
	private List<Product> listProducts;

	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
