
public class Test_2_While1_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		while( n <= 10) {
			System.out.println(n+"HelloWorld");
			n++;
			if(n==8)break;
		}
		System.out.println(n);
	}
	
//	continue 
//	public static void main(String[] args) {
//		for(int i=0; i<5; i++) {
//			System.out.println("hello1 "+i);
//			System.out.println("hello2 "+i);
//			if(i==3)continue;
//			System.out.println("hello3 "+i);
//			System.out.println("hello4 "+i);
//		}
//	public static void main(String[] args) {
//		A:
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.println(i+"\t"+j);
//				if(i==3)break A;
//			}
//		}
//	 }
}
