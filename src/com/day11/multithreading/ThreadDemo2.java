package com.day11.multithreading;

//At a time only one thread is executed.
//If you sleep a thread for the specified time,the thread shedular picks up another thread and so on.
class ThreadSleepMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		ThreadSleepMethod t = new ThreadSleepMethod();
		ThreadSleepMethod t1 = new ThreadSleepMethod();
		t.start();
		t1.start();

	}

}
