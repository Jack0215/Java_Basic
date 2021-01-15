package Interface;

public class ConcreteClass extends AbstractClass{
	
	public ConcreteClass() {
		super();
	}
	public ConcreteClass(int num) {
		super(num);
	}
	
	@Override
	public void a() {
		System.out.println("A");
		
	}
	@Override
	public int b() {
		System.out.println("B");
		return 0;
	}
	@Override
	public void c(int x) {
		System.out.println("C");		
	}
}
