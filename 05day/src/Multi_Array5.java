
public class Multi_Array5 {
//함수를 처음 만들 때 클래스 단에다 만들어야함. { /* 아무곳에서 접근, 반환값, 함수이름, 받는값 없음 */}
//{void : 반환값 없음, 괄호()안에 받을 인자 타입, 변수}
	public void printArr(int receive) {
		System.out.println("printArr==========호출");
		System.out.println(receive);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.배열 선언
		//데이터타입 []변수명;
		System.out.println("mian 시작===============");
		Multi_Array5 test = new Multi_Array5();
		int [] num;
		
		//2.배열생성
		//변수명 = new 데이터타입[크기];
		num = new int[3];
		
		//3. 배열초기화
		num[0]=10;
		num[1]=20;
		num[2]=30;
		test.printArr(1000); //함수 호출 및 값 전달, 1000을 5번줄 int receive에 저장됨 그 다음 sysout에 의해 실행됨
		System.out.println("main 수행==============");
		//num[3]=40;
////		System.out.println(num[0]);
////		System.out.println(num[1]);
////		System.out.println(num[2]);
//		//System.out.println(num[3]); //없는 방을 사용하려고 해서 에러가 뜸
//		System.out.println("배열크기(길이)"+num.length); //num.length 방의 갯수를 알 수 있음
//		for (int i=0; i<num.length; i++) {
//			System.out.println(">>"+num[i]);
		}
}