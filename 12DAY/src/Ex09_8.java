
class UserException extends Exception {
	public UserException(String mesg) {
		super(mesg);
	}
	public void print() {
		System.out.println("사용자정의 Ex");
	}
}

public class Ex09_8{
	public static void check(int num) throws UserException {
		if (num < 100) {
			throw new UserException("num값이 100보다 작다");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check(70);

		} catch (UserException e) {
			System.out.println("예외발생:" + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}


//디포짓 뜨로우즈
//위드드로우드 뜨로우즈
//부르느눕분 전체를 트라이캐치로 할지