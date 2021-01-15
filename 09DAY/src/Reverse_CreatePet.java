
public class Reverse_CreatePet {
	
	public Pet createPet(int num) {
		Pet p = null;
		if(num==1) {
			p=new Cat("야옹이", 3, "암놈");
		}else if(num==2) {
			p=new Dog("강아지", 10, "암놈","검정");
		}else if(num==3) {
			p=new Fish("븡어", 10, "암놈",2.5);
		}
		return p; //pet 타입으로 자식들을 리턴시킬수있다. but 받는쪽에서는 형변환 해야함(instanceof로)
	}
		
	Reverse_CreatePet test1 = new Reverse_CreatePet();
	Pet p = test1.createPet(1);
	
	public class Reverse_CreatePet_main { 
	public  void petPrint(Pet p) {
		if (p instanceof Cat) {
		Cat c = (Cat)p;	
		System.out.println(c.printInfo());
		System.out.println(c.getGender());		
		} else if (p instanceof Dog) {
			Dog d = (Dog) p;
			System.out.println(d.getColor());
		} else if (p instanceof Fish) {
			Fish f = (Fish) p;
			System.out.println(f.getTailSize());
			
		} else if (p instanceof Pet) {
			System.out.println(p.printInfo());
		}
		else {
			System.out.println("잘못된 데이터");
		}
	}
}
}