import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {
	
//	public Set<Person> getPersonSet() { 
//		Set<Person> set = new HashSet<Person>(); 
//		Person kkkk = new Person("유관순", 17, "서울");
//		set.add(new Person("유관순", 17, "서울"));
//		set.add(new Person("이순신", 44, "전라"));
//		set.add(new Person("이순신", 44, "전라"));
//		set.add(kkkk);
//		return set;
//	}  8~14라인까지 SetService class 의 getPersonSet() 호출로 리턴 받아서 사용
	public static void main(String[] args) {
		
		SetService test = new SetService();
		Set<Person> set = test.getPersonSet(); //자료에 담긴 set 받아오기		
		
		
		
		test.printPerson(set);
		System.out.println("===============");
		test.addPersonSet(new Person("이재윤121",29,"서울"));
		test.printPerson(set);
//18-20 라인 SetService class의 printPerson()함수에 set을 넘겨서 출력

			
		}
	}
