package com.day4.strings;

public class StringReverse1 {
	public static String reverse(String s) {
	char ch[]= s.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
	}
	return rev;
	}

}
