
public class Fish {

	private String name;
	private int age;
	private String gender;
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	private double tailSize; //Fish에만 존재하는 속성 가정
	
	//동작
	public void swimFish() {
		System.out.println("어푸어푸~");
	}
	
	public Fish(String name, int age, double tailSize, String gender) {
		super();
		this.gender=gender;
		this.name = name;
		this.age = age;
		this.tailSize = tailSize;
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
	//Fish에만 필요한 클래스 유일 함수
	public double getTailSize() {
		return tailSize;
	}
	//Fish에만 필요한 클래스 유일 함수
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	
	
	
}
