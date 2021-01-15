
public class TestStudent {
	public static void main(String[] args) {
	
	//객체를 만들어줌 ↓(즉, name, age, address를 저장 할 수 있는 공간을 만들어줌)
	 Student stu1 = new Student();
	 Student stu2 = new Student();
	 Student stu3 = new Student();
	
	 stu1.name ="홍길동"; //참조변수.멤버이름
	 stu1.age = 20;    //Student calss 에 있는 데이터 초기값은 메인단에서 설정
	 stu1.address = "서울";
	 
	 stu2.name ="이순신";
	 stu2.age = 44;
	 stu2.address = "경남";
	 
	 stu3.name ="유관순";
	 stu3.age = 19;
	 stu3.address = "충남";
	 
	 System.out.println(stu1.name);
	 System.out.println(stu1.age);
	 System.out.println(stu1.address);
	 
	 System.out.println(stu2.name);
	 System.out.println(stu2.age);
	 System.out.println(stu2.address);
	 
	 System.out.println(stu3.name);
	 System.out.println(stu3.age);
	 System.out.println(stu3.address);
 	}
}
