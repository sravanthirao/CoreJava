package com.day10.exceptionhandling;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println(x);
			System.out.println("in try block");
		} catch (Exception e) {
			System.out.println("catch all types of exceptions");
		} finally {
			System.out.println("finally will surely execute");
		}
		System.out.println("Out of try-catch-finally");
	}

}
