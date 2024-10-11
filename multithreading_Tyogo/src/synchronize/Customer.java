package synchronize;

public class Customer extends Thread{
	private Account account;
	private int depositAmmount;
	
	public Customer(Account account, int depositAmmount) {
		super();
		this.account = account;
		this.depositAmmount = depositAmmount;
	}
	@Override
	public void run() {
		account.deposit(depositAmmount);
	}
}
