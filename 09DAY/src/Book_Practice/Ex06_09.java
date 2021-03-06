package Book_Practice;

class Person{
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	int age;
	public Person (String name, int age) {
		this.name=name;
		this.age=age;
	}
}

public class Ex06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person ("홍길동",44);
		Person p2 = new Person ("홍길동",44);
		if (p.equals(p2)) {
			System.out.println("p와p2가 같다.");
		}else {
			System.out.println("p와p2가 같지않다.");
		}
	}

}
