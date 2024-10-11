package synchronize;

public class Account {
	private int balance = 0;
	
	synchronized void deposit(int ammount) {
		this.balance += ammount;
		System.out.println("After deposit:" + ammount + " balance:Rp" + balance);
	}
	int getBalance(){
		return this.balance;
	}

}
