package com.revature.thread;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProducerConsumerDriver {

	public static void main(String[] args) {

		Deque<Message> queue = new ArrayDeque<Message>(10);
		Producer producer = new Producer(queue);
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);
		
		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();
		
	}

}
