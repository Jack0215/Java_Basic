package Workshop4_3;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account user = new Account("441-0290-1203",500000,0.073);
		
		System.out.println("계좌정보:"+user.getAccount()+"현재 잔액:"+user.getBalance());
//		System.out.println(user.calculateInterest());
		user.deposit(500000);
		System.out.println("계좌정보:"+user.getAccount()+"현재 잔액:"+user.getBalance());

	}
}
