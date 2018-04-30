package edu.handong.csee.java.lab13.prob2;

public class Main {
	public static void main(String[] args) {
		Book bk = new Book("Simple Book");
		Science sc = new Science("Hello Physics", "ScienceWorld");
		History ht = new History("What Is history?", "E.H.Carr");
		
		bk.printBook();
		sc.printBook();
		ht.printBook();
	}
}