package banco;

public class Account {

	private int number;
	private String holder;
	public double balance;

	public Account(int number, String holder, double initialbalance) {
		this.number = number;
		this.holder = holder;
		deposit(initialbalance);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getholder() {
		return holder;
	}

	public void setholder(String holder) {
		this.holder = holder;
	}

	public double getbalance() {
		return balance;
	}

	public int getnumber() {
		return number;
	}
	

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;

	}
	
	public String toString() {
		return "Account "+ number
				+ ", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance);
	}
	
	

}
