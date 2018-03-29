package com.day12.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(99, "sravs");
		h.put(88, "rao");
		System.out.println(h);
		// (or)
		for (Map.Entry m : h.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());
	}

}
