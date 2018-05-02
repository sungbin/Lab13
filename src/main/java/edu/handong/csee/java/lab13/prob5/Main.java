package edu.handong.csee.java.lab13.prob5; //the file is in this package
import java.util.Scanner; //include Scanner class

public class Main { //declare public type Main class
	static Scanner mykey = new Scanner(System.in); //make static instance of Scanner

	public static void main(String[] args) { //declare main method
		Main ma = new Main(); //make instance of Main
		
		int n1, n2 = 0; //declare integer type variable n1, n2
		int m1, m2 = 0; //declare integer type variable n1, n2
		System.out.print("Enter row size(maximum 5):"); //print the sentence
		n1 = mykey.nextInt(); //scan one Integer from user
		System.out.print("Enter column size(maximum 5):"); //print the sentence
		n2 = mykey.nextInt(); //scan one Integer from user
		
		System.out.print("Enter row size(maximum 5):"); //print the sentence
		m1 = mykey.nextInt(); //scan one Integer from user
		System.out.print("Enter column size(maximum 5):"); //print the sentence
		m2 = mykey.nextInt(); //scan one Integer from user
		
		int[][] first = new int[n1][n2]; //declare 2 Dimensional Array
		int second[][] = new int[m1][m2]; //declare 2 Dimensional Array

		System.out.print("Enter list1: "); //print the sentence
		ma.inputDataToArrays(first); //execute inputDataToArrays
		System.out.print("Enter list2: "); //print the sentence
		ma.inputDataToArrays(second); //execute inputDataToArrays
		
		ma.printDataToArrays(first); //execute printDataToArrays
		ma.printDataToArrays(second); //execute printDataToArrays
		
		if(ma.Equals(first,second))  //if result value of Equals method is true,
		{
			System.out.println("The two arrays are approximately identical"); //print the sentence
		}
		else //else
		{
			System.out.println("The two arrays are not identical"); //print the sentence
		}
	}
	
	public void inputDataToArrays(int array[][]) //declare public type inputDataToArrays, return nothing, parameter is integer
	{
		for (int i = 0; i < array.length; i++)  //execute for-statement
	      {
	            for (int j = 0; j < array[i].length; j++) // execute for-statement
	            {
	                array[i][j] = mykey.nextInt(); //scan value and put to array
	            }
	      }

	}
	public void printDataToArrays(int array[][]) //declare public type printDataToArrays, return nothing, parameter is integer
	{
		for (int i = 0; i < array.length; i++) //execute for-statement
	      {
	            for (int j = 0; j < array[i].length; j++) //execute for-statement
	            {
	                System.out.print(array[i][j]+ " ");//print the sentence
	            }
	            System.out.println();//print one enter
	      }
		System.out.println(); //print one enter
	}
	
	public boolean Equals(int first[][], int second[][]) { //declare public type printDataToArrays, return type is boolean, parameter is integer
		int count =0; //declare integer variable
		if(first.length != second.length) //if Array's length is not equal
			return false; //return false
		for(int i = 0; i < first.length; i++)  //execute for-statement
	    {
	           for (int j = 0; j < first[i].length; j++) //execute for-statement
	           {
	           if (first[i][j] != second[i][j]) //if first[i][j] equals second[i][j]
	                   count++; //count plus 1
	           }
	    }
		if(count <= 3) //if count is under or equals 3
	         return true;  //return true
	    else //else
	         return false; //return false
		
	}
}
