class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box3<T extends Pet>{
	T obj;
	public void setValue(T obj) {
		this.obj=obj;
	}
	public T getValue() {
		return obj;
	}
}
public class EX10_3 {

	public static void main(String[] args) {
		Box3<Pet> b1 = new Box3<Pet>();
		Box3<Cat> b2 = new Box3<Cat>();
		Box3<Dog> b3 = new Box3<Dog>();

		//Box<Object> b4 = new Box2<>();
	}

}
