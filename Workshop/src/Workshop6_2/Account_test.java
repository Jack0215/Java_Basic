package Workshop6_2;

public class Account_test  {

	public static void main(String[] args) throws AccountException  {
		// TODO Auto-generated method stub
//		Account account;
		Account	account = new Account ("441-0290-1203", 50000, 0.073);
//		System.out.println("계좌정보"+account.getAccount()+"현재잔액:"
//				+ account.getBalance());
//		account.withdraw(10000);
//		account.deposit(00000);
		System.out.println("계좌정보 :"+ account.getAccount()+"현재잔액:"
				+account.getBalance());
//		System.out.println("이자"+account.calculateInterest());
		try {
			account.deposit(100000);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} 
//		finally {
//			System.out.println("입금 금액 :"+account.deposit());
//		}
		
		try {
			account.withdraw(60000);
		} catch (AccountException e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("잔액"+account.getBalance());
		}
//		System.out.println("이자:"+account.calculateInterest());
	}
}
