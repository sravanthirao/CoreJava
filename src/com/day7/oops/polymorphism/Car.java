package com.day7.oops.polymorphism;

public class Car extends Vehicle { // car is sub class
	void run() {// overiding method
		System.out.println("running safely");// this run method is overiding the vehicle run method
	}

	public static void main(String[] args) {
		Vehicle c = new Car();

		// or
		// Car c = new Car()
		c.run();

	}

}
