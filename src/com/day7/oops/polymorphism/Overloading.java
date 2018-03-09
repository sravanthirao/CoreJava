package com.day7.oops.polymorphism;

public class Overloading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) { // method overloading changing number of arguments
		return a + b + c;
	}

	double add(double a, double b) {// method overloading changing data type of arguments
		return a + b;
	}

	long add(long a, long b, long c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println(o.add(1, 2));
		System.out.println(o.add(1, 2, 3));
		System.out.println(o.add(1.0, 2.0));
		System.out.println(o.add(111111, 222222, 333333));
	}
}
