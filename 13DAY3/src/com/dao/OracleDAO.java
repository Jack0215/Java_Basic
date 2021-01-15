package com.dao;

import java.util.HashSet;

public class OracleDAO {
//	public HashSet<String> select() { // select함수가있음
//		HashSet<String> set = new HashSet<String>();
//		set.add("홍길동");
//		set.add("이순신");
//		set.add("유관순");
//		return set;
	//person으로 바꾸려면 person calss 있어야함
	public HashSet<Person> select() { // select함수가있음
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("이재윤",99,"경기"));
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",20,"서울"));
		return set;
	}
}
