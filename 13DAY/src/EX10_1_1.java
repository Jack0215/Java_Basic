import java.util.Date;

class Box{
	Object obj;
	public void setValue(Object obj) {
		this.obj=obj;
	}
	public Object getValue(){
		return obj;
	}
}
public class EX10_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.setValue("Hello");
		String str = (String)b.getValue();
		System.out.println(str);
		
		Box b2 = new Box();
		b2.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println(d);
	}

}
