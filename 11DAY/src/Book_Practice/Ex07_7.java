package Book_Practice;

interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public void land();
}
public class Ex07_7 {
	public static void main(String[] args) {

		Flyer f = new Flyer() {

			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("takeOff");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("land");
			}
			
		};  //Flyer를 new 해주고 난 뒤 31행의 브레이스 세미콜론을 먼저 찍어야 오버라이딩 가능
		f.fly(); //닫히고 난 다음 함수 호출 해야함
		f.takeOff();
	}

}
