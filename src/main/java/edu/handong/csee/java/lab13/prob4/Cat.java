package edu.handong.csee.java.lab13.prob4; //the file is in this package

public class Cat extends Animal implements Pet { //declare public type Cat class, inheritance of Animal, including Pet interface

	@Override
	public String food() { //declare public String type food method
		return "(Cat!)" + "Fish"; //return the String
	}

}
