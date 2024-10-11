import java.util.ArrayList;

public class Customer extends User{
	String address;
	ArrayList<Order> orders;
	ArrayList<Product> cart;
	
	public Customer(String userId, String username, String email) {
		super(userId, username, email);
		// TODO Auto-generated constructor stub
	}
	public void displayCustomerInfo() {
		System.out.println("=== Customer Info ===");
		super.displayUserInfo();
		System.out.println("Address    : " + getAddress());
		System.out.println("Order      : " + getOrders());
		System.out.println("Press Enter to back to Main Menu...");
	}
	public void addToCart(ArrayList<Product> product) {
		setCart(product);
	}
	
	public void viewCart() {
		cart.forEach(element -> System.out.println(element));		
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public ArrayList<Product> getCart() {
		return cart;
	}
	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}

}
