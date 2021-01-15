package Inheritence;

 	class Super {
 		public int num1=1;
 		protected int num2=2;
 		int num3=3;
 		private int num4=4;
 		
 		public int getNum4() {
 			return num4;
 		}
 	}
 	
 	class Sub extends Super{
 		private int num5;
 		
 		public void print() {
 			System.out.println(num1);
 			System.out.println(num2);
 			System.out.println(num3);
 			System.out.println(getNum4());
 			System.out.println(num5);
 		}
 	}
public class Ex06_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.print();
	}

}
