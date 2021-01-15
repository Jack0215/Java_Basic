package com.cat;
import com.yyy.Student;

public class cat {
	String name;
	int age;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public cat(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Student cattest = new Student();
}
