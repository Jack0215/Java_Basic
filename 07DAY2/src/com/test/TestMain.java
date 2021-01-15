package com.test;

public class TestMain {
		//static 초기화 블럭 : 특정 작업의 초기화
		static { //1
			System.out.println("static 초기화블럭");
		}
		public TestMain() {//2
			System.out.println("TestMain 생성자");
		}
		//인스턴스 초기화 블럭
		{ //3
			System.out.println("멤버변수 초기화 블럭");
		}
		public static void main(String[] args ) {
			TestMain m = new TestMain(); //  new 하기 전에 3번 먼저 실행
		}
}
