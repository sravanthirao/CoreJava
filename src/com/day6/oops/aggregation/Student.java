package com.day6.oops.aggregation;

public class Student {

	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void display() {
		System.out.println(id + "  -  " + name);
		System.out.println(address.city + "," + address.state + "," + address.country);
	}

	public static void main(String[] args) {
		Address a = new Address("bentonville", "arkansas", "US");
		Student st = new Student(101, "sravanthi", a);
		st.display();

	}

}
