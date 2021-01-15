
public class TestPet {    //↓부모를 가져왔음
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
	} 			  //return이 되면 Pet 형태로 return이 됨
	
//배열 생성
public void arrPrint(Pet[] pets) {
	for (Pet p : pets) {
		System.out.println(p.printInfo());
		//1개만 꺼내고싶으면 instanceof 넣고 형변환해서 꺼내면 됨
		if (p instanceof Cat) {
			Cat c = (Cat)p;
			System.out.println("배열==========");
			System.out.println(c.printInfo());
			System.out.println(c.getGender());
		}
	}
}
	public static void main(String[] args) { //받는쪽
		Pet c= new Cat("야옹이", 3, "암놈"); //부모가 Pet 자식이 Cat
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		
		//배열로 넘겨주기, c,d,f를 pet의 배열로 선언
		Pet [] pets = new Pet[3];
		pets[0]=c;
		pets[1]=d;
		pets[2]=f;
		
		TestPet test = new TestPet(); //testPet객체생성
		test.petPrint(c); //gender를 쓰러면 5~7행에선 쓸 수 없음. 오버라이딩 해야됨. 코딩을 5~7에 추가
		test.petPrint(f);
		test.petPrint(d);
	
		//32~34 Pet의 배열을 26~30으로 넘겨주기
		test.arrPrint(pets);
	}

	public Pet[] createPetArr() {
		// TODO Auto-generated method stub
		return null;
	}
}
//1. 하나씩 넘겨주고
//2. 배열로 넘겨주는작업
//전에는 CAT을 출력하려면 cat의 printinfo 호출됐었음

//부모타입으로 인자를 넘기는것

//main에서 create pet 호출