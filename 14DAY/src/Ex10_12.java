import java.util.Properties;

public class Ex10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		prop.setProperty("one", "홍길동");
		prop.setProperty("two", "이순신");
		prop.setProperty("three", "유관순");
		
		System.out.println(prop.getProperty("one"));
		System.out.println(prop.getProperty("two"));
		System.out.println(prop.getProperty("three"));
	}

}
