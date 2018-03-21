package com.day11.multithreading;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + "is Daemon thread");
		} else {
			System.out.println(Thread.currentThread().getName() + "is user thread");
		}
	}

	public static void main(String[] args) {
		DaemonThread d = new DaemonThread();
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		// If you want to make a user thread as Daemon,
		// it must not be started otherwise it will throw IllegalThreadStateException.
		d.setDaemon(true);
		d.start();
		d1.start();
		d2.start();

	}

}
