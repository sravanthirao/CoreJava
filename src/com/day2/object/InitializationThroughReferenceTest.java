package com.day2.object;

public class InitializationThroughReferenceTest {

	public static void main(String[] args) {
		InitializationThroughReference t = new InitializationThroughReference();
		t.id = 100;
		t.name = "sravanthi";
		System.out.println(t.id + " " + t.name);

		// u can create multiple and store through reference variable
		InitializationThroughReference t1 = new InitializationThroughReference();
		t1.id = 101;
		t1.name = "thakkallapalli";
		System.out.println(t1.id + " " + t1.name);
	}

}
