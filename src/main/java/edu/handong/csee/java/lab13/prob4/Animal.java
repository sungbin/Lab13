package edu.handong.csee.java.lab13.prob4; //the file is in this package

public class Animal { //declare public type Animal class
	private String name; //declare private String type name
	public void setName(String name) //declare public setName method, return nothing
	{
		this.name = name; //put name value to member name variable
	}
	public void getName() //declare public getName, return nothing
	{
		System.out.println("Name: "+name); //print the sentence
	}
}
