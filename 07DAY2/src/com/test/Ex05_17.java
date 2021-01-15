package com.test;

class Man{
	
		String name;
		int age;
		
		public Man(String name) {
			this (name, 19);
			System.out.println("Person 생성자1");
		}
		public Man(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("Person 생성자2");
		}
		public String getName() {return name;}
		public int getAge(){return age;}
		
}

public class Ex05_17 {
	public static void main(String[] args) {
		Man p= new Man("홍길동");
		System.out.println(p.getName() + " "+p.getAge());

	}

}
