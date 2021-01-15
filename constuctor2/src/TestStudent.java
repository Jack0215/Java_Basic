
public class TestStudent {
	public static void main(String[] args) {
	//제일 먼저 했던것 클래스 생성
	//기본 생성자 생성
	          //↓맘대로 만들어도 됨
//		Student stu1 = new Student(); //현재 생성자를 바꿨어서 기존의 기본 생성자는 없어짐. 그러므로 연결 될 값이 없음
//		Student stu2 = new Student(); //이를 해결하기 위해 기본생성자 코드를 직접 명시해서 작성해줘야함 //Student의 9행
		//객체 생성
		Student stu1= new Student("홍길동", 100,"강남구");
		Book book1=new Book();
		book1.setName("해리포터");
		book1.setPrice(1000);
		stu1.setBook(book1);
		//학생1번의 책 제목 확인
		Book stu1_book = stu1.getBook();
		System.out.println(stu1_book.getName());
		System.out.println(stu1_book.getPrice());
		
//		System.out.println(stu1.getBook().getName());		
//		System.out.println(stu1.getName());
//		System.out.println(stu1.getAge());
//		System.out.println(stu1.getAddress());
//		Student stu2= new Student("이순신", 200,"서초구");
//		System.out.println(stu2.getName());
//		System.out.println(stu2.getAge());
//		System.out.println(stu2.getAddress());
//		System.out.println(stu1.stuInfo());
//		System.out.println(stu2.getName()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
