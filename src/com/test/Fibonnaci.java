package com.test;

public class Fibonnaci {
	// 0112358... using for loop

	public static void main(String[] args) {
		int x = 0, y = 1, z;
		int count=10;
		System.out.print(x +" " +y);
		for (int i = 2; i < count; i++) {
			z = x + y;
			System.out.print(" "+z);
			x = y;
			y = z;
		}
		
	}

}
