package Workshop7_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Basic {
public static void main(String[] args) {
	HashMap<String, Integer> num = new HashMap<String, Integer>();
	int sum = 0;
	num.put("1", 1);
	num.put("2", 2);
	num.put("3", 3);
	num.put("4", 4);
	num.put("5", 5);
	num.put("6", 6);
	num.put("7", 7);
	num.put("8", 8);
	num.put("9", 9);
	num.put("10", 10);  //K, V
	
	Set<String> keys = num.keySet();
	for(String key : keys) {
		sum += num.get(key);
		System.out.println(num.get(key));
		
	}System.out.println(sum);
	
	sum=0;
	Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			sum += num.get(key);
		}
		System.out.println(sum);
	
}
}
