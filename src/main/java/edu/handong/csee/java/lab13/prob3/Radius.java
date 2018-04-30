package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;
public class Radius extends Shape{
	Scanner mykey = new Scanner(System.in);
	public double area;
	public double perimeter;
	public double radius;
	
	public Radius() {
		System.out.print("Enter radius: ");
		this.radius = mykey.nextDouble();
		System.out.println("Radius: "+radius);
	}

	@Override
	public double pullArea() {
		area=radius * radius* Math.PI;
		return area;
	}

	@Override
	public double pullPerimeter() {
		perimeter= 2*Math.PI*radius;
		return perimeter;
	}
}
