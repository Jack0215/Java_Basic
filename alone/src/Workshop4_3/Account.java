package Workshop4_3;

public class Account {
 private String account;
 private int balance;
 private double interestRate;
 
 public Account() {}
 public Account(String account,int balance, double interestRate) {
	 this.account =account;
	 this.balance=balance;
	 this.interestRate=interestRate;
 }
 public double calculateInterest() {
	 return balance*interestRate;
 }
 public void deposit(int money) {
	 balance += money;
 }
 
 public void withdraw(int money) {
	 if(balance < money) {
		 System.out.println("출금할 수 없습니다.");
	 }
	 this.balance -=money;
	 System.out.println(balance);
	 
 }
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public double getInterestRate() {
	return interestRate;
}
 
}
