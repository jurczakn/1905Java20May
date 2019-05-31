package com.revature.collection;

public class Tree {
	
	private Node root = null;
	
	public void add(int o) {
		if (root == null) {
			this.root = new Node(o);
		} else {
			
			Node next = root;
			
			do {
				if (next.value == o) {
					return;
				} else if(next.value < o) {
					if (next.right == null) {
						next.right = new Node(o);
						next = null;
					} else {
						next = next.right;
					}
				} else {
					if (next.left == null) {
						next.left = new Node(o);
						next = null;
					} else {
						next = next.left;
					}
				}
			} while (next != null);
		}
	}
	
	public boolean contains(int i) {
		Node next = root; 
		
		do {
			if (next.value == i) {
				return true;
			} else if (next.value > i) {
				next = next.left;
			} else {
				next = next.right;
			}
		} while (next != null);
		
		return false;
		
	}
	
	private class Node {
		public int value;
		public Node left = null;
		public Node right = null;
		
		public Node(int value) {
			this.value = value;
		}
	}

}
