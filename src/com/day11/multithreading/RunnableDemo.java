package com.day11.multithreading;

class Hii implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}

class Helloo implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable obj2 = new Hii();
		// (or) Hii obj2 = new Hii();
		Runnable obj3 = new Helloo();
		// (or)Hello obj3 = new Hello();

		Thread t1 = new Thread(obj2); // create obj of thread and pass obj of runnable
		Thread t2 = new Thread(obj3);
		t1.start();
		t2.start();
		// Helloo obj1 = new Helloo(); //The type Runnable cannot be a superinterface of
		// Helloo;
		// a superinterface must be an interface
		// obj.start(); we have start method in thread class, but not in runnable
		// interface it throws error
		// obj1.start();
	}

}
