package com.day11.multithreading;

public class ThreadStartTest extends Thread {
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		ThreadStartTest t = new ThreadStartTest();
		t.start();
		t.start();
		// After starting a thread, it can never be started again. If you does so, an
		// IllegalThreadStateException is thrown.
		// In such case, thread will run once but for second time, it will throw
		// exception.
	}

}
