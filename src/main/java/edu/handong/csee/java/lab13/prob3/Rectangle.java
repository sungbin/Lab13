package edu.handong.csee.java.lab13.prob3; //the file is in this package

import java.util.Scanner; //include Scanner class
public class Rectangle extends Shape{ //declare public type Rectangle class, include abstract Shape
	Scanner mykey = new Scanner(System.in); //make instance of Scanner
	public double area; //declare public double type area variable
	public double perimeter; //declare public double type perimeter variable
	public double length; //declare public double type length variable
	public double width; //declare public double type width variable
	
	public Rectangle() { //make constructor
		System.out.print("Enter radius: "); //print the sentence
		this.length = mykey.nextDouble(); //scan one Double from user
		this.width = mykey.nextDouble(); //scan one Double from user
		System.out.println("length: "+length); //print the sentence
		System.out.println("width: "+width); //print the sentence
	}

	@Override
	public double pullArea() { //declare public type pullArea method, return type is double
		area=width*length; //put width*length value to area
		return area; //return area
	}

	@Override
	public double pullPerimeter() { //declare public type pullPerimeter, return type is double
		perimeter= (width+length)*2; //put (width+length)*2 value to perimeter
		return perimeter; //return perimeter
	}
}