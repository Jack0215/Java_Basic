

public class Person {
	//멤버변수 3개
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
		super();
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
//	}
}

