package com.day5.oops.inheritance;

class A {
	void amethod() {
		System.out.println("A class");
	}
}

class B extends A {
	void bmethod() {
		System.out.println("A class");
	}
}

class C extends A {
	void cmethod() {
		System.out.println("A class");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.cmethod();
		c.amethod();
		// c.bmethod(); compiletime error since c extends A but not B.
	}

}
