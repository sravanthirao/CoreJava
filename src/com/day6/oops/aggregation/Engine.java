package com.day6.oops.aggregation;

public class Engine {
	String model;
	String name;

	public void enginetype(String model, String name) {
		this.model = model;
		this.name = name;
		System.out.println(model + "" + name);

	}

	// or using constructor
	// public Engine(String model, String name) {
	// this.model=model;
	// this.name=name;
	// System.out.println(model +""+ name);
	//
	// }
}
