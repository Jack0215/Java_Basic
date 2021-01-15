
public class Multi_Array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//2차원배열
		//1.정방형(모든행의 열크기동일)
		//가.배열선언
		int [][] num; //인트값만 들어가야함. 스트링 넣을거면 스트링 써줘야함
		
		//나.배열생성
		num = new int[2][3];
		
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		num[1][2] =60;
		
//		System.out.println(num[0][2]);
//		System.out.println(num.length); //num.length는 열의 크기임
//		System.out.println(num[0].length); //0번의 열 값이 나옴
		int sum=0;
		for(int i=0; i < num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.println(num[i][j]);
				sum += num[i][j];
			} 
		} System.out.println(sum);
		System.out.println("평균: "+ sum/(num.length *num[0].length));
//			int total=0;
//			for(int[] i:num) {  //타입을 인트의 배열로 맞춰놓음(=>int[]), i에는 3개가 지정되어있음(10,20,30)
//				for(int j:i) {
//					//System.out.println(j);
//					System.out.println(total+=j);
//				} 
//			}
	}
}
