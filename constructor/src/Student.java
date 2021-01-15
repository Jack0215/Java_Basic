
public class Student {

	
	private String name; // 참조변수 앞에 아무것도 없으면 String 앞에 default가 자동으로 붙어있음, 변수이름 name
	private int age; // private : 생성가능, 다른 객체에서 접근 불가
	private String address;
	
	public Student() { //return타입이 없음, 기본 생성자가 붙음. 생성자의 기본 문법임, 클래스이름() 이렇게 만드는게 클래스 이름과 같아야함
						//사용자가 적지 않으면 JVK가 안붙이는걸로 인식
		System.out.println("Student 생성자 호출");
		name="홍길동";
		age=10;
		address="강남구"; //객체 생성할 때 객체 초기값을 항상 이렇게 저장하기 위해 사용
	}
	public String stuInfo() {
		return name+"/"+age+"/"+address;
	}
	
	public void setName(String name) {
		this.name = name;
	} // 멤버변수 name 값 설정함수

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() { // getName을 통해 다른 클래스로 이 값을 보낼 수 있음
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	
	
}
