package Workshop4_7_hard;

public class Student {
	private String name;
	private int age;
	private int Height;
	private int Wieght;
	
	public Student() {}
	public Student(String name,  int age, int Height, int Wieght) {
		this.name=name;
		this.age=age;
		this.Height=Height;
		this.Wieght=Wieght;
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
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWieght() {
		return Wieght;
	}
	public void setWieght(int wieght) {
		Wieght = wieght;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", Height=" + Height + ", Wieght=" + Wieght + "]";
	}
	
}
