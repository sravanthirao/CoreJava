package com.day12.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
		h.put(99, "sravs");
		h.put(88, "rao");
		System.out.println(h);
		// (or)
		for (Map.Entry m : h.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());
	}

}
