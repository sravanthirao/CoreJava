package com.day3.arrays;

public class ArrayExample {
	/*
	 * Array stores similar elements with fixed size,indexed based(1st element is
	 * stored at 0 index adv: code optimization(we can retrieve easily),random
	 * access disadv:fixed length (solution is collections framework)
	 */
	// syntax: datatype arrayrefvariable = new datatype[size];
	public static void main(String[] args) {
		int a[] = new int[5]; // declaration and instantiation
		a[0] = 1; // initialization
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println("element at 4th position is" + a[3]);
		// to print an array
		for (int i : a)
			System.out.println("elements are" + i);

		// or
		for (int i = 0; i < a.length; i++)
			System.out.println("elements are" + a[i]);
	}

}
