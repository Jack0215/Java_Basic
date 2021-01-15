package Practice4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pet [] c = { new Cat("야옹이", 3, "암놈"),
//					 new Cat("야옹이", 3, "암놈"),
//					 new Dog("강아지", 10, "암놈", "검정")
//		};
//			for ( Pet x :c) {
//				System.out.println(x); //동적바인딩 .toString()호출
//			}
//		}
		
		//Object type으로 넣어봤음
		Object [] c1 = {10,"홍길동",
						new Cat("야옹이", 3, "암놈"),
						new Cat("야옹이", 3, "암놈"),
					    new Dog("강아지", 10, "암놈", "검정"),
						};
		for (Object object : c1) {
			System.out.println(object);
		}
			System.out.println("===============");
	}
}
