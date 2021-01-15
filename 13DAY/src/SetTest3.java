import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {
	
	public Set<PersonTest> getPersonSet() { 
		PersonTest kkkk = new PersonTest("유관순", 17, "서울");
		Set<PersonTest> set = new HashSet<PersonTest>(); //set만들고 person넣어었음, //set을 new 하고있음
		set.add(new PersonTest("유관순", 17, "서울"));
		set.add(new PersonTest("이순신", 44, "전라"));
		set.add(new PersonTest("이순신", 44, "전라"));
		set.add(kkkk);
		return set;//자료가 다 들어가있는 set을 리턴 //set 타입은 person이 들어있음
	}
//리턴타입은 매개변수의 타입과 동일해야함
	//리턴타입은 매개변수의 부모타입까지 가능
	
	public static void main(String[] args) {
		
	//메인쪽에선 호출해서 셋 받아와야함. 객체 생성해서 받아와야함
		// 1. 클래스이름 복사 (SetTest3) 메인에 붙여넣기
		//2. 생성자 호출 SetTest3는 기본생성자만 갖고있음 그래서 new SetTest해줌
		SetTest3 test = new SetTest3();
		Set<PersonTest> set2 = test.getPersonSet(); //마우스 갖다대면 리턴 타입이 set<person> ,메인쪽에서 받는것도 타입을 맞춰주면 됨
														//Set<PersonTest> 가져오고 set2로 이름 변경
														//28라인 set을 set2로 변경
		System.out.println(set2);
		for(PersonTest x : set2) {
			System.out.println(x.getName());
		}
		Iterator<PersonTest> iterator = set2.iterator();
		while(iterator.hasNext()) {
			PersonTest p = iterator.next();
			System.out.println(p.getName());
		}
	}
}


//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class SetTest3 {
//	//2. 셋을 인자로 받기
//	public Set<PersonTest> getPersonSet(Set<PersonTest> set) { //메인의 set을 받아옴
////		Set<PersonTest> set = new HashSet<PersonTest>(); //set만들고 person넣어었음, //set을 new 하고있음
//		PersonTest kkkk = new PersonTest("유관순", 17, "서울");
//		set.add(new PersonTest("유관순", 17, "서울"));
//		set.add(new PersonTest("이순신", 44, "전라"));
//		set.add(new PersonTest("이순신", 44, "전라"));
//		set.add(kkkk);
//		return set;//자료가 다 들어가있는 set을 리턴 //set 타입은 person이 들어있음
//	}
////리턴타입은 매개변수의 타입과 동일해야함
//	//리턴타입은 매개변수의 부모타입까지 가능
//	
//	public static void main(String[] args) {
//		SetTest3 test = new SetTest3(); //기본 생성자 호출
//		Set<PersonTest> set = new HashSet<PersonTest>(); //비어있는 set 생성, 여기서 아무것도 없는데 이거를 밑에 set으로 이동
//		Set<PersonTest> set2 = test.getPersonSet(set); //빈 set을 함수에 넘김, 함수에서 객체를 담아서 리턴 . 위의 set을 받아옴 이 셋은 47라인 셋과 동일
//		
//		System.out.println(set2);
//		for(PersonTest x : set2) {
//			System.out.println(x.getName());
//		}
//		Iterator<PersonTest> iterator = set2.iterator();
//		while(iterator.hasNext()) {
//			PersonTest p = iterator.next();
//			System.out.println(p.getName());
//		}
//	}
//}
