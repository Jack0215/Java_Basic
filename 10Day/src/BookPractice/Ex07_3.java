package BookPractice;

interface Vehicle{
	
	int num = 100; //public static fianl을 자동으로 붙여줌
	public abstract void speed();
	public default void start() {
		System.out.println("Start~");
	}
	public static void stop() {
		System.out.println("stop");		
	}
}
class Car implements Vehicle{
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("100km");
	}
}

public class Ex07_3 {
public static void main(String[] args) {
	Car c = new Car();
	c.start();
	c.speed();
	Vehicle.stop();
	
	
	};
}

