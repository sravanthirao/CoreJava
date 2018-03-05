package com.day4.strings;

public class StringMethodsExample {

	public static void main(String[] args) {
		String s = "Examples on all String Methods";
		System.out.println(s.charAt(2));// prints character at index 2
		System.out.println(s.substring(1, 5));// prints substring from index1 to index4
		System.out.println(s.substring(5));// prints from index 5 to end of string
		System.out.println(s.concat(" on java"));// concat with the string other way is + operator
		System.out.println(s + "java");
		System.out.println(s.isEmpty()); // checks whether string is empty if not returns false
		System.out.println(s.replace('o', 'r')); // replaces char o with r
		System.out.println(s.replace("all", "every")); // replaces string all with every
		System.out.println(s.equalsIgnoreCase("Examples on all String Methods"));// checks with string if equal or not
		System.out.println(s.indexOf('a')); // returns index of character 'a'
		System.out.println(s.indexOf("on")); // returns index of string
		System.out.println(s.length()); // length of the string
		System.out.println(s.toLowerCase()); // converts to lower-case letters
		System.out.println(s.toUpperCase()); // converts to upper-case letters
		System.out.println(s.trim()); // removes spaces at beginning and end of string
		System.out.println(s.startsWith("Ex"));// returns true if it starts with "ex"
		System.out.println(s.endsWith("a"));// returns false if it not ends with 'a'
		int x = 10;
		String s1 = String.valueOf(x);// valueOf() method converts given type such as int,double,float.long,char
										// boolean into string
		System.out.println(s1 + 10);
		String s2 = "ABC";
		String s3 = "XYZ";
		// Strings can be compared by 1.equals() method 2.==operator 3.compareTo()
		// method
		System.out.println(s2.compareTo(s3));// <0 s2 comes first so returns -() lexicographic order
		System.out.println(s3.compareTo(s2));// >0 s3 comes later
		System.out.println(s2.compareTo(s2)); // 0 if both are equal

	}

}
