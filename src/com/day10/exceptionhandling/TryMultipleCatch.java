package com.day10.exceptionhandling;

public class TryMultipleCatch {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[4] = 30 / 0;
			System.out.println("last statement in try block");
		} catch (ArithmeticException e) {
			System.out.println("should not divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array element which is out of the limit");
		} catch (Exception e) {
			System.out.println("handles any exception");
		}
		System.out.println("out of try-catch block");
	}
	// In the above example there are multiple catch blocks and these catch blocks
	// executes sequentially when an exception occurs in try block. Which means if
	// you put the last catch block ( catch(Exception e)) at the first place, just
	// after try block then in case of any exception this block will execute as it
	// can handle all exceptions.
	// This catch block should be placed at the last to avoid such situations.

}
