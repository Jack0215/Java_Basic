package com.xxx;             //문법 1순위
import com.yyy.Student;      //문법 2순위 둘의 위치가 바뀌면 error 발생

public class TestStudent {
	public static void main(String[] args) {
//		com.yyy.Student test = new com.yyy.Student();
		Student test = new Student();
		System.out.println(test.name);
		
	}
}
