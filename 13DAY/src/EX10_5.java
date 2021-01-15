class Group<T>{
T obj;
public void setValue(T obj) {
	this.obj = obj;
}
public T getValue() {
	return obj;
}
}
class Person{}
class Man extends Person{}
class Woman extends Person{}
public class EX10_5 {
	public static void method1(Group<?> group){}
	public static void method2(Group<? extends Person> group){}
	public static void method3(Group<? super Person> group){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method : 어떤 타입도 설정 가능
		method1(new Group<Object>());
		method1(new Group<Person>());
		method1(new Group<Man>());
		method1(new Group<Woman>());
		
		//method2 : Person 또는 Person의 자식만 가능
//		method2(new Group<Object>());
		method2(new Group<Person>());
		method2(new Group<Man>());
		method2(new Group<Woman>());
		
		//method3 : Person 또는 Person의 부모만 가능
		method3(new Group<Object>());
		method3(new Group<Person>());
//		method3(new Group<Man>());
//		method3(new Group<Woman>());
	}

}
