
public class Teacher {
	public void sum(int a, int b) {// 리턴값 타입 지정
		System.out.println("sum()호출===========");
		a=100;
		b=200;
		System.out.println("sum num========"+ a + ": "+ b);
	}
	public int sub(int num1, int num2) {
		System.out.println("sub()호출===========");
		int result= num1- num2;
		return result;
	}
	public int mux(String num1, int num2) {
		System.out.println("mux()호출===========");
		int result= Integer.parseInt(num1)*num2;
		return result;
	}
	public double div(int num1, int num2) {
		System.out.println("div()호출===========");
		double doubleResult= num1/num2;
		return doubleResult;
	}
	public String[] printArr(String[] arr) {
		System.out.println("printArr()호출===========");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("printArr()>>" + arr[i]);
		}
		return arr;
	}
	public String[][] printMuxArr(String[][] arr){
		// 2차원 배열작업 
		System.out.println("2차원 배열 작업 ===========");
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j <arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		return arr;
	}
	public Book printBook(Book oneBook) {
			
		return oneBook;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main시작============");
		int a=10;
		int b=20;
		Teacher  test= new Teacher();
		//int sum_result= test.sum(a, b);//호출 10, 20
		 test.sum(a, b);//호출 10, 20
		 System.out.println("main a======"+ a);
		int sub_result= test.sub(a, b);
		test.mux("10", b);
		test.div(b, a);
		String [] StringArr= new String[2];
		StringArr[0]="홍길동";
		StringArr[1]="이순신";
		String [][] StringArr2= new String[2][2];
		StringArr2[0][0]="홍길동";
		StringArr2[0][1]="이순신";
		StringArr2[1][0]="홍길동";
		StringArr2[1][1]="이순신";
		test.printMuxArr(StringArr2);
		//test.printArr(StringArr);
		System.out.println("main종료=========");
	}
}


