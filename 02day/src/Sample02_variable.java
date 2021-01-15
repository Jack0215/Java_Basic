
public class Sample02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63) 체중78.25
		//1. 변수선언 (메모리에 특정크기의 영역생성)
		String name; //변수,name변수, 문자열변수, String타입의변수
		int age;//변수,age변수, 정수형변수, int 타입의변수, 기본
		String address;//참조형변수
		char gender;//변수,gender변수,문자형변수,char타입변수
		boolean isMarried;//기본형 변수
		float height;//기본형 변수
		double weight;//기본형 변수
		
		//여기까진 공간이 마련되고 값은 없음
		
		//이제부터 값을 넣어줄거임
		//2. 변수초기화 (값을 맨 처음 설정하는 작업)
		name = "홍길동";
		age = 20;
		address= "서울";
		gender = '남';
		isMarried=false; //""안들어감
		height=185.63F; //F가 빠지면 double로 인식함
		weight=78.25;
		//이제 사용할 수 있음
		System.out.println(name); //뒤에 name은 변수값, 홍길동이 들어가있음
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);

		
	}

}
