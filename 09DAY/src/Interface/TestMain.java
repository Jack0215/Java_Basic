package Interface;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractClass x = new AbstractClass();  //추상메서드를 가지고 있는 부모객체는 생성 불가능
		AbstractClass y = new ConcreteClass(100); //추상메서드를 가지고 있는 자식 객체 생성 가능
		System.out.println(y.getNum());
		y.a();
		int n = y.b();
		y.c(100);;
		
		ConcreteClass2 y2 = new ConcreteClass2();
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y2.b();
		y2.c(100);;
	}

}
