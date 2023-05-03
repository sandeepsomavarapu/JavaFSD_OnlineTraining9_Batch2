package com.ot9.exceptions;//our class should extends exception

//parameterized constructor
class AgeNotValidException extends Exception {

	public AgeNotValidException(String message) {
		super(message);
	}
}

public class Exception6 {
	static void validation(int age) throws AgeNotValidException {
		if (age < 18)
			throw new AgeNotValidException("you are not eligable to vote :"+age);
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) {
		try {
			Exception6.validation(9);
		} catch (AgeNotValidException e) {
			System.out.println("Invalid Age");

		} finally {
			System.out.println("executes every time");
		}
		System.out.println("rest of the code...");
	}
}