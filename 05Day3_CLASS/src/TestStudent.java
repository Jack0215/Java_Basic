
public class TestStudent {
	
	public static void main(String[] args) {
	
	Student stu1 = new Student();
	//stu1.name="홍길동"; = 참조변수.함수이름
	stu1.setName("홍길동");
	String name = stu1.getName();
	System.out.println(name);
	
	stu1.setAge(19);
	int age = stu1.getAge();	
	System.out.println(age);
	
	stu1.setAddress("서울");
	String address = stu1.getAddress();
	System.out.println(address);
    //간단한 버전 ↓
	stu1.setName("홍길동");
	stu1.setAge(19);
	stu1.setAddress("서울");
	System.out.println(stu1.getName());
	System.out.println(stu1.getAge());
	System.out.println(stu1.getAddress());
	System.out.println(stu1.stuInfo());
	System.out.println(stu1);
	Student stu2 = new Student();
	//stu1.name="홍길동";
	stu2.setName("이순신");
	stu2.setAge(40);
	stu2.setAddress("강남");
	System.out.println(stu2);
	stu1 = stu2; //둘 다 객체 2번을 갖게 됨
	System.out.println(stu1);
	System.out.println(stu2);
	
	
	
	
	//객체를 만들어줌 ↓(즉, name, age, address를 저장 할 수 있는 공간을 만들어줌)
//	 Student stu1 = new Student();
//	 Student stu2 = new Student();
//	 Student stu3 = new Student();
//	
//	 stu1.name ="홍길동"; //참조변수.멤버변수
//	 stu1.age = 20;
//	 stu1.address = "서울";
//	 
//	 stu2.name ="이순신";
//	 stu2.age = 44;
//	 stu2.address = "경남";
//	 
//	 stu3.name ="유관순";
//	 stu3.age = 19;
//	 stu3.address = "충남";
//	 
//	 System.out.println(stu1.name);
//	 System.out.println(stu1.age);
//	 System.out.println(stu1.address);
//	 
//	 System.out.println(stu2.name);
//	 System.out.println(stu2.age);
//	 System.out.println(stu2.address);
//	 
//	 System.out.println(stu3.name);
//	 System.out.println(stu3.age);
//	 System.out.println(stu3.address);
 	}
}
