package Pet_abstract;
public class TestPet {
	public Pet[] createPetArr() {
		Pet c = new Cat("야옹이", 3, "암놈");
		Pet d = new Dog("강아지", 10, "암놈", "검정");
		Pet f = new Fish("븡어", 10, "암놈", 2.5);
		Pet[] pets= new Pet[3];
		pets[0]=c;
		pets[1]=d;
		pets[2]=f;
		return pets;
	}
	public Pet createPet(int num) {
		Pet p=null;
		if(num==1) {
			p= new Cat("야옹이", 3, "암놈");
		}else if(num==2) {
			p= new Dog("강아지", 10, "암놈", "검정");
		}else if(num==3) {
			p = new Fish("븡어", 10, "암놈", 2.5);
		}
		return p;
	}
	public void petPrint(Pet p) {		
		if (p instanceof Cat) {
			Cat c = (Cat) p;
			System.out.println(c.printInfo());
			System.out.println(c.getGender());
		} else if (p instanceof Dog) {
			Dog d = (Dog) p;
			System.out.println(d.getColor());
		} else if(p instanceof Fish) {
			Fish f= (Fish)p;
			System.out.println(f.getTailSize());
		} else if(p instanceof Pet) {		
			System.out.println(p.printInfo());
		}else {
			System.out.println("잘못된데이터");
		}		
	}
	public void arrPrint(Pet[] pets) {
		for (Pet p : pets) {
			if (p instanceof Cat) {
				Cat c = (Cat) p;
				//System.out.println(c.printInfo());
				System.out.println(c.getGender());
			} else if (p instanceof Dog) {
				Dog d = (Dog) p;
				System.out.println(d.getColor());
			} else if(p instanceof Fish) {
				Fish f= (Fish)p;
				System.out.println(f.getTailSize());
			} else if(p instanceof Pet) {		
				System.out.println(p.printInfo());
			}else {
				System.out.println("잘못된데이터");
			}		
		}
	}

	public static void main(String[] args) {
		TestPet test= new TestPet();
		Pet[] pets= test.createPetArr();
		test.arrPrint(pets);
		
		Pet c = new Cat("나비",3,"암컷");
		System.out.println(c);
		c.cry();
		c.eat();
		c.sleep();
		Pet d = new Dog("하루",2,"남자아이","블랙");
		System.out.println(d);
		d.cry();
		d.eat();
		d.sleep();
		d.getGender();
//		System.out.println(d.getGender());
		
		System.out.println(c.getAge());
		System.out.println(c.name);
		
		
		
		
		
		
		
//		TestPet test= new TestPet();
//		Pet p= test.createPet(1);		
//		//test.petPrint(p);
//		//Pet p2= test.createPet(2);		
//		//test.petPrint(p2);		
//		if (p instanceof Cat) {
//			Cat c = (Cat) p;
//			//System.out.println(c.printInfo());
//			System.out.println("고양이 입니다. " + c.getGender());
//		} else if (p instanceof Dog) {
//			Dog d = (Dog) p;
//			System.out.println(d.getColor());
//		} else if(p instanceof Fish) {
//			Fish f= (Fish)p;
//			System.out.println(f.getTailSize());
//		} else if(p instanceof Pet) {		
//			System.out.println(p.printInfo());
//		}else {
//			System.out.println("잘못된데이터");
//		}		
//		Pet c = new Cat("야옹이", 3, "암놈");
//		Pet d = new Dog("강아지", 10, "암놈", "검정");
//		Pet f = new Fish("븡어", 10, "암놈", 2.5);
//		Pet[] pets= new Pet[3];
//		pets[0]=c;
//		pets[1]=d;
//		pets[2]=f;
//		TestPet test = new TestPet();
		//test.petPrint(c);
//		test.arrPrint(pets);
		
		
	}
}
