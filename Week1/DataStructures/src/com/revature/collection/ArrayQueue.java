package com.revature.collection;

public class ArrayQueue implements Queue {
	private Object[] queue;
	private static int counter = 0;
	private int length;

	public ArrayQueue() {
		this.queue = new Object[50];
		counter++;
		this.length = 0;

	}

	@Override
	public Object poll() {

		if (empty()) {
			return null;
		} else {
			Object ret = this.queue[0];
			System.arraycopy(this.queue, 1, this.queue, 0, this.length-1);
			length--;
			return ret;
		}
	}

	@Override
	public void add(Object o) {
		if (length < this.queue.length) {
			this.queue[length] = o;
			length++;
		} else {
			Object[] temp = new Object[this.queue.length * 2];
			System.arraycopy(this.queue, 0, temp, 0, this.queue.length);
			temp[this.length] = o;
			this.queue = temp;
			length++;
		}
	}

	@Override
	public Object peek() {
		return this.queue[0];
	}

	@Override
	public boolean empty() {
		if (length == 0) {
			return true;
		} else {
			return false;
		}
	}


}
