
public class Ex09_5_6 {

	public static void a() throws ArithmeticException {
		b(); // b함수에서 발생 throws되서 a로 넘어감 //b를 찾아감
	}

	public static void b() throws ArithmeticException {
		try {							//Exception 으로 하나만 바꿀 경우 성립이 안됨 
		int num = 10;
		int result = num/0;
		System.out.println(result);
		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage()+" Arith error");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			a();  //a호출 -> a를찾아감
		} catch (ArithmeticException e) { 
			System.out.println(e.getMessage() + " 에러발생2"); //여기선 12행의 메세지가 출력됨
		}
		System.out.println("프로그램 정상 종료");
	}
}
