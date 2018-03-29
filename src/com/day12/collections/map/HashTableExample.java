package com.day12.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	// Hashtable is similar to HashMap except it is synchronized.
	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(99, "sravs");
		h.put(88, "rao");
		System.out.println(h);
		
		//(or)
		for(Map.Entry m : h.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
