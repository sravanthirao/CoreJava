package com.day8.oops.abstraction;

abstract class Bike {
	abstract void run();
}

public class AbstractClassExample extends Bike {

	void run() {
		System.out.println("running");

	}

	public static void main(String[] args) {
		AbstractClassExample a = new AbstractClassExample();
		a.run();

	}

}
