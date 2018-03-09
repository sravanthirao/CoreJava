package com.day5.oops.inheritance;

public class EmployeeTest extends Employee {
	int bonus = 5000;

	public static void main(String[] args) {
		EmployeeTest e = new EmployeeTest();
		System.out.println("bonus is" + e.bonus);
		System.out.println("salary is " + e.salary);
		e.method();
	}

}
