package com.test;

public class FibonacciUsingRecursion {
	static int x = 0, y = 1, z;

	static void fib(int count) {
		if (count > 0)
		{
			z = x + y;
		System.out.print(" " + z);
		x = y;
		y = z;
		fib(count - 1);
		}

	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(x + " " + y);
		fib(count - 2);

	}

}
// to print for a particular value
// public int fib(int n)
// {
// if(n==0)
// return 0;
// else if (n==1)
// return 1;
// else
// return fib(n-1)+ fib(n-2);
// }
// public static void main(String[] args) {
// FibonacciUsingRecursion f = new FibonacciUsingRecursion();
// System.out.println(f.fib(10));
// }
