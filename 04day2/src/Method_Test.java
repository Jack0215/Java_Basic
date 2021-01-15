
public class Method_Test {

//	public void a_Method(/* 받을 인자값(parameter) */) { /* 아무곳에서 접근, 반환값없음, 함수이름, 받는값 없음 */
//		// 호출한 곳으로 돌아갈 값의 타입 / 함수이름 /받을 인자값
//		System.out.println("a_Method()호출_1");
//		System.out.println("a_Method()호출_2");
//	} // class 선언, 멤버 메소드(함수) new 사용해서 생성해야함
	                  //받을 인자값 추가↓
	public void a_Method(String name) { /* 아무곳에서 접근, 반환값없음, 함수이름, 받는값 없음 */
	// 호출한 곳으로 돌아갈 값의 타입 / 함수이름 /받을 인자값
	System.out.println("a_Method()호출_1");
	System.out.println("a_Method()호출_2");
	System.out.println("a_Method() 전달받은 인자"+name); //호출한 곳에서 값을 넘겨줄 수 있음
} // class 선언, 멤버 메소드(함수) new 사용해서 생성해야함

	public void b_Method() {
		System.out.println("a_Method()호출_3");
		System.out.println("a_Method()호출_4");
	}// class 선언, 멤버 메소드(함수) new 사용해서 생성해야함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램 시작
		System.out.println("main시작==================");
		Method_Test test = new Method_Test();
		test.a_Method(" 메소드로 문자열 전송");
		test.b_Method();
		System.out.println("main종료==================");
	}
}
