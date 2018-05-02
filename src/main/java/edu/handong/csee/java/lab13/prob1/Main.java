package edu.handong.csee.java.lab13.prob1; // the file is in this package

public class Main { //declare public type Main class

	public static void main(String[] args) { //main method
		Friend friend1 = new Friend(); //make instance of Friend
		SchoolFriend friend2 = new SchoolFriend(); //make instance of SchoolFriend
		ClassFriend friend3 = new ClassFriend(); //make instance of ClassFriend
		
		InstanceOf.WhatFriend(friend1); //execute WhatFriend static method in InstanceOf class, put friend1 to parameter
		InstanceOf.WhatFriend(friend2); //execute WhatFriend static method in InstanceOf class, put friend2 to parameter
		InstanceOf.WhatFriend(friend3); //execute WhatFriend static method in InstanceOf class, put friend3 to parameter
	}

}
