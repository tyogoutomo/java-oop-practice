import java.util.Scanner;

public class Main {	
	public Main() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String custID;
		
		System.out.println("=== Online Shopping Platform ===");
		System.out.println("Input Customer ID: ");
		custID = scan.nextLine();
		
		Menu menu = new Menu(args);
		

	}
	
}

class Menu{
	Scanner scan = new Scanner(System.in);
	int choice_menu, choice_shop; 
	public Menu(String[] args) {
		System.out.println("1. Shop for Products\r\n"
				+ "2. View Shopping Cart\r\n"
				+ "3. View Orders\r\n"
				+ "4. Customer Info\r\n"
				+ "5. Exit\r\n"
				+ "Your Choice:");
		choice_menu = scan.nextInt();
		switch(choice_menu) {
			case 1:
				System.out.println("=== Shop for Products ===\r\n"
						+ "1. View All Products\r\n"
						+ "2. Add Clothing to Cart\r\n"
						+ "3. Add Electronics to Cart\r\n"
						+ "4. Back to Main Menu\r\n"
						+ "Your Choice:");
				choice_shop = scan.nextInt();
				switch(choice_shop) {
					case 1:
						
						break;
					default:
						break;
				}
				break;
				
			default:
				break;
		}
	}
}