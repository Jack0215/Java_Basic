package Workshop6_2;
public class Account  {
	private String account;
	private int balance; 
	private double interestRate;
	Account() {}
	public Account(String account, int balance, Double interestRate)  {
		super();
		this.account = account;
		this.balance=balance;
		this.interestRate = interestRate;
	}	
	public double calculateInterest() {
		return balance*interestRate;
	}
	public void deposit (int money) throws AccountException {
		if (0 >= money) {
			throw new AccountException("입금액이 0보다 작습니다.");
		} 
		balance += money;
	} 	
	public void withdraw (int money) throws AccountException {
		if (balance < money || balance <= 0) {
			throw new AccountException(" 출금 금액이 부족합니다.");
		}
		balance -= money;
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

//출금액이 0보다 작거나
//출금액이 발란스보다 많은경우 or로 해서 익셉션 발생
