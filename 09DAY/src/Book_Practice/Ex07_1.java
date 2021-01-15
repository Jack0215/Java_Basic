package Book_Practice;

abstract class MyClass {
	int num = 3;
	public MyClass() {}
	public MyClass(int num) {
		this.num = num;
	}
	public void methodA() {
		System.out.println("metodA");
	}
	public abstract void methodB();
}
class MyClassImpl extends MyClass {
	public void print() {
		System.out.println(num);
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassImpl imp = new MyClassImpl();
		imp.print();
		imp.methodB();
	}

}
