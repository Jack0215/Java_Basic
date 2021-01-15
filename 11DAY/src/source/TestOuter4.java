package source;
public class TestOuter4 {

	public static void main(String[] args) {
		
		//익명클래스(anonymous class) ==>인터페이스 사용시 많이 사용.
		
		//1. 일반적인 방법==> 이름있는 클래스로 처리
		Flyer b = new Bird();
		b.takeOff(100); //int값 100 추가
		//1번을 2번으로 변경가능
		
		//2. 익명클래스 ==> SuperMan 기능을하는 클래스
//		인터페이스명 변수명  = new 인터페이스명() {
//			//메서드 오버라이딩
//			
//		};							          //↓구현부를 직접 장성
		Flyer b2 = new Flyer(){  //인터페이스 옆에 브레이스를 달아 바로 구현하겠다는 뜻
			@Override            //바로 오버라이딩 해버림, new했으면 오버라이딩 해야함 안하면 실행 안됨
			public void takeOff(int num) { //int num 추가
				System.out.println("SuperMan.takeOff  "+num);
			}
		}; //쓸 때 주의할것 : 여기까지가 명령어이므로 끝날 때 브레이스 뒤에 세미콜론 붙여야됨
		//인터페이스를 뉴한ㄴ것임(원래 인터페이스는 뉴가 안됨)
		//23행까지 테이크오프가 오버라이딩된 플라이어 객체가 만들어진것임
		//한번 사용되고 끝남
		b2.takeOff(100); //슈퍼맨테이크오프가 출력됨 
			
		
		Flyer b3 = new Flyer() {
			@Override            //int num 추가
			public void takeOff(int num) {  //↓출력문이 위에꺼랑 다름
				System.out.println("Airplane.takeOff");
			}
		};
		b3.takeOff(100);   //int값 100 추가
	}//end main

}
