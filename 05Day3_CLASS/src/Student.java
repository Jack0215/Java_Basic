//클래스 안에 크게 3개로 구성됨 :  1.인스턴스변수 (name,age 등, 반드시 new를 써서 사용해야함)
//2.메소드(함수, set과get을 만들었음)
//3.생성자  (new student() <- 생성자 만든거임)
//객체 생성 할 때 쓰는 키워드 new
public class Student {

	private String name; 
	private int age; 
	private String address;
	public String stuInfo() {
//		return name+"/"+age+"/"+address;
		return getName()+":"+getAge()+ ":"+getAddress();
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
}// 멤버변수 name 값을 필요한 곳으로 보내주는 함수
