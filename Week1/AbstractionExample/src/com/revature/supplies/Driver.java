package com.revature.supplies;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		MechanicalPencil mp = new MechanicalPencil(2);
		Pencil p = new Pencil();
		drawPicture(p, "Elaphant on a house");
		drawPicture(p, "Elaphant on a house");
		drawPicture(p, "Elaphant on a house");
		drawPicture(mp, "house on a elaphant");
		drawPicture(mp, "house on a elaphant");
		drawPicture(mp, "house on a elaphant");
		refillTool(mp);
		//the interface is acting as a contract
		//the compiler will only allow refillabe objects in
		//and regardless of the implementation we know
		//we can call the refill method
		//refillTool(p);
		drawPicture(mp, "An elephant on a house on an elephant");
		List<DrawingTool> tools = new ArrayList<DrawingTool>();
		tools.add(p);
		tools.add(mp);
		putToolsAway(tools, "Art Cabinet");
	}
	
	public static void drawPicture(DrawingTool dt, String subject) {
		dt.draw();
		System.out.println("That is a great looking picture of a " + subject);
	}
	
	public static void refillTool(Refillable refillableTool) {
		refillableTool.refill();
		System.out.println("Our tool is now full and ready to use!!!");
	}
	
	public static void putToolsAway(List<DrawingTool> tools, String place) {
		Iterator<DrawingTool> iter = tools.iterator();
		while (iter.hasNext()) {
			iter.next().store(place);
		}
	}

}
