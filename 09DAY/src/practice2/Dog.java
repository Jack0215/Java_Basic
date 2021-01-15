//package practice2;
//public class Dog extends Pet{	
//	private String gender; //유일속성
//	private String color; //유일속성	
//	public Dog(String name, int age,String gender, String color) {
//		super(name, age);
//		this.gender = gender;
//		this.color = color;
//	}
//	//개에 관련된 동작 함수 
//	public void cryDog() {
//		System.out.println("멍멍~");
//	}
//	
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return super.getName();
//	}
//	@Override
//	public void setName(String name) {
//		// TODO Auto-generated method stub
//		super.setName(name);
//	}
//	@Override
//	public int getAge() {
//		// TODO Auto-generated method stub
//		return super.getAge();
//	}
//	@Override
//	public void setAge(int age) {
//		// TODO Auto-generated method stub
//		super.setAge(age);
//	}
//	public void eatDog() {
//		System.out.println("사료 먹기");
//	}
//	public void sleepDog() {
//		System.out.println("쿨쿨~");
//	} 
//	//다른 애완동물에 없는 기능 가정... 
//	public void runDog() {
//		System.out.println("발발~");
//	}
//		
//	
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public String printInfo() {
//		System.out.println("dog printInfo()호출==============");
//		return name+"\t"+age+"\t"+gender+ "\t"+color;
//	}
//	
//}
