package Workshop4_3;

public class Account_2 {
	private String account;
	private int balance;
	private double interestRate;
	
	Account_2 (){}
	public Account_2(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
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
	public double calculateInterest() {
		return balance*interestRate;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if(  balance < money ) {
			System.out.println("출금 할 수 없습니다.");
		}else{
			balance -= money;
		}
		
	}
}
