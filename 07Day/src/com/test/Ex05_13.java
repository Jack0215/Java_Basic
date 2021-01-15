package com.test;

class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getInfo() {
		return title + "\t"+author+"\t"+price;
	}
}
public class Ex05_13 {
	
	public static void change(Book book) {
		book.title = "Java8";
		book.price = 30000;
	}
	
	public static void main(String[] args) {
		Book book = new Book("Java", "인경열", 20000);
		System.out.println("main의 변경 전 info:"+book.getInfo());
		change(book); //call by reference
		System.out.println("main의 변경 후  info:"+book.getInfo());

	}

}
