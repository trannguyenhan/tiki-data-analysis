package models;

import com.google.gson.annotations.SerializedName;

public class Inventory {
	@SerializedName("fulfillment_type")
	private String fulfillmentType;
	
	public Inventory() {
		this("tiki_delivery");
	}
	
	public Inventory(String fulfillmentType) {
		setFulfillmentType(fulfillmentType);
	}
	
	public String getFulfillmentType() {
		return fulfillmentType;
	}

	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}
	
}
