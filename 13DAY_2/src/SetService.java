//import java.util.HashSet;
//import java.util.Set;
//
//public class SetService {
//	public addPersonSet() {
//		
//	}
//	public Set<Person> getPersonSet() {  //5,6 Set<Person>맞춰야함
//		Set<Person> set = new HashSet<Person>();  //set만들고
//		Person kkkk = new Person("유관순", 17, "서울"); //person객체 만들고
//		set.add(new Person("유관순", 17, "서울"));
//		set.add(new Person("이순신", 44, "전라"));
//		set.add(new Person("이순신", 44, "전라"));
//		set.add(kkkk);
//		return set;
//		
//		}
//	public void printPerson(Set<Person> set) {
//		for(Person x : set) {
//			System.out.println(x.getName());
//		}
//		
//		
//	} 
//	
//}

import java.util.HashSet;
import java.util.Set;

public class SetService {
	Set<Person> set = new HashSet<Person>();

	public Set<Person> getSet() {
		return set;
	}
	public void addPersonSet(Person p) {
		set.add(p);
	}

	public Set<Person> getPersonSet() {
		// hash를 쓰면 여기서만 사용가능
		Person kkkk = new Person("유관순", 17, "서울");
		set.add(new Person("유관순", 17, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이재윤", 29, "서울"));
		//
		set.add(kkkk);
		return set;
	}

	public void printPerson(Set<Person> set) {
		for (Person x : set) {
			System.out.println(x);
		}
	}
}