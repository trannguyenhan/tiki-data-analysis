package models;

public class QuantitySold {
	private String text;
	private int value;
	
	public QuantitySold() {
		this("11", 11);
	}
	
	public QuantitySold(String text, int value) {
		setText(text);
		setValue(value);
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
