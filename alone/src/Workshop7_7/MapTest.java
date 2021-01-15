package Workshop7_7;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Mobile> map = new HashMap<String, Mobile>();
		double sum =0;
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000.0);
		Mobile m2 = new Mobile("SU6600", "Optimus BLACK", 900000.0);
		Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000.0);
		Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000.0);	
		map.put(m1.getCode(), m1);
		map.put(m2.getCode(), m2);
		map.put(m3.getCode(), m3);
		map.put(m4.getCode(), m4);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Mobile m = map.get(key);
			System.out.println(m.getCode()+"\t"+m.getName()+"\t"+m.getPrice());
			sum += m.getPrice();
		}
		System.out.println("\n합계:"+sum+"\n");
		
		for(String key : keys) {
			Mobile m = map.get(key);
			m.setPrice(m.getPrice()+(m.getPrice()*0.1));
		}
		
		double sum2 = 0;
		for(String key : keys) {
			Mobile m = map.get(key);
			System.out.println(m.getCode()+"\t"+m.getName()+"\t"+m.getPrice());
			sum2 += m.getPrice();
		}
		System.out.println("\n합계:"+sum2);
	}

}
