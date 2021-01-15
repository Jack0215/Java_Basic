package Workshop7_7;
import java.util.HashMap;
import java.util.Set;
public class MapTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		HashMap<String, Mobile> map = new HashMap<>();
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000.0);
		Mobile m2 = new Mobile("SU6600", "Optimus BLACK", 900000.0);
		Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000.0);
		Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000.0);		
		map.put(m1.getCode(),m1);
		map.put(m2.getCode(),m2);
		map.put(m3.getCode(),m3);	
		map.put(m4.getCode(),m4);		
		Set<String> keys = map.keySet(); //setㅌ입의 strㅗㄹ 리턴
		for(String key : keys) {
			Mobile m =  map.get(key);
			System.out.println(m.getCode()+"\t"+m.getName()+m.getPrice());
			sum +=m.getPrice();
		}
		System.out.println("합계 :" + sum);
		//총액 10%증가 : price + (price*0.1)
		//setPrice 함수 , set,get 함수를 써야함
		System.out.println();
		for(String key : keys) {
			Mobile m =  map.get(key);
			m.setPrice(m.getPrice()+(m.getPrice()*0.1));
			System.out.println(m.getCode()+"\t"+m.getName()+m.getPrice());
		}
		System.out.println("\n가격변경 후");		
		double sum2=0.0;
		for (String key: map.keySet()) {
			Mobile m = (Mobile)map.get(key);
			System.out.println(m.toString());
			sum2 +=m.getPrice();
		}
		System.out.println("합계 :" + sum2); } }
