package Workshop4_7;
public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	public Student() {}		
	public Student(String name, int age, int height, int weight) {
		this.name=name;		this.age=age;
		this.height=height;		this.weight=weight;
}
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	} 
	public String studentInfo() {
	return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}


//getWiehgt(배열):평균을 구함
//인자 주고 받고 return 연습
//get info (배열, 이름):Student 메인에서 출력
//홍길동만 출력
