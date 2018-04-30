package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;
public class Rectangle extends Shape{
	Scanner mykey = new Scanner(System.in);
	public double area;
	public double perimeter;
	public double length;
	public double width;
	
	public Rectangle() {
		System.out.print("Enter radius: ");
		this.length = mykey.nextDouble();
		this.width = mykey.nextDouble();
		System.out.println("length: "+length);
		System.out.println("width: "+width);
	}

	@Override
	public double pullArea() {
		area=width*length;
		return area;
	}

	@Override
	public double pullPerimeter() {
		perimeter= (width+length)*2;
		return perimeter;
	}
}