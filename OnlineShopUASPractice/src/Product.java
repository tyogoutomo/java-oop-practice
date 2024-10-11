
public abstract class Product {
	String productId, productName;
	Double price;
	
	public Product(String productId, String productName, Double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public abstract void displayProductInfo();
	public abstract double getPrice();
	public abstract boolean getisAvailable();

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
