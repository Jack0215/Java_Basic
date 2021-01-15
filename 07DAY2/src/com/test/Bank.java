package com.test;

public class Bank {
private static Bank b = new Bank(); //2.static 변수 private 선언, 객체 생성
//내부에서 객체생성
private Bank() {} //1. 생성자를 private 지정, 다른 클래스에서
//객체생성 안됨, new 안됨/

public static Bank getBank() {
	return b; //3. 생성한 객체를 리턴(필요한 곳에서 얻어서 사용)
//4.사용하는 곳에서는 Bank b = Bank.getBank()로 얻음.
}
public String getName() {
	return "xx은행";
}
}
