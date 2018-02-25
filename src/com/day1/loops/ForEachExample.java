package com.day1.loops;

import java.util.ArrayList;

public class ForEachExample {
	/*
	 * for(data-type variable : array | collection)
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		for (int i : arr)
			System.out.print(i);
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		list.add("sam");
		list.add("walton");
		for (String s : list)
			System.out.println(s);
	}

}
