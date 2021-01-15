package Workshop4;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	public Student() {}
	
	public Student(String name, int age, int height, int weight) {
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	}
	
	public String getName() {  //다른 클래스에서 사용가능 하도록 설정
		return name;
	}
	public void setName(String name) { //
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
}
