//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Set;
//
//public class MapTest3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashMap<String, Person> map = new HashMap<>();
//		map.put("one", new Person("홍길동", 20, "서울"));
//		map.put("two", new Person("이순신", 30, "경기"));
//		map.put("three", new Person("유관순", 40, "제주"));
//	
//		HashMap<String, Person2> map2 = new HashMap<>();
//		map2.put("one", new Person("홍길동2", 20, "서울2"));
//		map2.put("two", new Person("이순신2", 30, "경기2"));
//		map2.put("three", new Person("유관순2", 40, "제주2"));
//		
//		//어레이리스트를 만들고 (어떤타입으로 설정할지?) 맵을 추가...
//		ArrayList<HashMap<String, Person2>> list1 = 
//				new ArrayList <HashMap <String, Person2>>();
//		list1.add(map);
//		list1.add(map2);
//
//		for ( HashMap<String, Person2> x : list1) {
//			//System.out.println(x);
//			Set<String> keys = x.keySet();
//			//System.out.println(keys);
//			for(String key : keys) {
//				Person2 p = x.get(key);
//				//System.out.println(p);
//				System.out.println(p.getName());
//			}
//		}
//	}
//}
