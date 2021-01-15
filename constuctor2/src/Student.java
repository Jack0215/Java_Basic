
public class Student {

	
	private String name; // 참조변수 앞에 아무것도 없으면 String 앞에 default가 자동으로 붙어있음, 변수이름 name
	private int age; // private : 생성가능, 다른 객체에서 접근 불가
	private String address;
	//멤버변수 1개 더 생성 (Book 개체)
	private Book writtenBook;
	
	//                     ↓받아올 개체가 Book type이라 맞춰줌
	public void setBook (Book writtenbook) {
		this.writtenBook=writtenbook;
	}
	public Book getBook() {
		return writtenBook;
	} 
	//이제 Book개체를 만들어서(TestStudent안에서 만들어야함) 여기다 넣어줘야함
	
	
	public Student() {} //기본 생성자를 명시적으로 기재
	public Student(String name, int age, String address) {
		System.out.println("Student 생성자 호출");
		this.name=name; //오른쪽 name = 받아올 인자값
		this.age=age;
		this.address=address;
	}
	//       ↓ return type
	public String stuInfo() {
		return name+"/"+age+"/"+address;
	}
	public void setName(String name) { //name은 setName에 있는 로컬변수
		this.name = name;  //this란 public Student에 있는 값(?)
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
