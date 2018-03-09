package com.day8.oops.abstraction;


//class implements an interface but one interface extends other interface
interface Printable {
	void print();
}

interface showable extends Printable {
	void show();
}

public class InterfaceInheritance implements showable {
	public void print() {
		System.out.println("printed");
	}

	public void show() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		InterfaceInheritance m = new InterfaceInheritance();
		m.print();
		m.show();

	}

}
