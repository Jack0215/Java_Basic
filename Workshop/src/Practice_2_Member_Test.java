
public class Practice_2_Member_Test {//class블럭 ~
	//멤버, 인스턴스변수 - class 블럭에 선언
	//선언 후 초기화 불필요 - 사용시 자동 초기화 됨
	//함수 안에서 new로 필요한 만큼 객체 생성 사용
	static int num=10; //초기값을 줌, 초기값 안주면 각 타입의 초기값으로 설정됨
					   // static은 객체생성없이 사용가능
					   //class 이름.변수이름(20행) 생성
	String name="홍길동";
	String phoneNumber;
	String address;
	char gender; 
	public void printinfo() {//맴버메소드(함수) 객체마다 소유
		System.out.println(name+""+phoneNumber+""+address);//
	}
	public static void main(String[] args) {// 메인블럭, 함수임
//		// TODO Auto-generated method stub
//		//로컬변수(메소드/함수에 선언된 변수), 선언+초기화한 후에 사용
//		
		int num=10;
//		System.out.println("로컬변수"+num);
//		System.out.println(Member_Test.num); //static변수의 사용, 객체생성 필요없음
//		Member_Test mem5= new Member_Test();//객체생성, new 생성
//        System.out.println(mem5.name);//에러남. 객체생성이 필요함
//        
		Practice_2_Member_Test mem1= new Practice_2_Member_Test();//객체생성
		mem1.name="홍길동";//생성객체 접근 name멤버변수 저장
		System.out.println(mem1.name); //생성객체 멤버변수 사용
		Practice_2_Member_Test mem2= new Practice_2_Member_Test();//객체생성
		mem2.name="이순신";//생성객체 접근 name멤버변수 저장
		mem1.printinfo(); //함수가 객체마다 다르게 돌아가고 있는 것을 확인 할 수 있음
		mem2.printinfo();
		System.out.println(mem2.name); //생성객체 멤버변수 사용
		Practice_2_Member_Test mem3= new Practice_2_Member_Test();//객체생성
		mem3.name="이철원";//생성객체 접근 name멤버변수 저장
		Practice_2_Member_Test mem4= new Practice_2_Member_Test();//객체생성
		mem4.address="서울";//생성객체 접근 name멤버변수 저장
		System.out.println(mem3.name+"주소는"+mem4.address); //생성객체 멤버변수 사용	
		//class에 들어가있는 애들은 객체생성해서 써야하고
		//main안에 들어가있는 애들은 new를 생성해야함
		//static으로 설정된 애들은 바로 클래스이름.변수이름
	}// 메인블럭
}//class블럭
