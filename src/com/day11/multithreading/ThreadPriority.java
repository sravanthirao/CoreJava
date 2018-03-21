package com.day11.multithreading;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("thread name is: " + Thread.currentThread().getName());
		System.out.println("thread priority is: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority t = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t.start();
		t1.start();
	}

}
