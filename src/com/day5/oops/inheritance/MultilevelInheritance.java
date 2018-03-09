package com.day5.oops.inheritance;

class LabDog extends Dog { // from single inheritance extends dog which again extends animal
	void any() {
		System.out.println("any dog");
	}
}

public class MultilevelInheritance {

	public static void main(String args[]) {
		LabDog m = new LabDog();
		m.any();
		m.bark();
		m.eat();
	}

}
