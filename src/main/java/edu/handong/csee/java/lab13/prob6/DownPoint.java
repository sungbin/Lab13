package edu.handong.csee.java.lab13.prob6; //the file is in this package

public class DownPoint { //declare public type DownPoint class
	private int x,y; //declare private integer type x,y
	public DownPoint(int x, int y) { //declare public type method, parameter integer and integer
		this.x = x; this.y = y; //set x,y
	}
	public String toString() //declare public type toString method, return type is String
	{
		return "x : " +x + " y : " + y; //return these String
	}
}