
public class Sample02_variable4_1 {//class 블럭(~18)
	public static void main(String[] args) {//메인블럭(~16)
		//자바는 블럭 scope (자바스크립트는 함수scope)
		int test=100;
		{//A블럭
			int num = 10;
			System.out.println(num);
			System.out.println(test);
		}//A블럭
		//System.out.println(num); //블럭밖에서 인식불가 얜 num이 없는것임
		{//B블럭
			int num =20;
		    System.out.println(num);
		    System.out.println(test);
		}//B블럭
		
	}//main블럭
	
}//class블럭

//A블럭와 B블럭은 나뉘어져 있어서 변수의 이름이 같아도 문제가 없음
//test가 중간에 있으면 읽히지 않음. 그 이유는 처리과정이 위에서부터이기 때문