package edu.handong.csee.java.lab13.prob4; //the file is in this package

public class Dog extends Animal implements Pet { //declare public type Dog class, inheritance of Animal, including Pet

	@Override
	public String food() { //declare public type food method, return type is String

		return "(Dog!)"+"Sausage"; //return the String
	}

}
