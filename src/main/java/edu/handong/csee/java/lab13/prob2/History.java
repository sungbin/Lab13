package edu.handong.csee.java.lab13.prob2; //the file is in this package

public class History extends Book { //declare public type History class, inheritance of Book
	public String author; //declare String type author

	public History(String bookName, String author) { //declare History constructor, parameter type is String and String
		super(bookName); //execute parent class constructor
		this.author = author; //put author value to member author variable
	}
	public void printBook() //declare public type printBook method, return nothing
	{
		System.out.println("<<Science>>"); //print the sentence
		System.out.println("id: "+id); //print the sentence
		System.out.println("Book Name: "+ bookName); //print the sentence
		System.out.println("Author: "+ author); //print the sentence
	}
}
