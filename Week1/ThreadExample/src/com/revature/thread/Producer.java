package com.revature.thread;

import java.util.Deque;

public class Producer implements Runnable {
	
	private Deque<Message> queue;
	
	public Producer(Deque<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			Message msg = new Message();
			msg.setMsg("" + i);
			
			queue.push(msg);
			System.out.println("Produced " + msg.getMsg());
			
		}
		
		Message msg = new Message();
		msg.setMsg("Exit");
		queue.push(msg);
		
	}

}
