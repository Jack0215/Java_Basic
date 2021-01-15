
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {10, 20, 30, 40, 50};
		int sum =0;
//		for (int x : num) {
//			numsum += x;
//		}
		
		PrintArr test = new PrintArr();
		test.print(num);
	    sum= test.print(num);
		
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/test.getAvg());
	}
	
}