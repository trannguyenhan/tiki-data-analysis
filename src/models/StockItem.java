package models;

import com.google.gson.annotations.SerializedName;

public class StockItem {
	private int qty;
	
	@SerializedName("min_sale_qty")
	private int minSaleQty;
	
	@SerializedName("max_sale_qty")
	private int maxSaleQty;
	
	@SerializedName("preorder_date")
	private boolean preorderDate;

	public StockItem() {
		this(4, 1, 20, false);
	}
	
	public StockItem(int qty, int minSaleQty, int maxSaleQty, boolean preorderDate) {
		setQty(qty);
		setMinSaleQty(minSaleQty);
		setMaxSaleQty(maxSaleQty);
		setPreorderDate(preorderDate);
	}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getMinSaleQty() {
		return minSaleQty;
	}

	public void setMinSaleQty(int minSaleQty) {
		this.minSaleQty = minSaleQty;
	}

	public int getMaxSaleQty() {
		return maxSaleQty;
	}

	public void setMaxSaleQty(int maxSaleQty) {
		this.maxSaleQty = maxSaleQty;
	}

	public boolean isPreorderDate() {
		return preorderDate;
	}

	public void setPreorderDate(boolean preorderDate) {
		this.preorderDate = preorderDate;
	}
	
	
}
