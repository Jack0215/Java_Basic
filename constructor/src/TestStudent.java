
public class TestStudent {
	public static void main(String[] args) {
	//제일 먼저 했던것 클래스 생성
	//기본 생성자 생성
	          //↓맘대로 만들어도 됨
		Student stu1 = new Student(); //default 생성자 호출 ( Student.java에서 기본 생성자 값을 고쳤음)
		Student stu2 = new Student(); //default 생성자 호출
		System.out.println(stu1.getName());  //이렇게 해주는 이유 : 1.생성자에서 미리 저장해두면 안바꾸고 만들어도 되기 때문
		System.out.println(stu2.getName());  //                2.객체만들어서 객체 변수값을 초기화 할 때 씀
		//new 하면 student라는 객체가 생성이 되면서 이전에 만들었던(여기선  sudent)게 호출이됨(name, age, address)
		//                                        ㄴ 혹은 초기값(student의)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//객체를 만들어줌 ↓(즉, name, age, address를 저장 할 수 있는 공간을 만들어줌)
//	 Student stu1 = new Student();
//	 Student stu2 = new Student();
//	 Student stu3 = new Student();
//	
//	 stu1.name ="홍길동"; //참조변수.멤버이름
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
