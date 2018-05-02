package edu.handong.csee.java.lab13.prob6; //the file is in this package

public class Printer { //declare public type Printer class
	public static void print(Object object) //declare public static type print, return nothing, parameter is Object
	{
		String str = object.toString(); //declare String type str variable, and input value of object.toString()
		if(object instanceof CapitalPrint) //if object is intance of CapitalPrint
			str = str.toUpperCase(); //String in str be maked UpperAlpabet
		System.out.println(str); //print the String
	}
}
