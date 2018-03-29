package com.day12.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// LinkedHashSet is also an implementation of Set interface, it is similar to
		// the HashSet and TreeSet except the below mentioned differences:
		// HashSet doesn’t maintain any kind of order of its elements.
		// TreeSet sorts the elements in ascending order.
		// LinkedHashSet maintains the insertion order. Elements gets sorted in the same
		// sequence in which they have been added to the Set.
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("sravanthi");
		l.add("rao");
		l.add("thakkallapalli");
		System.out.println(l);

	}

}
