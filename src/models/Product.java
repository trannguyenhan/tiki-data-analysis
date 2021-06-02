package models;

import com.google.gson.annotations.SerializedName;

import scala.Serializable;

public class Product implements Serializable{
	// implements Serializable and include serialVersionUID
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String sku;
	private String name;
	
	public Product() {
		this(59671323, "4988371385512", "Bàn chải đánh răng Silicon - KUB", 
				"ban-chai-danh-rang-silicon-kub-p59671323", 
				"ban-chai-danh-rang-silicon-kub-p59671323.html?src=ss-organic", 
				"configurable", 
				"KUB", 
				"\n\n\n\n\n", 
				150000, 
				175000, 
				25000, 
				14, 
				4.7, 
				3, 
				0, 
				0, 
				"https://salt.tikicdn.com/cache/280x280/ts/product/23/90/ba/a3140b7da45e76f53e9d23bd0b16d9ef.jpg", 
				280, 
				280, 
				false, 
				"available", 
				2207, 
				false, 
				false, 
				new Inventory(), 
				"", 
				new StockItem(), 
				"", 
				59671325, 
				new QuantitySold());
	}
	
	public Product(int id, String sku, String name, String urlKey, String urlPath, String type, String brandName,
			String shortDescription, double price, double listPrice, double discount, int discountRate,
			double ratingAverage, int reviewCount, int orderCount, int favouriteCount, String thumbnailUrl,
			int thumbnailWidth, int thumbnailHeight, boolean hasEbook, String inventoryStatus, int productsetId,
			boolean isFlower, boolean isGiftCard, Inventory inventory, String urlAttendantInputForm,
			StockItem stockItem, String salableType, int sellerProductId, QuantitySold quantitySold) {
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.urlKey = urlKey;
		this.urlPath = urlPath;
		this.type = type;
		this.brandName = brandName;
		this.shortDescription = shortDescription;
		this.price = price;
		this.listPrice = listPrice;
		this.discount = discount;
		this.discountRate = discountRate;
		this.ratingAverage = ratingAverage;
		this.reviewCount = reviewCount;
		this.orderCount = orderCount;
		this.favouriteCount = favouriteCount;
		this.thumbnailUrl = thumbnailUrl;
		this.thumbnailWidth = thumbnailWidth;
		this.thumbnailHeight = thumbnailHeight;
		this.hasEbook = hasEbook;
		this.inventoryStatus = inventoryStatus;
		this.productsetId = productsetId;
		this.isFlower = isFlower;
		this.isGiftCard = isGiftCard;
		this.inventory = inventory;
		this.urlAttendantInputForm = urlAttendantInputForm;
		this.stockItem = stockItem;
		this.salableType = salableType;
		this.sellerProductId = sellerProductId;
		this.quantitySold = quantitySold;
	}

	@SerializedName("url_key")
	private String urlKey;
	
	@SerializedName("url_path")
	private String urlPath;
	
	private String type;
	
	@SerializedName("brand_name")
	private String brandName;
	
	@SerializedName("short_description")
	private String shortDescription;
	
	private double price;
	
	@SerializedName("list_price")
	private double listPrice;
	
	private double discount;
	
	@SerializedName("discount_rate")
	private int discountRate;
	
	@SerializedName("rating_average")
	private double ratingAverage;
	
	@SerializedName("review_count")
	private int reviewCount;
	
	@SerializedName("order_count")
	private int orderCount;
	
	@SerializedName("favourite_count")
	private int favouriteCount;
	
	@SerializedName("thumbnail_url")
	private String thumbnailUrl;
	
	@SerializedName("thumbnail_width")
	private int thumbnailWidth;
	
	@SerializedName("thumbnail_height")
	private int thumbnailHeight;
	
	@SerializedName("has_ebook")
	private boolean hasEbook;
	
	@SerializedName("inventory_status")
	private String inventoryStatus;
	
	@SerializedName("productset_id")
	private int productsetId;
	
	@SerializedName("is_flower")
	private boolean isFlower;
	
	@SerializedName("is_gift_card")
	private boolean isGiftCard;
	
	private Inventory inventory;
	
	@SerializedName("url_attendant_input_form")
	private String urlAttendantInputForm;
	
	@SerializedName("stock_item")
	private StockItem stockItem;
	
	@SerializedName("salable_type")
	private String salableType;
	
	@SerializedName("seller_product_id")
	private int sellerProductId;
	
	@SerializedName("quantity_sold")
	private QuantitySold quantitySold;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getRatingAverage() {
		return ratingAverage;
	}

	public void setRatingAverage(double ratingAverage) {
		this.ratingAverage = ratingAverage;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public int getFavouriteCount() {
		return favouriteCount;
	}

	public void setFavouriteCount(int favouriteCount) {
		this.favouriteCount = favouriteCount;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public int getThumbnailWidth() {
		return thumbnailWidth;
	}

	public void setThumbnailWidth(int thumbnailWidth) {
		this.thumbnailWidth = thumbnailWidth;
	}

	public int getThumbnailHeight() {
		return thumbnailHeight;
	}

	public void setThumbnailHeight(int thumbnailHeight) {
		this.thumbnailHeight = thumbnailHeight;
	}

	public boolean isHasEbook() {
		return hasEbook;
	}

	public void setHasEbook(boolean hasEbook) {
		this.hasEbook = hasEbook;
	}

	public String getInventoryStatus() {
		return inventoryStatus;
	}

	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	public int getProductsetId() {
		return productsetId;
	}

	public void setProductsetId(int productsetId) {
		this.productsetId = productsetId;
	}

	public boolean isFlower() {
		return isFlower;
	}

	public void setFlower(boolean isFlower) {
		this.isFlower = isFlower;
	}

	public boolean isGiftCard() {
		return isGiftCard;
	}

	public void setGiftCard(boolean isGiftCard) {
		this.isGiftCard = isGiftCard;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getUrlAttendantInputForm() {
		return urlAttendantInputForm;
	}

	public void setUrlAttendantInputForm(String urlAttendantInputForm) {
		this.urlAttendantInputForm = urlAttendantInputForm;
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public String getSalableType() {
		return salableType;
	}

	public void setSalableType(String salableType) {
		this.salableType = salableType;
	}

	public int getSellerProductId() {
		return sellerProductId;
	}

	public void setSellerProductId(int sellerProductId) {
		this.sellerProductId = sellerProductId;
	}

	public QuantitySold getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(QuantitySold quantitySold) {
		this.quantitySold = quantitySold;
	}
	
	@Override
	public String toString() {
		return "ID : " + this.id + ", " + "SKU : " + this.sku;
	}
}
