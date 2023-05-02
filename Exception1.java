package com.ot9.exceptions;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First number division");
		int firstNum = scan.nextInt();
		System.out.println("Enter Second number division");
		int secondNum = scan.nextInt();
		try {
		int result = firstNum / secondNum;
		System.out.println("Division of two numbers : " + result);
		}catch (ArithmeticException e) {
		System.out.println("dont enter zero as denominator");
		}
		
		System.out.println("Remaining lines of code ....");
		
		//Abnormal Termination
		//system defined error messages 
	}
}
