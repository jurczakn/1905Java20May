package com.revature.pojo;

import java.io.FileNotFoundException;
/*
 * When Overriding a method you can have the same access level
 * or one that is less restrictive, the same return types and parameter types
 * or children of the parents, and the same exception throw, child exceptions thrown
 * or no exceptions thrown.
 */
public class ChocolateBar extends Candy {
	
	@Override
	protected boolean containsNuts() {
		return true;
	}

	public void snap() {
		System.out.println("You now have 2 half pieces of a chocolate bar!!!");
	}
	
	@Override
	public ChocolateBar self() {//throws FileNotFoundException {
		return this;
	}
	
}
