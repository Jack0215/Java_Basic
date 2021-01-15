import java.util.Scanner;

public class Method_mytest {
	
public void sum(int num1, int num2) {
	System.out.println("sum()호출=====");
	int result = num1+num2;
System.out.println("sum 결과는"+result);
}
public void sub(int num1, int num2) {
	System.out.println("sub()호출====");
	int result = num1-num2;
	System.out.println("sub결과는"+result);
}
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수를 입력하시오.");
		int a = scan.nextInt();
		
		System.out.println("2.정수를 입력하시오.");
		int b = scan.nextInt();
		
		Method_mytest test = new Method_mytest();
		test.sum(a, b);
		test.sub(a, b);
		

	}

}
