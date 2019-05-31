package com.revature.driver;

import java.time.Duration;
import java.time.LocalDateTime;

import com.revature.collection.ArrayQueue;
import com.revature.collection.ArrayStack;
import com.revature.collection.LinkedList;
import com.revature.collection.MyLinkedList;
import com.revature.collection.Queue;
import com.revature.collection.Stack;
import com.revature.collection.Tree;

public class TreeDriver {
	
	private static final int SIZE = 10000000;

	public static void main(String[] args) {
		
		Tree t2 = new Tree();
		generateArr(t2, SIZE);
		
		LocalDateTime start = LocalDateTime.now();
		t2.contains(576);
		LocalDateTime end = LocalDateTime.now();
		System.out.println("Queue Completed in: " + Duration.between(start, end).toMillis());
		
		Queue q = new ArrayQueue();
		generateArr(q, SIZE);
		
		start = LocalDateTime.now();
		q.contains(576);
		end = LocalDateTime.now();
		System.out.println("Queue Completed in: " + Duration.between(start, end).toNanos());
		
		
		Stack s = new ArrayStack();
		generateArr(s, SIZE);
		
		start = LocalDateTime.now();
		s.contains(576);
		end = LocalDateTime.now();
		System.out.println("Stack Completed in: " + Duration.between(start, end).toNanos());
		
		LinkedList l = new MyLinkedList();
		generateArr(l, SIZE);
		start = LocalDateTime.now();
		l.contains(576);
		end = LocalDateTime.now();
		System.out.println("Linked List Completed in: " + Duration.between(start, end).toNanos());
		
		//System.out.println("LOADING....");
		Tree t = new Tree();
		generateArr(t, SIZE);
		
		start = LocalDateTime.now();
		t.contains(576);
		end = LocalDateTime.now();
		System.out.println("Tree Completed in: " + Duration.between(start, end).toNanos());
		
		
	}
	
	private static void generateArr(Queue q, int size) {
		for (int i = 0; i < size; i++) {
			q.add((int) ((Math.random() * 200000) - 100000));
		}
	}
	
	private static void generateArr(Stack s, int size) {
		for (int i = 0; i < size; i++) {
			s.push((int) ((Math.random() * 200000) - 100000));
		}
	}
	
	private static void generateArr(LinkedList l, int size) {
		for (int i = 0; i < size; i++) {
			l.add((int) ((Math.random() * 200000) - 100000));
		}
	}
	
	private static void generateArr(Tree t, int size) {
		for (int i = 0; i < size; i++) {
			t.add((int) ((Math.random() * 200000) - 100000));
		}
	}

}
