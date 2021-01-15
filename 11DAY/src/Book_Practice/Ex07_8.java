package Book_Practice;
import java.util.Arrays;
import java.util.Comparator;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
	
	class PersonComp implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int result = 1;
			if ( o1.age >= o2.age) result=-1;
			return result;
		}
		
	}
public class Ex07_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("홍길동",20);
		Person p1 = new Person("이순신",44);
		Person p2= new Person("유관순",18);
		Person p3 = new Person("강감찬",66);
		Person [] ps = {p, p1, p2, p3};
		
		Arrays.sort(ps, new PersonComp());
		for(Person person : ps) {
			System.out.println(person);
		}
	}

}
