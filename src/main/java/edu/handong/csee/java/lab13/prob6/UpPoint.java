package edu.handong.csee.java.lab13.prob6; //the file is in this package

public class UpPoint implements CapitalPrint{ //declare public type, including interface
	private int x,y; //declare private integer type 2 variable
	public UpPoint(int x, int y) { //declare public type method, parameter is integer and integer
		this.x = x; this.y = y; //set x,y
	}
	public String toString() //declare public type toString method, return type is String
	{
		return "x : " +x + " y : " + y; //return the String
	}
}
