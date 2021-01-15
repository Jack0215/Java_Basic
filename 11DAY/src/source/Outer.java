package source;
public class Outer {

	//멤버변수
	public int n =10;
	protected int n2 =20;
	int n3 =30;
	private int n4 =40;
	static int n5 =50;
	//멤버 메서드
	public void x() {}
	
	// 멤버 inner클래스, 선언 된 위치가 클래스 위치랑 같음
	class Inner{
		int k =10;
		static final int NUM =20; //상수 가능
		//static int k2 =20;
		public void info() {  //이너클래스가 인포라는 함수를 가지게 해놨음
			System.out.println(n);   //아우터에 있는거랑 이너랑 있는거 다 찍어보게 해놨음
			System.out.println(n2);	 //
			System.out.println(n3);
			System.out.println(n4);  //private도 접근 가능
			System.out.println(n5);
			System.out.println(k);
			System.out.println(NUM);
			
		}
		
	}//end Inner
	//14~29행 이너클래스가 13행 멤버클래스에 생성되어있으면 이렇게 선언해야함
	//1. Outer에서 Inner생성
	
	
	public void innerCreate() {
		Inner i = new Inner();
		i.info();
	}
}