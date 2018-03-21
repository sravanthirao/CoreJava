package com.day11.multithreading;

// join method , setting and getting name of the thread
public class ThreadJoinMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		ThreadJoinMethod t = new ThreadJoinMethod();
		ThreadJoinMethod t1 = new ThreadJoinMethod();
		ThreadJoinMethod t2 = new ThreadJoinMethod();
		System.out.println("thread is" + t.getName());
		System.out.println("thread is" + t1.getName());
		t1.setName("Sravanthi");
		System.out.println("id is " +t1.getId());
		System.out.println("changed thread t1 name is:" + t1.getName());
		System.out.println("thread is" + t2.getName());
		t.start();
		try {
			t.join();
		} catch (Exception e) {
		} // when t completes its task then t1 and t2 starts executing.

		// try{t.join(1000);}catch(Exception e) {} //when t is completes its task for
		// 1000 miliseconds then t1 and t2 starts executing.

		t1.start();
		t2.start();

	}

}
