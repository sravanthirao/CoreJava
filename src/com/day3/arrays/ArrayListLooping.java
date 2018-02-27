package com.day3.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLooping {
	// 5ways: 1.for loop 2.for each loop 3.while loop 4.iterator 5:enumeration
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sravanthi");
		list.add("rao");
		list.add("thakkallapalli");
		System.out.println("looping with for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("looping with foreach loop");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("looping with while loop");
		int j = 0;
		while (list.size() > j) {
			System.out.println(list.get(j));
			j++;
		}

		System.out.println("looping with iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("looping with enumeration");
		Enumeration<String> e = Collections.enumeration(list);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
