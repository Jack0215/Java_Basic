
public class Ex09_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		String name = null;
		try {
			int num = 3 / 0;
			int[] num2 = { 10, 20 };
			System.out.println(num2[3]); // 배열방 없는데 접근하고있음
			System.out.println("문자열의 길이:" + name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + " 예외발생1");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " 예외발생2");
		} catch (Exception e) {
			System.out.println("예외발생3" + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}
//int num = 3/0;은 catch가 14에서 걸림
//14가 안걸리게 9를 수정

//try 클래스가 2개일 경우