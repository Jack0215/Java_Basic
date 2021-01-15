package Practice3;
import java.util.Date;

public class TestEmp { //현재 부모클래스가 없음(실제로는 Object class)
	public Emp[] createEmpArr() {
		Emp man = new Man("홍길동", "영업부");
		Emp man2 = new Man("이완용", "영업부");
		Emp en1 = new Eng("이순신", "제조업");
		Emp en2 = new Eng("강감찬", "연구업");
		Emp[] arr = new Emp[4];
		arr[0] = man;
		arr[1] = en1;
		arr[2] = en2;
		arr[3]= man2;
		return arr;
	}
	public void printEmp(Emp e) {
		System.out.println(e.printInfo());
	}
	public void printEmpArr(Emp[] arr) {
		for (Emp emp : arr) {
			System.out.println(emp.printInfo());
		}
	}
	public void printChildData(Emp e) {		
			if (e instanceof Man) {
				Man m = (Man) e;
				System.out.println(m.getName());
				System.out.println(m.getDepart());
			} else if (e instanceof Eng) {
				Eng en = (Eng) e;
				System.out.println(en.getName());
				System.out.println(en.getSkill());
			}		
	}
	public void printChildData(Emp[] arr) {
		for (Emp e : arr) {
			if (e instanceof Man) {
				Man m = (Man) e;
				System.out.println(m.getDepart());
			} else if (e instanceof Eng) {
				Eng en = (Eng) e;
				System.out.println(en.getSkill());
			}
		}
	}
	public Emp serchChildData(Emp[] arr, String name) {
		Emp data= null;
		for (Emp e : arr) {
			if(name.equals(e.getName())) {
				data= e;
			}
		}
		return data;
	}
	public String searchChildData(String name, Emp[] arr ) {
		String data= "";
		String token="/";
		for (Emp e : arr) {
			if (e instanceof Man) {
				Man m = (Man) e;
				if(name.equals(m.getDepart())) 
					data= data+ m.getName()+token;					
			} else if (e instanceof Eng) {
				Eng en = (Eng) e;
				if(name.equals(en.getSkill())) 
					data= data+ en.getName()+token;					
			}
		}
		return "검색결과 : " + data;
	}
	public static void main(String[] args) {
		Emp e = new Emp ("홍길동");
		//e.printinfo 할 필요 줄이는방법  - sysout + e 하면 jdk가 자동으로 toString붙여줌
		System.out.println(e);
		
		Emp m = new Man("이순신", "영업부"); 
		System.out.println(m);
		
		
//		TestEmp test = new TestEmp();
//		Emp[] arr= test.createEmpArr();
		//test.printEmpArr(arr);
//		Emp data= test.serchChildData(arr, "홍길동");
//		test.printChildData(data);
//		String result= test.searchChildData("영업부",arr );
//		System.out.println(result);
//		
//		Date d= new Date(); //Date객체, 얘는 Object에 있음.
		//Date객체가 toString을 오버라이딩
		//Object에 toString이 아니라 Date에 있는 toString임
		
//		System.out.println(d); //참조변수만 넣을시 jdk가 
		//자동으로 d.toString ()으로 변환
//		System.out.println(d.toString());
		
//		Eng e1= new Eng("홍길동","영업부");
//		Emp e2= new Eng("홍길동","영업부");
//		System.out.println(e1.equals(e2));
		
	}

}
