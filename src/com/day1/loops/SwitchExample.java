package com.day1.loops;

public class SwitchExample {

	public static void main(String[] args) {
		// switch for characters
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");

		}
		System.out.println("your grade is " + grade);

		// switch for numbers

		int num = 10;
		switch (num) {
		case 10:
			System.out.println("ten");
			break;
		case 20:
			System.out.println("twenty");
			break;
		default:
			System.out.println("not found");
		}
	}
}
