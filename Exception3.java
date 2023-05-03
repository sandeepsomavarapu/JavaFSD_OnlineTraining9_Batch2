package com.ot9.exceptions;

public class Exception3 {
	int a;
	public static void main(String args[]) {// 40 24 1

		try {
			// file
			int a[] = new int[5];// 0,1,2,3,4
			a[2] = 30 / 2;
			String s = "qwerty";
			 int x=Integer.parseInt(s);
			System.out.println(s.length());
			System.out.println("no error  " + a[3]);
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero denominator");
		} catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("index maximum size crossed");
		} catch (NumberFormatException e) {
			System.out.println("unable to convert string to number");
		} catch (Exception e) {
			System.out.println("not handled" + e);
		} finally {
			System.out.println("executes every time for closing connections");
		}
		System.out.println("remaining code  executed...");
	}
}