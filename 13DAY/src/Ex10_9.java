import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonA{
	String name;
	int age;
	public PersonA (String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
class PersonAComp implements Comparator<PersonA>{

	@Override
	public int compare(PersonA o1, PersonA o2) {
		// TODO Auto-generated method stub
		int result = 1;
		if( o1.age >= o2.age)result=-1;
		return result;
	}
	
}

public class Ex10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PersonA>list=new ArrayList<PersonA>();
		list.add(new PersonA ("홍길동", 20));
		list.add(new PersonA ("이순신", 15));
		list.add(new PersonA ("유관순", 99));
		list.add(new PersonA ("강감찬", 32));
		
		Collections.sort(list, new PersonAComp());
		for (PersonA person : list) {
			System.out.println(person);
		}
	}

}
