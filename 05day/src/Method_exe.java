
//sum함수만드는법
public class Method_exe {
	public void sum(int num1, int num2) {
//		System.out.println("sum함수호출===============");
		int result= num1+num2;
		System.out.println("sum결과"+result);
	}
	public void sub (int num1, int num2) {
		int result=num1-num2;
		System.out.println("sub결과"+result);
	}
	
	public void mux(String num1, int num2) {
		int result = Integer.parseInt(num1)*num2;
		System.out.println("mux결과"+result);
	}
	public void div(int num1, int num2) {
//		System.out.println("div()호출================");
		int result = num1/num2;
		System.out.println("div결과"+result);
	}

//	public int[][] printMuxArr(int[][] arr) {
//		//2차원 배열
//		
//		return arr;
//	}
//	public Book printBook(Book oneBook) {
//		
//		return oneBook;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main시작");
		int a=10;
		int b=20;
		Method_exe test = new Method_exe();
		test.sum(a, b);
		test.sub(a, b);
		test.mux("10", b);
		test.div(b, a);
		
	}
}
