
public class Stu_Test {

	String name; // 멤버변수이며 얘네는 객체생성을해야하고, 초기값을 넣어줄 필요가 없음. jdk가 자동으로 넣어줌, 객체의 정보를 저장할거임
	int age;

	public void printinfo() {// 멤버메소드이며 객체생성을 해야함(=new해서 참조 변수 사용), 자동초기화 필요없음, 초기화 해서 쓰면 됨, 얘네들은 동작과 관련있음
		int num = 1; // 로컬변수
		num = num + 10;
		System.out.println("printinfo() num=====" + num);
		System.out.println(name + ":" + age);
	}
	public static void main(String[] args) {
		Stu_Test st_1 = new Stu_Test();
		st_1.name = "홍길동";
		st_1.age = 25;
		st_1.printinfo();

		Stu_Test st_2 = new Stu_Test();
		st_2.name = "에이콘";
		st_2.age = 20;
		st_2.printinfo();
	} // 멤버는 클래스
		// 로컬변수는 함수안에서 생성
}