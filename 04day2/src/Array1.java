
public class Array1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num [];
//		num = new int [5];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
//		num[3]=100;
//		num[4]=80;
//		int sum=0;
//		System.out.println("배열길이(크기)"+num.length);
//		for(int i=0; i<num.length; i++) {
////		for(int i=0; i<=num.length; i++) { //5번은 없기 때문에 에러가 남
//			//System.out.println(">>"+num[i]);
//			sum=sum+num[i];
//		}
//		//System.out.println(num[4]);
//		System.out.println("총합="+sum);
//		System.out.println("평균="+sum/num.length);
//	}
	
	//foreach문
	public static void main(String[] args) {
		int num [];
		num = new int [5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=100;
		num[4]=80;
		int sum=0;
		for(int x: num) { //num : 돌려야할 변수명, x  : 방에 들어가야할 값
			System.out.println(x);
			sum = sum + x;
		}
		System.out.println("총합은"+sum);
	}
}
