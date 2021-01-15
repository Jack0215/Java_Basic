
public class Ex08_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 "123"을 정수 123으로 변경
		String str = "123";
		int a = Integer.parseInt(str);

		//문자열 "3.14F"를 실수 3.14F으로 변경
		String str2 = "3.14F";
		float b = Float.parseFloat(str2);

		//정수 123을 문자열 "123"으로 변경
		String intStr = Integer.toString(123);
		
		//실수 3.14F를 문자열 "3.14F"로 변경
		String floatString = Float.toString(3.14F);
	}

}
