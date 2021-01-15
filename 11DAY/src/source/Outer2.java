package source;// 로컬 inner클래스실습
public class Outer2 {
	    //멤버변수
		public int n =10;
		protected int n2 =20;
		int n3 =30;
		private int n4 =40;
		static int n5 =50;
		//멤버 메서드
		public void x() {
			int xxx =10; //로컬변수
			
			class Inner{
				int k =10;
				static final int NUM =20; //상수 가능
				//static int k2 =20;
				public void info() {
					System.out.println(n);
					System.out.println(n2);
					System.out.println(n3);
					System.out.println(n4);  //private도 접근 가능
					System.out.println(n5);
					System.out.println(k);
					System.out.println(NUM); //12~24 로컬변수자리에
				}
				
			}//end Inner
			
			Inner xyz = new Inner();
			xyz.info();
			
		}//end x()
}//end class
