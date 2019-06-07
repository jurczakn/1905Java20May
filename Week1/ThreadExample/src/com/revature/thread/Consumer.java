package com.revature.thread;

import java.util.Deque;

public class Consumer implements Runnable {
	
	private Deque<Message> queue;
	
	public Consumer(Deque<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		Message msg;
		
		try {
			while (!(msg = queue.pollFirst()).getMsg().equals("Exit")) {
				Thread.sleep(100);
				System.out.println("Consumed " + msg.getMsg());
			}
			queue.push(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
