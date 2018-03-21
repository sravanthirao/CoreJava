package com.day11.multithreading;

public class ThreadRunTest extends Thread {
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		ThreadStartTest t = new ThreadStartTest();
		t.run();
		t.run();// if we use run method instead of start..then there is no context-switching
				// because here t  will be treated as normal object not thread object.
	}
}
