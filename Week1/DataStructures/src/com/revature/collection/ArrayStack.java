package com.revature.collection;

import java.util.Arrays;

public class ArrayStack implements Stack {

	private Object[] stack;
	private static int counter = 0;
	private int length;

	public ArrayStack() {
		this.stack = new Object[50];
		counter++;
		this.length = 0;

	}

	@Override
	public Object pop() {

		if (empty()) {
			return null;
		} else {
			Object ret = this.stack[this.length - 1];
			this.stack[this.length - 1] = null;
			length--;
			return ret;
		}
	}

	@Override
	public void push(Object o) {
		if (length < this.stack.length) {
			this.stack[length] = o;
			length++;
		} else {
			Object[] temp = new Object[this.stack.length * 2];
			System.arraycopy(this.stack, 0, temp, 0, this.stack.length);
			temp[this.length] = o;
			this.stack = temp;
			length++;
		}
	}

	@Override
	public Object peek() {
		return this.stack[length - 1];
	}

	@Override
	public boolean empty() {
		if (length == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(Object o) {
		
		for (Object o1 : this.stack) {
			
			if (o1 == null) {
				return false;
			}
			
			if (o1.equals(o)) {
				return true;
			}
		}
		return false;
	}

}
