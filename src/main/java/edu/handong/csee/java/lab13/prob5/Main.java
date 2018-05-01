package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Main {
	static Scanner mykey = new Scanner(System.in);

	public static void main(String[] args) {
		Main ma = new Main();
		
		int n1, n2 = 0;
		int m1, m2 = 0;
		System.out.print("Enter row size(maximum 5):");
		n1 = mykey.nextInt();
		System.out.print("Enter column size(maximum 5):");
		n2 = mykey.nextInt();
		
		System.out.print("Enter row size(maximum 5):");
		m1 = mykey.nextInt();
		System.out.print("Enter column size(maximum 5):");
		m2 = mykey.nextInt();
		
		int[][] first = new int[n1][n2];
		int second[][] = new int[m1][m2];

		System.out.print("Enter list1: ");
		ma.inputDataToArrays(first);
		System.out.print("Enter list2: ");
		ma.inputDataToArrays(second);
		
		ma.printDataToArrays(first);
		ma.printDataToArrays(second);
		
		if(ma.Equals(first,second))
		{
			System.out.println("The two arrays are approximately identical");
		}
		else
		{
			System.out.println("The two arrays are not identical");
		}
	}
	
	public void inputDataToArrays(int array[][])
	{
		for (int i = 0; i < array.length; i++) 
	      {
	            for (int j = 0; j < array[i].length; j++)
	            {
	                array[i][j] = mykey.nextInt();
	            }
	      }

	}
	public void printDataToArrays(int array[][])
	{
		for (int i = 0; i < array.length; i++) 
	      {
	            for (int j = 0; j < array[i].length; j++)
	            {
	                System.out.print(array[i][j]+ " ");
	            }
	            System.out.println();
	      }
		System.out.println();
	}
	
	public boolean Equals(int first[][], int second[][]) {
		int count =0;
		if(first.length != second.length)
			return false;
		for(int i = 0; i < first.length; i++) 
	    {
	           for (int j = 0; j < first[i].length; j++)
	           {
	           if (first[i][j] != second[i][j])
	                   count++;
	           }
	    }
		if(count <= 3)
	         return true;
	    else
	         return false;
		
	}
}
