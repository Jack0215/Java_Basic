
public class Method_Return_exe2 {
	public void sum (int a, int b) {
		System.out.println("sum함수호출===============");
		a=100;
		b=200;
		System.out.println("sum결과"+a+','+b);
		//호출한 곳으로 반환값 지정
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main시작==================");
		int a=10;
		int b=20;
		Method_Return_exe2 test = new Method_Return_exe2();
		test.sum(a, b); 
		System.out.println("main a============"+a);
		}
}