package com.test;

public class TestMain2 {
//가변인자
	public void a(int ...n) {
		for(int x : n)
			System.out.println(x);
	}

	public void c(String ... n) {
		for(String x : n)
			System.out.println(x);
	}
	
	public static void b() {System.out.println("static 메소드");}
	// static 메서드
	public static void main(String[] args) {
		TestMain2 m = new TestMain2();
		m.a(10);
		m.a(10,20);
		m.b(); //static 메소드, 객체 생성 없이 쓰이고있음
		m.c("asdad");
		m.c("sdad","asdadasd");
			} //end main
	} //end class
