
public class Multi_Array6 {
//함수를 처음 만들 때 클래스 단에다 만들어야함. { /* 아무곳에서 접근, 반환값, 함수이름, 받는값 없음 */}
//{void : 반환값 없음, 괄호()안에 받을 인자 타입, 변수}
	public void printArr(int[] num) {
		System.out.println("printArr==========호출");
		for (int i=0; i<num.length; i++) {
			System.out.println(">>"+num[i]);
		}
		for (int printForEach : num) {
			System.out.println(printForEach);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.배열 선언
		// 데이터타입 []변수명;
		System.out.println("mian 시작===============");
		Multi_Array6 test = new Multi_Array6(); //함수 호출을 위해 객체 생성 test.pri~~위에 만들어도 상관없음, 함수 호출 준비 끝
		int[] num; //배열선언

		// 2.배열생성
		// 변수명 = new 데이터타입[크기];
		num = new int[3]; //배열만들기

		// 3. 배열초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;

		int[] num_1;

		// 2.배열생성
		// 변수명 = new 데이터타입[크기];
		num_1 = new int[3];

		// 3. 배열초기화
		num_1[0] = 10;
		num_1[1] = 20;
		num_1[2] = 30;

		int[] printForEach;

		// 2.배열생성
		// 변수명 = new 데이터타입[크기];
		printForEach = new int[3];

		// 3. 배열초기화
		printForEach[0] = 100; 
		printForEach[1] = 200;
		printForEach[2] = 300;

		test.printArr(num); // 함수 호출 및 값 전달, 1000을 5번줄 int receive에 저장됨 그 다음 sysout에 의해 실행됨
		test.printArr(num_1);
		test.printArr(printForEach);
		System.out.println("main 수행==============");

	}
}