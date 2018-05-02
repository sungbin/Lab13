package edu.handong.csee.java.lab13.prob3; //the file is in this package

public abstract class Shape { //declare public abstract type Shape class
	public abstract double pullArea(); //declare public abstract type pullArea method, return type is double
	public abstract double pullPerimeter(); //declare public abstract type pullPerimeter method, return type is double
	public void display() //declare public type display method, return nothing
	{
		System.out.println("Area: " + pullArea() + "\nPerimeter:"+pullPerimeter() //print the sentence
		+ "\n");
	}
}
