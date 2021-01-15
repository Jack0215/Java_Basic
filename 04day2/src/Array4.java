
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] num;
//		num = new int[4];
//		num[0]=1;		num[1]=2;		num[2]=3;
		
		int [] num = {1,2,3};
		
//		//에러나는 경우	
//		int [] num;
//		num = {1,2,3}; //컴파일 에러 발생
		
		for(int x : num) {
			System.out.println("정수 배열 값 : " + x);
		}
//		String [] name;
//		name = new String[4];	
//		name[0]="홍길동";		name[1]="이순신";		name[2]="유관순";
		String [] name = {"홍길동","이순신"};
		for(String s : name) {
			System.out.println("문자열 배열 값: " +s);
		}
	}
}
