
public class Method_exe {
public void sum(int num1, int num2) {
	System.out.println("sum() 호출 =====");
	int result = num1+num2;
	System.out.println("sum 결과는 "+ result);
}
public void sub(int numa, int numb) {
	System.out.println("sub() 호출=====");
	int result = numa -numb;
	System.out.println("sub결과는 "+ result);
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
public void PrintMultiArr(int [][] MultiArr) {
	System.out.println("MultiArr() 호출=====");
	for(int i = 0; i<MultiArr.length;i++) {
		for (int j=0; j<MultiArr[i].length;j++) {
			System.out.println("MultiArr()>>"+ MultiArr[i][j]);
		}
	}
}
public void avg(int num1, int num2) {
	System.out.println("avg() 호출=====");
	int result = (num1+num2) / 2;
	System.out.println("avg()결과는"+result);
}

	public static void main(String[] args) {
		
		System.out.println("main 시작 =====");
		int a = 10;
		int b = 20;
		String c = "30";
		
		String [] stringArr;
		stringArr = new String[2];
		
		stringArr[0] = "홍길동";
		stringArr[1] = "이순신";
		
		
		int [][] num;
		num = new int[1][2];
		num [0][0]=10;
		num [0][1]=20;

		
		
		Method_exe test = new Method_exe(); //객체생성
		test.sum(a, b);
		test.sub(b, a);
		test.mux(c,a);
		test.div(b,a);
		test.PrintArr(stringArr);
		test.avg(a,b);
		test.PrintMultiArr(num);
		System.out.println("main 종료=====");
		
		

	}

}
