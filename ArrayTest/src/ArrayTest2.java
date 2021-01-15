public class ArrayTest2 {

	
	public static void main(String[] args) {
		
		int sum =0;
//		for (int x : num) {
//			numsum += x;
//		}		
		PrintArr test = new PrintArr();
		Creat_Array arr = new Creat_Array();
		int [] arrT = new Creat_Array().Arr_create();
		sum = test.print(arrT);
	    Arr_Avg test2 = new Arr_Avg();
		System.out.println("sum="+sum);
		System.out.println("avg="+test2.calc_Avg(arrT));
	}
}