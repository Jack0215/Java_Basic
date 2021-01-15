package Workshop4_3;

public class Account {
	private String account;
	private int balance; 
	private double interestRate;
//	private double calculateInterest;
	
	Account() {}
	public Account(String account, int balance, Double interestRate) {
		super();
		this.account = account;
		this.balance=balance;
		this.interestRate = interestRate;
	}	
	public double calculateInterest() {
		return balance*interestRate;
	}
	public void deposit (int money) {
		balance += balance+money;
	}
	public void withdraw (int money) {
		if (balance < money ) {
			System.out.println("잔고부족");
		}else {
			balance -= money;
		}
	}	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}	
}
