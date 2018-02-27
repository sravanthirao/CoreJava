package com.day0.variables;

//variables 3 types
public class VariablesExample {
	int x = 10;// instance variable
	static int y = 9;// static variable

	void method() {
		int z = 8;// local variable
		System.out.println("z value is" + z);
	}

	public static void main(String[] args) {
		System.out.println("y value is" + y);// since y is static u can access it directly.
		VariablesExample v = new VariablesExample();
		v.method(); // local variable exists within the method only so u can call non-static method
					// with object reference only
		System.out.println("x value is" + v.x);// instance variable is created when
		// object is created so u can only access with object reference
	}

}
