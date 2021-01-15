
public class Try_catch_2 {
public static void main(String[] args) {
	System.out.println("프포그램 시작");
	try {
	System.out.println("B");
	int num = 3/0;
	System.out.println("C");//ArithmeticException 발생
	}catch(ArithmeticException e) {
	System.out.println("예외사항발생");
		}
	 System.out.println("메인함수 끝");
	} 
}
