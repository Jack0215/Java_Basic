
class ByZeroException extends Exception {
	public ByZeroException(String mesg) {
		super(mesg);
	}
}

public class Ex09_10 {
	public static void divide() throws ByZeroException{
	try {
		int num = 3/0 ;
		} catch (ArithmeticException e) {
			throw new ByZeroException("분모가 0이므로 나눌 수 없습니다.");
//			System.out.println(e.getMessage()+" 에러발생");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide();
		} catch (ByZeroException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	System.out.println("프로그램 정상종료");
	}

}
