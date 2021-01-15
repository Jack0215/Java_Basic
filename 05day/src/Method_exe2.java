
public class Method_exe2 {
	public void  printArr(String[] arr) {
		System.out.println();
		for ( int i = 0; i <arr.length; i++) {
			System.out.println("printArr>>"+arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_exe2 test = new Method_exe2();
		String [] StringArr = new String[2];
		StringArr[0]="홍길동";
		StringArr[1]="이순신";
		test.printArr(StringArr);
		System.out.println("main종료========");
	}
}

