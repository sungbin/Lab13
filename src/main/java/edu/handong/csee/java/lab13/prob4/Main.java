package edu.handong.csee.java.lab13.prob4; //the file is in this package

import java.util.Scanner; //include Scanner class

public class Main { //declare public type Main class
	public static void main(String[] args) { //declare main method
		String cat_name, dog_name; //declare String type 2 variable

		Master master = new Master(); //make instance of Master
		Cat cat = new Cat(); //make instance of Cat
		Dog dog = new Dog(); //make instance of Dog

		Scanner keyboard = new Scanner(System.in); //make instance of Scanner
		System.out.print("Enter the cat name and dog name: "); //print the sentence
		cat_name = keyboard.next(); //scan one String from user
		dog_name = keyboard.next(); //scan one String from user

		cat.setName(cat_name); //put cat_name value to cat variable in instance of cat
		cat.getName(); //execute getName method
		master.feed(cat); //execute feed method

		dog.setName(dog_name); //execute setName method
		dog.getName(); //execute getName method 
		master.feed(dog); //execute feed method
		

	}
}
