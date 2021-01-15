package Workshop6_2;

public class Account {
 private String account;
 private double balance;
 private double interestRate;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(String account, double balance, double interestRate) {
	super();
	this.account = account;
	this.balance = balance;
	this.interestRate = interestRate;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public double getBalance() {
	return balance;
}
public double getInterestRate() {
	return interestRate;
}

public double calculateInterest() {
	return balance*interestRate;
}
public void deposit(double money) throws AccountException{
	if ( 0>=money) {
		throw new AccountException("입금액이 0보다 작습니다.");
	}
	balance += money;
}
public void withdraw(double money) throws AccountException{
	if ( 0>balance || balance<money) {
		throw new AccountException("잔고가 부족합니다.");
	}
	balance -= money;
}
@Override
public String toString() {
	return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
}
}
