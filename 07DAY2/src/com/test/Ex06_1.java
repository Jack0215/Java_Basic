package com.test;

class Employee{ //extens object가 숨어있음. 이게 제일 먼저 만들어짐 그 다음 10행이 만들어지고 그 다음 매니저가 만들어지면서 끝남
String name;
int salary;
public String getEmployee() {
	return name + " " + salary;
	}

public Employee() {
	super();
	System.out.println("부모의 기본 생성자 호출==========");
}
public Employee(String name, int salary) {  //default 생성자
	super();
	this.name=name;
	this.salary=salary;
	}
}
class Manager extends Employee{ 
	String depart; //선언된건 depart하나
	public String getManager() {
		return name + " " +salary + " "+depart;
	}
	public Manager(String name, int salary, String depart) { //부모에있는걸 수용
		super();//부모 기본 생성자 호출, line 10을 불러옴. 라인 10~13지우면 에러 발생(super는 부모를 불러오는 역할인데 부모 클래스가 없으므로!)
		        //super를 지우면 부모 생성 못해서 에러발생
		this.name = name;
		this.salary=salary;
		this.depart=depart;
		System.out.println("Magager 자식생성자 호출=============");
	}
}
public class Ex06_1 {
		public static void main(String[] args) {
//		Employee emp = new Employee("홍길동",2000);
//			System.out.println(emp.getEmployee()); //6번이 출력됨
		Manager man = new Manager("이순신", 4000, "개발");
		System.out.println(man.getManager()); 
	}
}
