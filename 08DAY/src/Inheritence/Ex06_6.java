//package Inheritence;
//class Employee{
//	String name;
//	int salary;
//	public String getEmployee() {
//		return name + " " + salary;
//	}
//	
//	public Employee() {}
//	public Employee(String name, int salary) {
//		this.name=name;
//		this.salary=salary;
//	}
//}
//
//class Manager extends Employee{
//	String depart;
//
//	@Override
//	public String getEmployee() {
//		// TODO Auto-generated method stub
//		return super.getEmployee()+" "+depart;
//	}
//	public Manager (String name, int salary, String depart) {
//		super(name, salary);
//		this.depart=depart;
//	}
//}
//
//public class Ex06_6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee emp = new Employee("홍길동", 2000);
//		Manager man = new Manager("이순신",4000,"개발");
//		System.out.println(emp.getEmployee());
//		System.out.println(man.getEmployee());
//	}
//
//}
