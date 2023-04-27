package com.ot9.oops;

import java.util.Date;

class SuperEx {
	int age = 30;

	public void displayDate() {
		Date date = new Date();
		System.out.println("Today's Date :" + date);
	}

	public void printAge() {
		++age;
		System.out.println("Your Age is :" + age);
	}
}

public class MethodOverridingEx extends SuperEx {
	@Override
	public void printAge() {
		--age;
		System.out.println("Your updated Age is :" + age);
	}

	public void displayMsg() {

		System.out.println("Hello !! Good Evening");
	}

	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.displayDate();
		obj.printAge();
		obj.displayMsg();
	}

}
