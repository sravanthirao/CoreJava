package com.day12.collections.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector implements List Interface. Like ArrayList it also maintains insertion
		// order but it is rarely used in non-thread environment as it is synchronized
		// and due to which it gives poor performance in searching, adding, delete and
		// update of its elements.
		Vector<String> v = new Vector<String>();
		v.add("sravanthi");
		v.add("rao");
		v.add("thakkallapalli");
		System.out.println("elements are: " + v);
		v.addElement("sr");
		System.out.println("elements are: " + v);
		System.out.println("size is " + v.size());
		v.remove("sr");
		System.out.println("elements are: " + v.lastElement());
	}

}
