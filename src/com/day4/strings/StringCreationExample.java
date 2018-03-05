package com.day4.strings;

public class StringCreationExample {

	public static void main(String[] args) {
		String s1 = "sravanthi"; // creating string by java string literal
		char[] ch = { 'r', 'a', '0' };
		String s2 = new String(ch); // creating string by converting char array to string
		String s3 = new String("thakkallapalli"); // creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
 
	}

}
