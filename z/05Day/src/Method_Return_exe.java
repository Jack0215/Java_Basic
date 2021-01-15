
public class Method_Return_exe {
public void sum(int a, int b) {//리턴값 타입 지정
	System.out.println("sum() 호출 =====");
	a=100;
	b=200;
	System.out.println("sum num===== "+a+ "\t"+ b);
//	int result = num1+num2;
//	System.out.println("sum 결과는 "+ result);
//	return result;//호출한 곳으로 반환값 지정
	
}/*
public int sub(int numa, int numb) {
	System.out.println("sub() 호출=====");
	int result = numa -numb;
//	System.out.println("sub결과는 "+ result);
	return result;
}
public void mux(String num1, int num2) {
	System.out.println("mux() 호출====");
	int result = Integer.parseInt(num1)*num2;
	System.out.println("mux()결과는"+result);
	
}
public void div(int num1, int num2) {
	System.out.println("div() 호출====");
	int result = num1/num2;
	System.out.println("div()결과는"+result);
}
public void PrintArr(String [] arr) {
	System.out.println("arr() 호출====");
	for(int x =0; x<arr.length;x++) {
		System.out.println("printArr()>>"+arr[x]);
	}
}
public void avg(int num1, int num2) {
	System.out.println("avg() 호출=====");
	int result = (num1+num2) / 2;
	System.out.println("avg()결과는"+result);
}*/
	public static void main(String[] args) {
		
		System.out.println("main 시작 =====");
		int a = 10;
		int b = 20;
		String c = "30";
		
		String [] stringArr;
		stringArr = new String[2];
		
		stringArr[0] = "홍길동";
		stringArr[1] = "이순신";
		
		
//		int [] num = new int[2];
//		num [0][0]=10;
//		num [0][1]=20;
		
		Method_Return_exe test = new Method_Return_exe(); //객체생성
		test.sum(a, b);
		System.out.println("main a====="+a);
//		int sum_result = test.sum(a, b);		
//		int sub_result = test.sub(b, a);
//		System.out.println("sum반환결과= "+sum_result);
//		System.out.println("sub반환결과="+sub_result);
//		
//		test.mux(c,a);
//		test.div(b,a);
//		test.PrintArr(stringArr);
//		test.avg(a,b);
		System.out.println("main 종료=====");
		
		

	}

}
