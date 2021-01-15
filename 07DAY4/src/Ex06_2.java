

class Emp{
	public Emp(){
		System.out.println("Emp 생성자 1");
	}
	public Emp(String nemw, int salary){
		System.out.println("Emp 생성자 2");
	} 
}
class Man extends Emp{
//	class Man{
	public Man() {
		System.out.println("Man 생성자");
	}
}
public class Ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man1 = new Man();
		System.out.println();
	}
}
