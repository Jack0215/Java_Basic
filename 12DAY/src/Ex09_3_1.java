
public class Ex09_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			int num = 10;
			int result = num/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()+" 예외발생1");
	}
		try {
			String name=null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()+" 예외발생2");
		} 
		System.out.println("프로그램 종료");
	}

}
