
public class MultiArray01 {

	public static void main(String[] args) {
	/*	//2.비정방형(모든행의 열크기 동일)
		int [][]num = new int[2][]; //2행
		num[0]=new int[3];
		num[1]=new int[2];//비정방형 생성
		//초기화
		num [0][0]=10;
		num [0][1]=20;
		num [0][2]=30;
		num [1][0]=40;
		num [1][1]=50;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println(num [i][j]);
			}
		}		
			for(int[] is: num) {
			for(int x: is) { 
				
			}
		}

		String [][] name = { {"홍길동","이순신"} ,{"유관순"}};
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name[i].length;j++) {
				System.out.println("name[" + i + "]["+ j + "]"+ name[i][j]);
			}
		}*/
		int []num;
		num = new int[] {1,2,3};
		System.out.println(num[0]);
		for (int x:num) {
			System.out.println(x);
		}
	}
	

}
