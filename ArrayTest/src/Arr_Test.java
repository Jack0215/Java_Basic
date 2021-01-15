import java.util.Scanner;

public class Arr_Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int value = scan.nextInt();
	int [] arr = {10, 20, 30, 40, 50};
	scan.close();
	
	//print arr 객체가 호출되려면, 새로 만들어져야함
	Search search = new Search();
//	test.searchIndex(arr, 5);
	System.out.println(search.searchIndex(arr,value));
//	System.out.println("sum="+sum);
//	System.out.println("avg="+sum/arr.length);
	}
}
