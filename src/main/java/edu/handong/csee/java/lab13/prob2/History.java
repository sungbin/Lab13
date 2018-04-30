package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	public String author;

	public History(String bookName, String author) {
		super(bookName);
		this.author = author;
	}
	public void printBook()
	{
		System.out.println("<<Science>>");
		System.out.println("id: "+id);
		System.out.println("Book Name: "+ bookName);
		System.out.println("Author: "+ author);
	}
}
