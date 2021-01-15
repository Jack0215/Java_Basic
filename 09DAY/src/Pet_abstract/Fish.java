package Pet_abstract;
public class Fish extends Pet{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("fish cry");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("fish eat");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("fish sleep");
	}
	private String gender; //유일속성
	private double tailSize; //Fish에만 존재하는 유일속성
	
	public Fish(String name, int age, String gender, double tailSize) {
		super(name, age, gender);

		this.tailSize = tailSize;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//동작
	public void swimFish() {
		System.out.println("어푸어푸~");
	}	
		
	//Fish 클래스 유일 함수
	public double getTailSize() {
		return tailSize;
	}
	//Fish 클래스 유일 함수
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	public String printInfo() {
		System.out.println("fish printInfo()호출==============");
		return name+"\t"+age+"\t"+gender+ "\t"+tailSize;
	}
	
	
	
}
