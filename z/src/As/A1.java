package As;
import java.util.HashSet;
import java.util.Set;

public class A1 {

	public Set<Person> getPerson(){
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("유관순", 17, "강원"));
		set.add(new Person("이순신", 48, "미국"));
		set.add(new Person("이재윤", 99, "서울"));
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
