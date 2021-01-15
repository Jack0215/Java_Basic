import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("one", "홍길동");
		map.put("one", "강감찬");
		
		map.put("name", "홍길동");
		map.put("name", "김길동");
		map.put("age", "20");
		map.put("address", "서울");
		map.put("email", null);

//		System.out.println("이름은 :" + map.get("name"));
//		System.out.println("나이는 :" + map.get("age"));
//		System.out.println("주소는 :" + map.get("address"));
//		System.out.println("email은 :" + map.get("email"));
//
//		System.out.println("데이터가 크기(길이)?" + map.size());
//		System.out.println("데이터가 비어있냐?" + map.isEmpty());
//		System.out.println("age 키가 있냐?:" + map.containsKey("age"));
//		System.out.println("홍길동 값이 있냐?" + map.containsKey("홍길동"));
//		System.out.println("age 키에 해당하는 데이터 삭제");
//		map.remove("age");
//		System.out.println("전체 데이터 출력:" + map);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+"="+map.get(key));
			
		} System.out.println("==============");
			//받아온 키 들 중에서 이터레이터 가능
			Iterator<String>ite=keys.iterator();
			while(ite.hasNext()) {
				String key = ite.next();
				System.out.println(key+"\t"+map.get(key));
			}
		}
	}


