package com.revature.supplies;

public class Pencil extends DrawingTool implements Erasable {
	
	@Override
	public void draw() {
		System.out.println("We are drawing with the pencil, sharp grey lines.");
	}
	
	@Override
	public void erase() {
		System.out.println("That wasn't good.  At least I did it in pencil!!!");
	}

}
