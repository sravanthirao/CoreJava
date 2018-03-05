package com.day4.strings;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// String is immutable, String buffer and string builder are mutable

		// If the string is going to be constant throughout the program then use String
		// class object since string object is immutable

		// If a string can change and will only be accessed by single thread then using
		// String builder is good enough.

		// If a string can change and will be accessed by multiple threads then use
		// String buffer since it is synchronous so that we have thread safety
		
		String s1 = "hi";
		s1.concat("hello");
		System.out.println(s1);// s1 is not changed
		StringBuilder s2 = new StringBuilder("hi");
		s2.append("hello");
		System.out.println(s2);// s2 is changed
		StringBuffer s3 = new StringBuffer("hi");
		s3.append("hello");
		System.out.println(s3);

	}

}
