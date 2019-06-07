package com.revature.thread;

public class ThreadDriver {

	public static void main(String[] args) {
		new MyThread().start();
		new Thread(new MyRunnable()).start();
		
		for (int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);
		
		System.out.println("Threads started");
	}

}
