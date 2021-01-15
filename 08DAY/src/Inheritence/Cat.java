package Inheritence;

public class Cat extends Pet{

	private String gender;	//유일속성
	
	public Cat() {}
	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
//	public String printInfo() {
//		System.out.println("cat printInfo() 호출=========");
//		return name+"\t"+age+"\t"+gender;
	
	
//	//cat class 생성자 수정 this해서 3개를 썼는데 super로 변경
   //		return name + " " + age;
   //	   System.out.println(name+ " " + age+""+gender);
		
		//super. 문장으로 변경
		//생성자 수정
	
   //		System.out.println(super.getName()+super.getAge()+gender);
//	}
	
	
	public void cryCat() {
		System.out.println("야옹~");
	}
	
	public void eatCat() {
		System.out.println("생선 먹기");
	}
	public void sleepCat() {
		System.out.println("새근새근~");
	}
		
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		return super.printInfo()+"\t"+gender;
	}
	
}
