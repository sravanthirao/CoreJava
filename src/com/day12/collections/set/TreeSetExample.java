package com.day12.collections.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TreeSet is similar to HashSet except that it sorts the elements in the
		// ascending order while HashSet doesn’t maintain any order.
		TreeSet<String> t = new TreeSet<String>();
		t.add("sravanthi");
		t.add("rao");
		t.add("thakkallapalli");
		t.add("sravanthi"); // doesnot allow duplicates
		System.out.println("elements are " + t);
		// t.add(null);
		// t.add(null);
		// System.out.println("elements are " + t);
	}

}
