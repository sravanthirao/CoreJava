package com.day1.loops;

public class WhileVsDowhile {
	/*
	 * while is a entry controlled loop do-while is a exit controlled loop The key
	 * difference is with do-while we are guaranteed at least one run of the code
	 * before the checks.
	 */
	public static void main(String[] args) {
		int i = 5;
		while (i < 5) {
			System.out.println("condition fails");
			i++;
		}
		System.out.println("condition fails will not print since it come out of loop");

		do {
			System.out.println("condition pass once");
			i++;
		} while (i < 5);
		System.out.println("do-while executes once though its false and comes out of loop");
	}

}
