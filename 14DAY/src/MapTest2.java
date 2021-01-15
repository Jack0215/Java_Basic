//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Set;
//
//public class MapTest2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// Person을 담고있는 arraylist
//		ArrayList<Person> list1 = new ArrayList<Person>();
//		list1.add(new Person("홍길동1", 20, "서울2"));
//		list1.add(new Person("홍길동2", 30, "서울2"));
//		list1.add(new Person("홍길동3", 40, "서울3"));
////
//		ArrayList<Person> list2 = new ArrayList<Person>();
//		list2.add(new Person("유관순1", 20, "서울2"));
//		list2.add(new Person("유관순2", 30, "서울2"));
//		list2.add(new Person("유관순3", 40, "서울3"));
////
////		// 펄슨에 들어가있는 이름을 찍고싶은데 for문을 어떻게 해야할지 생각해볼것!
////		HashMap<String, ArrayList<Person>> map = new HashMap<String, ArrayList<Person>>();
////		map.put("one", list1);
////		map.put("two", list2);
//
//		
//		// 1.맵에서 꺼내려면 arraylist, for문 두번, 맵을 어레이리스트에 넣었음
//		//맵 안에 arraylist 넣어서 출력
//		HashMap<String, ArrayList<Person2>> maps =
//				new HashMap<String, ArrayList<Person2>>();
//		//22,23 값을 추가해줌
//		maps.put("one", list1);
//		maps.put("two", list2);
//		
//		//데이터 출력하기
//		Set<String>keys = maps.keySet();
//		for(String key : keys) {
//			ArrayList<Person2> xx = maps.get(key);
//			for(Person2 p : xx) {
//				System.out.println(p.getName()+"\t"+p.getAge());
//				
//				
//			}
//		}
//		
//		//맵에 펄슨 넣고 어레이에 맵을 넣어서 출력,
//	}
//}
