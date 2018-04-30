package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount = 0;
	public int id;
	public String bookName;
	
	public Book(String bookName) {
		idCount++;
		this.id = idCount;
		this.bookName = bookName;
	}
	
	public void printBook()
	{
		System.out.println("<<BOOK>>");
		System.out.println("id: "+id);
		System.out.println("Book Name: "+ bookName);
	}
}
