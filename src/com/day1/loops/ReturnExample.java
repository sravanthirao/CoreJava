package com.day1.loops;

public class ReturnExample {

	public static void main(String[] args) {
		boolean t = true;
		System.out.println("Before return statement");
		if (t)
			return; // return statement is used to explicitly return from a method
		// compiler will bypass every statement after return
		System.out.println("this will not execute");
	}

}
