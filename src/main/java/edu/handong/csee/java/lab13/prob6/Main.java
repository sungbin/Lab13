package edu.handong.csee.java.lab13.prob6; //the file is in this package

public class Main {//declare public type Main class

	public static void main(String[] args) { //declare main method
		UpPoint p1 = new UpPoint(3,3); //make instance of UpPoint
		DownPoint p2 = new DownPoint(2,5); //make instance of DownPoint
		DownPoint p3 = new DownPoint(4,7); //make instance of DownPoint
		UpPoint p4 = new UpPoint(9,12); //make instance of UpPoint
		Printer.print(p1); //execute print method
		Printer.print(p2); //execute print method
		Printer.print(p3); //execute print method
		Printer.print(p4); //execute print method
	}
}
