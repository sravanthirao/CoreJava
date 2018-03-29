package com.day12.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	// HashMap doesn’t maintain any order.
	// TreeMap sort
	// the entries
	// in ascending
	// order of
	// keys.
	// LinkedHashMap maintains
	// the insertion order.

	public static void main(String[] args) {
		TreeMap<Integer, String> h = new TreeMap<Integer, String>();
		h.put(99, "sravs");
		h.put(88, "rao");
		System.out.println(h);
		// (or)
		for (Map.Entry m : h.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());
	}

}
