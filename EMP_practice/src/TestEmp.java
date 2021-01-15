import java.util.Date;
public class TestEmp {

	//  1.각 자식의 printInfo 출력
//	public void printEmp(Emp e) {
//		System.out.println(e.printInfo());
//	}	
	//2번. 배열 형태로 각 자식의 printInfo 출력
	public void printArr(Emp [] arr ) {
		for (Emp emp : arr) {
		System.out.println(emp.printInfo());
	}
}	
//	3.wktlrdml dbdlf data출력 , depart, skill출력
	public void printChildData(Emp[]arr) {
		for (Emp e : arr) {
			if (e instanceof Man) {
				Man m = (Man) e;
				System.out.println(m.getDepart());
			} else if (e instanceof Eng) {
				Eng en = (Eng)e;
				System.out.println(en.getSkill());
			}
		}
	}	
	public Emp searchChildData(Emp[]arr, String name){
		Emp data = null;
		for(Emp e : arr){
		if(name.equals(e.getName())){
		data = e;
		}
		}
		return data;
		}
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		
		Emp m = new Man("홍길동","영업부");
		Emp m1 = new Man("이완용","영업부");
		Emp en1 = new Eng("이순신","제조업");  //Emp를 Eng로 바꿔도 상관없음
		Emp en2 = new Eng("강감찬","연구업");
//		TestEmp test = new TestEmp();
//		test.printEmp(m);
//		test.printEmp(en1);
//		test.printEmp(en2);		
		Emp[] arr = new Emp[4];
		arr[0]=m;
		arr[1]=en1;
		arr[2]=en2;
		arr[3]=m1;
		
		TestEmp test = new TestEmp();
		test.printArr(arr);		
//      아래 sysout을 위로 올리고, 각 자식의 printInfo 출력		
//		//emp타입으로 Man 생성 및 출력
//		Emp m = new Man("홍길동","영업부");
//		System.out.println(m.printInfo());
//		//emp타입으로 Eng 생성 및 출력
//		Emp en = new Eng("이순신","제조업");
//		System.out.println(en.printInfo());
	}
}
//