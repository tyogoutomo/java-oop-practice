package synchronize;

public class Main {

	public static void main(String[] args) {
		Account accBank = new Account();
		
		Customer cust1 = new Customer(accBank, 100000);
		Customer cust2 = new Customer(accBank, 2000000);
		Customer cust3 = new Customer(accBank, 500000);
		
		cust1.start();
		cust2.start();
		cust3.start();
		
		try {
			// Every thread is waiting deposit process to finish before
			// continuing to the next thread
			cust1.join();
			cust2.join();
			cust3.join();
		} catch (InterruptedException e) {
			System.out.println("Deposit ERROR!");
			e.printStackTrace();
		}
		System.out.println("Final balance:" + accBank.getBalance());
	}

}
