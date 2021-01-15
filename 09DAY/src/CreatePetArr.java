
public class CreatePetArr {
		    //호출한곳에서는 per[]의배열로 받아야함
	public Pet[] createPetArr() {		
	Pet c= new Cat("야옹이", 3, "암놈"); //부모가 Pet 자식이 Cat
	Pet d= new Dog("강아지", 10, "암놈","검정");
	Pet f= new Fish("븡어", 10, "암놈",2.5);
	Pet [] pets = new Pet [3];
	pets[0]=c;
	pets[1]=d;
	pets[2]=f;
	return pets; //(←얘는 pet의 배열임)
	}
	
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
		 //c는 if 안에있는 로컬변수라 사용이 안됨. Cat c = null;추가
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestPet test = new TestPet();
		Pet[] pets = test.createPetArr();
		test.arrPrint(pets);
		
	}

}
