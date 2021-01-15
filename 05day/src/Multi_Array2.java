public class Multi_Array2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//2차원배열
		//2.비정방형(모든행이 열크기 동일)
		
		int [][] num = new int[2][]; //2행
		num[0] = new int[3];
		num[1] = new int[2]; //비정방형 생성
		//초기화

		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		
		for (int[] is : num) {
			for(int x : is) {
				System.out.println(num[0][1]);
			}
		}
	}
}