package com.day8.oops.abstraction;

interface Print {
	void print();
}

interface show {
	void print();
}

public class MultipleInheritanceUsingInterface implements Print, show {
	public void print() {
		System.out.println("printed");
	}

	public static void main(String[] args) {
		MultipleInheritanceUsingInterface m = new MultipleInheritanceUsingInterface();
		m.print();

	}

}
