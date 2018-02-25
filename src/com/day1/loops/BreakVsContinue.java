package com.day1.loops;

public class BreakVsContinue {
	/*
	 * Break leaves the loop completely & executes the statements after the loop
	 * Continue leaves the current iteration & executes next value in the loop.
	 */
	public static void main(String[] args) {
		int i;
		for (i = 0; i < 10; i++) {
			if (i == 5)
				break;
			System.out.print(i);
		}
		System.out.println();
		for (i = 0; i < 10; i++) {
			if (i == 4)
				continue;
			System.out.print(i);
		}
	}

}
