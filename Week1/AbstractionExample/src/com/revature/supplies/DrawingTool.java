package com.revature.supplies;

public abstract class DrawingTool {
	
	public abstract void draw();
	
	public void store(String place) {
		System.out.println("The tool has been placed in the " + place);
	}

}
