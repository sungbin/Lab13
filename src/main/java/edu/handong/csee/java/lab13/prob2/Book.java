package edu.handong.csee.java.lab13.prob2; //the file is in this package

public class Book { //declare public type Book class
	private static int idCount = 0; //declare private static integer type odCount
	public int id; //declare public integer type id
	public String bookName; //declare public String type bookName
	
	public Book(String bookName) { //declare public type Book, parameter type is String
		idCount++; //idCount plus 1
		this.id = idCount; //put idCount to member id variable
		this.bookName = bookName; //put bookName to to member bookName variable
	}
	
	public void printBook() //declare public type printBook class, return nothing
	{
		System.out.println("<<BOOK>>"); //print the sentence
		System.out.println("id: "+id); //print the sentence
		System.out.println("Book Name: "+ bookName); //print the sentence
	}
}
