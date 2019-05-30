package com.revature.driver;

import com.revature.collection.ArrayQueue;
import com.revature.collection.Queue;

public class QueueDriver {

	public static void main(String[] args) {
		Queue queue = new ArrayQueue();
		
		queue.add("first");
		queue.add("second");
		queue.add("third");
		queue.add("fourth");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		for (int i = 1; i < 101; i++) {
			queue.add("" + i);
		}
		
		for (int i = 1; i < 101; i++) {
			System.out.println(queue.poll());
		}
	}

}
