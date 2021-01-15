package source;
public class Bird implements Flyer {

	@Override
	public void takeOff (int num) {
		System.out.println("Bird.takeOff");
	}

}
//여기서  int num을 만들어주면 TestOuter4도 바꿔야함