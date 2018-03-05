package com.day4.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// String Tokenizer is used to break a string into tokens.
		StringTokenizer s = new StringTokenizer("java programming language");
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());// to print all tokens
		}
	}
}
