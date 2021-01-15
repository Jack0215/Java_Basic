package practice0;
public class TestPet0 {
	public  void petPrint(Pet0 p) {
		
	}
	public static void main(String[] args) {
		Pet0 c= new Cat0("야옹이", 3, "암놈"); 
		Pet0 d= new Dog0("강아지", 10, "암놈","검정");
		Pet0 f= new Fish0("븡어", 10, "암놈",2.5);
		TestPet0 test= new TestPet0();
		test.petPrint(c);

	}
}
