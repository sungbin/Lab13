package edu.handong.csee.java.lab13.prob3; //the file is in this package

import java.util.Scanner; //include Scanner method
public class Radius extends Shape{ //declare public type Radius class, have abstract of Shape
	Scanner mykey = new Scanner(System.in); //make instance of Scanner
	public double area; //declare public double type area
	public double perimeter; //declare public double type perimeter
	public double radius; //declare public double type radius
	
	public Radius() { //make construct
		System.out.print("Enter radius: "); //print sentence
		this.radius = mykey.nextDouble(); //scan one Double value from user
		System.out.println("Radius: "+radius); //print sentence
	}

	@Override
	public double pullArea() { //declare public type pullArea, return type is double
		area=radius * radius* Math.PI; //put (radius*radius*PI) value to area
		return area; //return area
	}

	@Override
	public double pullPerimeter() { //declare public type pullPerimeter method, return type is double
		perimeter= 2*Math.PI*radius; //put 2*PI*radius value to perimeter
		return perimeter; //return perimeter
	}
}
