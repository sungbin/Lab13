package edu.handong.csee.java.lab13.prob1; //the file is in this package

public class InstanceOf { //declare public type InstanceOf class.
	public static void WhatFriend(Friend friend) { //declare public static type WhatFriend, return nothing, parameter type is Friend instance
		if(friend instanceof ClassFriend) //if object is instance of ClassFriend
			((ClassFriend) friend).classFriend(); //execute classFriend method in ClassFriend
		else if(friend instanceof SchoolFriend) //else if object is instance of SchoolFriend
			((SchoolFriend) friend).schoolFriend();//execute schoolFriend method in SchoolFriend
		else //else
			friend.JustFriend(); //execute JustFriend method in Friend
	}

}
