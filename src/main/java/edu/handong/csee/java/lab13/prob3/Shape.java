package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {
	public abstract double pullArea();
	public abstract double pullPerimeter();
	public void display()
	{
		System.out.println("Area: " + pullArea() + "\nPerimeter:"+pullPerimeter() 
		+ "\n");
	}
}
