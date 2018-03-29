package com.day12.collections.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet doesn’t maintain any order, the elements would be returned in any
		// random order.
		// HashSet doesn’t allow duplicates. If you try to add a duplicate element in
		// HashSet, the old value would be overwritten.
		// HashSet allows null values however if you insert more than one nulls it would
		// still return only one null value.
		// HashSet is non-synchronized.
		// The iterator returned by this class is fail-fast which means iterator would
		// throw ConcurrentModificationException if HashSet has been modified after
		// creation of iterator, by any means except iterator’s own remove method.
		HashSet<String> h = new HashSet<String>();
		h.add("sravanthi");
		h.add("rao");
		h.add("thakkallapalli");
		h.add("sravanthi"); // doesnot allow duplicates
		h.add(null);
		h.add(null); // only one null is allowed.
		System.out.println("elements are " + h);

	}

}
