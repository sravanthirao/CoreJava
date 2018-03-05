package com.day4.strings;

public class StringStringBuilderStringBufferConversions {

	public static void main(String[] args) {
		// objects of String are immutable.
		// objects of string builder and string buffer are mutable.
		// String Buffer and String Builder are similar,but string builder is faster
		// String builder is preferred over string buffer for single threaded program.
		// String buffer is preferred is thread safety is needed.

		String str = "hi";
		// String to string builder
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1);
		// String to string builder
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2);

		// String Builder to String
		StringBuilder sb = new StringBuilder("hi");
		String s = sb.toString();// we need to convert String builder/buffer object to String using
									// toString()method.
		System.out.println(s);
		// String Buffer to String
		StringBuffer sbu = new StringBuffer("hi");
		String st = sbu.toString();
		System.out.println(st);

		// StringBuilder to string buffer or vice-versa
		StringBuilder sbr = new StringBuilder("Hello");
		String string = sbr.toString();
		StringBuffer sbf = new StringBuffer(string);
		System.out.println(sbf);

	}

}
