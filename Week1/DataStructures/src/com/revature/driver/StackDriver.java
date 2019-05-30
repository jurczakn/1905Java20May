package com.revature.driver;

import com.revature.collection.ArrayStack;
import com.revature.collection.Stack;

public class StackDriver {

	public static void main(String[] args) {
		Stack myStack = new ArrayStack();
		
		myStack.push("First Element");
		System.out.println(myStack.peek());

		myStack.push("Second Element");
		System.out.println(myStack.peek());
		
		myStack.pop();
		System.out.println(myStack.peek());
		
		for (int i = 0; i < 100; i++) {
			myStack.push("x");
		}
		
		System.out.println(myStack.peek());
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(myStack.pop());
		}

	}

}
