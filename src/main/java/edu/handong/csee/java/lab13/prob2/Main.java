package edu.handong.csee.java.lab13.prob2; //the file is in this package

public class Main { //declare public type Main class
	public static void main(String[] args) { //declare main method
		Book bk = new Book("Simple Book"); //make instance of Book class
		Science sc = new Science("Hello Physics", "ScienceWorld"); //make instance of Science class
		History ht = new History("What Is history?", "E.H.Carr"); //make instance of History class
		
		bk.printBook(); //execute printBook method of bk
		sc.printBook(); //execute printBook method of sc
		ht.printBook(); //execute printBook method of ht
	}
}