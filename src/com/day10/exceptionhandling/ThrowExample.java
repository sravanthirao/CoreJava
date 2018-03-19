package com.day10.exceptionhandling;

public class ThrowExample {
	// In java we can create our own exception class and throw that exception using
	// throw keyword.
	// These exceptions are known as user-defined or custom exceptions.
	static void rule(int age, int weight) {
		if (age < 18 && weight <50)
			throw new ArithmeticException("Not eligible");
		else

			System.out.println("eligible");
	}

	public static void main(String[] args) {
		rule(10, 48);
	}

}
