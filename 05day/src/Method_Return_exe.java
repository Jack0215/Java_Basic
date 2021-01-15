public class Method_Return_exe {
	public int sum (int num1, int num2) {
		System.out.println("sum함수호출1===============");
		int result = num1+num2;
		//System.out.println("sum결과"+result);
		return result;//호출한 곳으로 반환값 지정
	}	
	public int sub (int num1, int num2) {
		System.out.println("sum함수호출2===============");
		int result = num1-num2;
		//System.out.println("sum결과"+result);
		return result;//호출한 곳으로 반환값 지정
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main시작==================");
		int a=10;
		int b=20;
		Method_Return_exe test = new Method_Return_exe();
		int sum_result = test.sum(a, b);
		System.out.println("반환결과"+sum_result);
		int sub_result = test.sub(a, b);
		System.out.println("반환결과"+sub_result);
		}
}