import java.lang.NullPointerException;

public class Ex09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		try {
			int value = 3;
			int num = 3 / value;
			int result = num + 100;
			System.out.println("연산된 값 :" + result);
		} catch (NullPointerException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
//		System.out.println(num);
		//프로그램 끝나기 전 num값 찍기 불가. num은 try블럭안에 선언돼서 try에서만 쓸수있음
		//num은 트라이블럭 위에 선언되어야함.
		System.out.println("프로그램 정상 종료");
		
	}// 메인 끝

}// 클래스 끝
