package Workshop6_2;

public class AccountTest {

	public static void main(String[] args) throws AccountException {
		// TODO Auto-generated method stub
		Account account = new Account("441-123-1234",500000,0.073);
		System.out.println(account.toString());
		account.deposit(10);
		account.withdraw(60000);
		System.out.println(account.toString());
	}

}
