
public class Sample02_variable4_2 {
	String name;
	char c;
	int m; //인스턴스변수(instance variable) or 멤버변수(클래스단에서 사용된 상태, 별도로 객체생성을 해야 사용가능)
	       // 생성시점 : 객체생성(클래스생성)~객체소멸(클래스종료), new라는 객체 키워드 별도로 만들어서 사용해야함
		   // 메모리: 힙(heap)
		   // 초기화 안하면 자동초기화 된다.
	//정수:0, 실수:0.0, char:'\u0000, boolean:false, 참조형:null
	static int k; //static변수(클래스변수)
	//생성시점: 프로그램시작~프로그램종료, new 키 없이 사용
	//메모리: method area(클래스정보, static, 상수, ...)
	//초기화 안하면 자동초기화 된다.
	//정수:0, 실수:0.0, char:'\u0000, biilean:false, 참조형:null
	public static void main(String[] args) {
		//로컬변수(local variable) : 메서드(함수같은..?)안에서 선언
		//생성시점 : 메서드호출 ~ 메서드 종료
		//메모리 : 스택(stack)
		//주의할점 : 반드시 사용전에 초기화해야된다.
		
		int n=0;
		System.out.println(n); //메인 로컬변수 사용
		Sample02_variable4_2 test_1=new Sample02_variable4_2();
		//멤버변수 사용을 위해 객체 생성
	} 
	
	//로컬변수(사용전 초기화 반드시 진행)와 인스턴스변수 차이점

}
