import java.util.Properties;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
		
		Set<String> keys = props.stringPropertyNames();
		for(String key : keys) {
			System.out.println(key);
//			System.out.println(key+"="+props.getProperty(key));
										//key에 해당하는 value값 출력
		}
	}
}
