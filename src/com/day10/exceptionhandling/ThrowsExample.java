package com.day10.exceptionhandling;

public class ThrowsExample {

	public static void main(String[] args)throws ArithmeticException {
	try {
     int i=10/0;
     System.out.println(i);
	}
	catch(ArithmeticException e) {
		System.out.println("handled");
	}
	}
}
