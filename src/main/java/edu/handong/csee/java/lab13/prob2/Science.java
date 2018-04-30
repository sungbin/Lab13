package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	public String publisher;
	
	public Science(String bookName, String publisher) {
		super(bookName);
		this.publisher = publisher;
	}
	public void printBook()
	{
		System.out.println("<<Science>>");
		System.out.println("id: "+id);
		System.out.println("Book Name: "+ bookName);
		System.out.println("Publisher: "+ publisher);
	}
}
