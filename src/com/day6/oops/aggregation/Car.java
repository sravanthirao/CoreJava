package com.day6.oops.aggregation;

public class Car {

	String carname;
	Engine engine; // aggregation

	public static void main(String[] args) {
		Engine e = new Engine();
		e.enginetype("abc", "xyz");

		// Car c =new Car();
		// c.engine.enginetype("abc", "xyz"); getting nullpointer exception

		// or for constructor
		// Engine e=new Engine("abc", "xyz");
	}

}
