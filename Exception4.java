package com.ot9.exceptions;

class Exception4 {
	public static void main(String args[]) {
		try {
			int c = 12 / 6;
			try {
				System.out.println("Division");
				int b = 30 / 2;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[3];
				a[2] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array index problem");
			} finally {
				System.out.println("always will execute finally block 	");
			}
			System.out.println("remaing try  statements");
		} catch (Exception e) {
			System.out.println("handeled");
		}
		System.out.println("normal execution..");
	}
}