package Interface;

public abstract class AbstractClass {
	private int num;
	public abstract void a();
	public abstract int b();
	public abstract void c(int x);
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public AbstractClass() {
		super();
	}
	public AbstractClass(int num) {
		super();
		this.num=num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
