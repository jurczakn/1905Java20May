package com.revature.collection;

public class MyLinkedList implements LinkedList {

	private Node start = null;
	private Node last = null;

	@Override
	public void add(Object o) {
		if (start == null) {
			start = new Node(o);
			last = start;
		} else {
			Node temp = new Node(o);
			this.last.next = temp;
			this.last = temp;
		}

	}

	@Override
	public void add(Object o, int index) {

		Node oldNode = start;

		for (int i = 0; i < index; i++) {
			oldNode = oldNode.next;
		}

		Node newNode = new Node(o);

		newNode.next = oldNode.next;
		oldNode.next = newNode;

	}

	@Override
	public void remove(int index) {
		Node oldNode = start;

		for (int i = 0; i < index; i++) {
			oldNode = oldNode.next;
		}

		oldNode.next = oldNode.next.next;

	}

	@Override
	public Object get(int index) {
		Node oldNode = start;

		for (int i = 0; i < index; i++) {
			oldNode = oldNode.next;
		}
		
		return oldNode.next;
	}

	private class Node {
		public Object value;
		public Node next;

		public Node(Object value) {
			this.value = value;
		}
	}

	@Override
	public boolean contains(Object o) {

		Node n = this.start;
		
		if (n==null) {
			return false;
		}
		
		do {
			if (n.value.equals(o)) {
				return true;
			}
		} while ((n = n.next) != null);
		
		return false;
	}

}
