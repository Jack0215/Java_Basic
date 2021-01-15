
public class Ex09_5_2 {
	
	public static void a() throws ArithmeticException, NullPointerException{
		b(); // b함수에서 발생  throws되서 a로 넘어감
	}
	public static void b() throws ArithmeticException, NullPointerException{
		int num = 3/0;  
		String name = null;
		System.out.println(name.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
	try {
	a();
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage()+" 에러발생1");
	} catch (NullPointerException e) {
		System.out.println(e.getMessage()+" 에러발생2");
	} catch (Exception e) {
		System.out.println(e.getMessage()+" 에러발생3");
	}
	System.out.println("프로그램 정상 종료");
	}
}
