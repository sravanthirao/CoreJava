package com.day12.collections.list;

import java.util.ArrayList;

public class ArrayListExample {
	// The issue with arrays is that they are of fixed length so if it is full you
	// cannot add any more elements to it, likewise if there are number of elements
	// gets removed from it the memory consumption would be the same as it doesn’t
	// shrink. On the other ArrayList can dynamically grow and shrink after addition
	// and removal of elements.
	// Apart from these benefits ArrayList class enables us to use predefined
	// methods of it which makes our task easy.
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>(); // creating arraylist with string type
		// adding elements.
		obj.add("sravanthi");
		obj.add("rao");
		obj.add("thakkallapalli");
		obj.add("sravanthi");// allows duplicates
		System.out.println("arraylist contains" + obj);// printing all elements
		obj.remove("rao"); // removing an element
		obj.remove(1);// removing with index number
		System.out.println("arraylist contains" + obj);// printing elements
		obj.add(0, "sravs"); // adding an element at index 0
		System.out.println("arraylist contains" + obj);// printing elements
		System.out.println("arraylist contains " + obj.size() + "elements");// printing total no of elements
		System.out.println(obj.contains("sravs"));// checks whether arraylist contains the string or not
		obj.clear();
		System.out.println("arraylist contains" + obj);// printing elements
		obj.add(null);
		obj.add(null);//allows null
		System.out.println("arraylist contains" + obj);

	}

}
