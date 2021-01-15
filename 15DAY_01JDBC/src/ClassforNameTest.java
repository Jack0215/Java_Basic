//클래스 정보 불러오는데 씀

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassforNameTest {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Class c1 = Class.forName("java.lang.Math");
		Field[] fields = c1.getDeclaredFields()	;
		for(Field f : fields) {
			System.out.println("field:"+f.getName()	);
		}
		Method[]methods =c1.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("methods"+m.getName());
		}
		
	}

}
