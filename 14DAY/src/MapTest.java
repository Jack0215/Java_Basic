import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 new 해서 따로 저장
		//map,get("one") 하나의 참조변수가 됨
		
		HashMap<String, Person> map = new HashMap<>();
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two", new Person("이순신", 99, "경기"));
		map.put("three", new Person("유관순",45, "제주"));
		
		//get(key)
		System.out.println(map.get("one").getName());
		Person one = map.get("one");
		System.out.println(one.getName());
		
		//keyset이용해서 3명 전체의 이름을 출력하게 작성
		Set<String> keys = map.keySet();
		for(String key : keys){
			Person p = map.get(key);
		System.out.println(p.getName());
		}
		//이터레이터로
//		Iterator<String> iterator = keys.iterator();
//		while(iterator.hasNext()) {
//			String key = iterator.next();
//			System.out.println(key+"\t"+keys);
		
		//키셋에서 이터렝터 받아오고 이터레이터는 스트링
		//해즈 넥스트해서 다음 키 꺼내오고
		//키 이용해서 객체, 함수 호출
			Iterator<String> ite = keys.iterator();
			while(ite.hasNext()) {
				String key = ite.next();
				Person p = map.get(key);
				System.out.println(key+"\t"+keys);	
		
	}
	}
}
