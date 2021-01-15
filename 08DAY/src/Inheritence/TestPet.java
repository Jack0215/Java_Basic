package Inheritence;

public class TestPet {  //Object
	public void petPrint(Pet pet) { //아래쪽에서 cat 생성 후 pet이란 변수에는 cat이 저장되어있음.
									//pet.printInfo()하면 고양이 정보가 나옴
									//Pet의 부모는 Object여서 사용가능하지만,
									//Object에는 printInfo()가 없음
									//cat 타입으로 바꿔서 입력하면 가능함
//Object		Cat cat=(Cat)pet;  //캐스팅
//Object		System.out.println(cat.printInfo());
/*Pet*/		//System.out.println("petPrint호출됨\n"+pet); //얘네가 갖고있는 데이터 뽑으려면
/*Pet*/		//System.out.println(pet.printInfo());
		//Dog을 넘겨주면 Dog 정보가 나옴
		
	if(pet instanceof Cat) {
		Cat cat = (Cat)pet;
		System.out.println("고양이");
		System.out.println(cat.getGender());
		System.out.println(cat.printInfo());
	}else if (pet instanceof Dog) {
		Dog dog = (Dog)pet;
		System.out.println("개dddd");
		System.out.println(dog.getGender());
		System.out.println(dog.Printinfo());
	}else if(pet instanceof Fish) {
		Fish fish = (Fish)pet;
		System.out.println(fish.getGender());
		System.out.println(fish.printInfo());
	}else if(pet instanceof Pet) {
		System.out.println(pet.printInfo());
	}else {
		System.out.println("똑바로 넣으세요");
	}
	}
	
	public static void main(String[] args) {
		
//		//고양이 2마리,강아지 1마리 ,물고기 1마리
////		Cat c = new Cat("야옹이", 3, "암놈");
////    //	c.printInfo();
////		System.out.println(c.printInfo());
//	  //Pet은 이름,나이만 Cat은 이름,나이,성별 까지 입력
//		Pet c = new Cat("야옹이",3,"암놈");
/////부모타입 변수로 자식 객체 저장이 가능하다. cat dog fish 객체 저장 가능
//		System.out.println(c.printInfo());
//		                 //↑ cat type
//						 // 오버라이딩 된 cat에 printInfo가 출력됨
//						 // 실제로 출력되는건 자식 객체
/////부모타입 변수로 오버라이딩 된 자식 객체 함수 호출 됨 - 동적바인딩
////		System.out.println(c.getGender());
/////부모타입 변수로 실제 자식 객체를 가지고 있어도 자식 객체의 유일한 함수, 변수 접근이 안됨
/////
//		//	    Pet에 들어있는 함수만 쓸 수 있으므로 gender는 불가능.
//		//	    gender는 자식에게만 있고, private설정해놔서 안됨
//		  Cat cat = (Cat)c;
//	///안에 실제 들어있는 타입으로 형변환해서 사용해야함.
//	///실제 객체의 유일 변수, 함수 접근을 위해 실제 객체 타입으로 변환(타임캐스팅)
//	///이러면 19행 출력 가능
//		  System.out.println(cat.getGender());
//	///형변환된 변수로 함수, 변수 사용
		  
//		 Pet c = new Cat("야옹이", 3, "암놈");
		// System.out.println(c.printInfo());
		  
		 //Dog d = new Dog ("멍멍이",12,"수컷","검은색");
//		 Pet d = new Dog ("멍멍이",12,"수컷","검은색");
//		d.printInfo();
	//	System.out.println(d.printInfo());
		
//		Fish f = new Fish ("물고기",5,"암컷",5.5);
//		Pet f = new Fish ("물고기",5,"암컷",5.5);
//		System.out.println(f.printInfo());
		
	//	System.out.println(c.getGender()); 객체가 Pet이라 사용할수가없음
//		Cat c1 = (Cat)c;  //c를 원래 객체인 (Cat)으로 변환해서 c1에 저장한다.
//		System.out.println(c1.getGender()); //Cat에 유일하게 있는 gender를 불러옴
//		Dog d1 = (Dog)c;
//		System.out.println(d1.getColor()); //Dog에 유일하게 있는 Color을 불러올 수 있음
//		Fish f1 = (Fish)c;
		
		
		Pet c = new Cat("야옹이", 3, "암놈");
		Pet d = new Dog ("멍멍이",12,"수컷","검은색");
		Pet f = new Fish ("물고기",5,"암컷",5.5);
		TestPet test = new TestPet();
		test.petPrint(c);
		test.petPrint(d);
		test.petPrint(f);
		
//		Pet[] arr = new Pet[3];
//		arr[0]=c;
//		arr[1]=d;
//		arr[2]=f;
//		for(Pet pet : arr) {
//			System.out.println(pet.printInfo()); //동적바인딩0
//		}
	}

}
