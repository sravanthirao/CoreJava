package com.day8.oops.abstraction;

// Abstract class can provide implementation of interface
//Interface cannot provide implementation of abstract class because it contains only abstract methods.
interface M {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements M {
	public void a() { // non abstract method
		System.out.println("a method");
	}
}

public class AbstractClassVsInterface extends B {
	public void b() {
		System.out.println("b method");
	}

	public void c() {
		System.out.println("c method");
	}

	public void d() {
		System.out.println("d method");
	}

	public static void main(String[] args) {
		AbstractClassVsInterface obj = new AbstractClassVsInterface();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
