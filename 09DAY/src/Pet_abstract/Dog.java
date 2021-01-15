package Pet_abstract;
public class Dog extends Pet{	
	private String gender; //유일속성
	private String color; //유일속성	
	public Dog(String name, int age,String gender, String color) {
		super(name, age, gender);
		this.color = color;
	}
	//개에 관련된 동작 함수 
	public void cryDog() {
		System.out.println("멍멍~");
	
	}

	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("dog cry");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eat");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("dog sleep");
	}
	public void eatDog() {
		System.out.println("사료 먹기");
	}
	public void sleepDog() {
		System.out.println("쿨쿨~");
	} 
	//다른 애완동물에 없는 기능 가정... 
	public void runDog() {
		System.out.println("발발~");
	}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String printInfo() {
		System.out.println("dog printInfo()호출==============");
		return name+"\t"+age+"\t"+gender+ "\t"+color;
	}
	
}
