
public class Clothing extends Product implements Orderable{
	String size;
	int quantity;
	boolean availability;	
	
	


	public Clothing(String productId, String productName, Double price) {
		super(productId, productName, price);
		
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public void displayProductInfo() {
		System.out.printf("%-5s|%-10s|%-5|%-5|%-10", getProductId(), getProductName(), getPrice(), getSize(), isAvailability());
	}


	@Override
	public void addToOrder(Order order) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayOrderDetails() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean getisAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
