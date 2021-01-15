package Workshop4_3;

public class Account_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account account;
		Account	account = new Account ("441-0290-1203", 50000, 0.073);
		System.out.println("계좌정보"+account.getAccount()+"현재잔액:"
				+ account.getBalance());
		account.withdraw(50000);
		account.deposit(20000);
		System.out.println("계좌정보 :"+ account.getAccount()+"현재잔액:"
				+account.getBalance());
		System.out.println("이자"+account.calculateInterest());
	}
}
