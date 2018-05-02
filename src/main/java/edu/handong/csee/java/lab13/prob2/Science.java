package edu.handong.csee.java.lab13.prob2; //the file is in this package

public class Science extends Book { //declare public type Science class, inheritance of Book
	public String publisher; //declare public String type member variable publisher
	
	public Science(String bookName, String publisher) { //make constructor, parameter type is String and String
		super(bookName); //execute constructor of parent class
		this.publisher = publisher; //put publisher value to member variable publisher
	}
	public void printBook() //declare public type printBook method, return nothing
	{
		System.out.println("<<Science>>"); //print the sentence
		System.out.println("id: "+id); //print the sentence
		System.out.println("Book Name: "+ bookName); //print the sentence
		System.out.println("Publisher: "+ publisher); //print the sentence
	}
}
