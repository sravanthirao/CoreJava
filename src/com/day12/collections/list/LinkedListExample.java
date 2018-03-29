package com.day12.collections.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>(); // linkedlist declaration
		l.add("sravanthi"); // adding string elements
		l.add("rao");
		l.add("thakkallapalli");
		System.out.println("elements are" + l);
		l.add(1, "sravs");
		System.out.println("elements are" + l);
		l.remove(1);
		System.out.println("elements are" + l);
		l.addFirst("S"); // we have addfirst and addlast methods in linked list
		System.out.println("elements are" + l);
		l.addLast("T");
		System.out.println("elements are" + l);
		l.removeLast();
		System.out.println("elements are" + l);
		System.out.println("elements are: " + l.get(0)); // returns oth index element
		l.set(1, "sr");// set 1st element to sr
		System.out.println("elements are" + l);
	}

}
