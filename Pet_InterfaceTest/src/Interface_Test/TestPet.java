package Interface_Test;
public class TestPet {

	public static void main(String[] args) {
		//다형성
	
		Cat c= new Cat("나비", 3, "암컷");
		System.out.println(c.toString()); //toString 오버라이딩 되어있어 c만 입력해도 됨
		
		Pet c1 = new Cat("콩이", 8, "암컷");
		System.out.println(c1); //toString 오버라이딩 되어있어 p만 입력해도 됨
		
		Movement c2 = new Cat("라온", 6, "수컷");
		System.out.println(c2);
		
		//인터페이스에 오버라이딩 된 함수는 인터페이스로 호출
		//나머지 함수들을 쓰려면 형 변환을 해야함 interfaceof 사용
		
		
		c.cry();
		c2.cry();
		//인터페이스(무브먼트타입) 배열로 만들어서 자식을 2개정도 만들어서 넣어볼것
		Dog d = new Dog ("하루",2,"블랙");
		System.out.println(d);
		Movement[] mov = new Movement[2];
		mov[0]=c;
		mov[1]=d;
		for(Movement m : mov) {
			System.out.println(m);
		}
		//0번방 고양이의 이름을 찍어보고 싶음
		//cat이면 0번방.getName
		//현재는 Movement타입이라 형변환 후 호출해야함
		
		Cat cat = (Cat)mov[0];
		System.out.println(cat.getName());
		
//		c.eat();
//		c.sleep();		
//		Pet d = new Dog("하루", 2, "블랙");
//		System.out.println(d);
//		d.cry();
//		d.eat();
//		d.sleep();
		
	}

}
