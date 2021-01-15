
public class Ex09_5 {

	public static void a() throws ArithmeticException{
		b(); // b함수에서 발생  throws되서 a로 넘어감
	}
	public static void b() throws ArithmeticException{
		int num = 3/0;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
	a();
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage()+" 에러발생");
	}
	System.out.println("프로그램 정상 종료");
	}
}
