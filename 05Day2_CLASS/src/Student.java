//public은 접근제한자임.
//학생들을 모델링해서 객체생성했음.
public class Student {
//인스턴스변수, 멤버변수 class 범위(메소드 밖에서 선언)
// -메서드 밖에서 static(x)
// new 사용 시 변수 생성
// -생성시점?
//	객체생성 ~ 객체소멸(참조변수가 못가리킬 때)
// -자동으로 초기화(각 타입 별 default 값)
	String name;
	int age;
	String address;
}
