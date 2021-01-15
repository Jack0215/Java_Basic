
public class WrapperTest {

	public static void main(String[] args) {
		
		//Wrapper 클래스 : 기본형 8개에 해당하는 클래스들.
		/*
		 *   Byte
		 *   Short
		 *   Integer
		 *   Long
		 *   
		 *   Float
		 *   Double
		 *   
		 *   Character
		 *   
		 *   Boolean
		 * 
		 */
		
		//Wrapper 클래스의 주요 상수
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// 주요 메서드
		int num =Integer.parseInt("10");
		System.out.println(num+20);
		float f = Float.parseFloat("3.13");
		System.out.println(f+10);
		
		
		
	}//end main
}//end class
