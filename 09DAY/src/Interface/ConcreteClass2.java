package Interface;

public class ConcreteClass2 extends AbstractClass{
	
	public ConcreteClass2() {
		super();
	}
	public ConcreteClass2(int num) {
		super(num);
	}
	
	@Override
	public void a() {
		System.out.println("ConcreteClass2A");
		
	}
	@Override
	public int b() {
		System.out.println("ConcreteClass2B");
		return 0;
	}
	@Override
	public void c(int x) {
		System.out.println("ConcreteClass2C");		
	}
}
