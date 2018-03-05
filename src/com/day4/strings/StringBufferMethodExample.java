package com.day4.strings;

public class StringBufferMethodExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("sravanthi");
		sb.append("rao"); // appends with sravanthi
		System.out.println(sb);
		sb.insert(1, "thakkallapalli");// inserts from index 1
		System.out.println(sb);
		sb.replace(1, 4, "raorao");// replaces index 1 to index 3 with the string
		System.out.println(sb);
		sb.delete(1, 18); // deletes from index 1 to index 17
		System.out.println(sb);
		sb.reverse();// prints reverse of sb
		System.out.println(sb);

	}

}
