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
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		return title+"\t"+ author+"\t"+ price;
	}
}
public class Ex05_13 {
	
	public static void changeBook (Book book) {//함수의 매개변수로 클래스를 받음, 클래스타입 변수명 
		//참조변수 사용시 주소가 넘어가 같은 객체를 가지고 작업하게 된다 
		System.out.println("changeBook book========"+ book );
		book.title="Java8";
		book.price=3000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Java", "인경열", 2000);
		System.out.println(book);
		System.out.println("변경전======"+ book.getInfo());
		changeBook(book);
		System.out.println("변경후 ======"+ book.getInfo());

	}

}
