package com.revature.driver;

import com.revature.pojo.Project0;

public class Driver {
	
	public static void main(String[] args) {
		int i = 1;
		for (;;) {
			new Project0("" + i++);
			System.out.println("Creating Object : " + i);
			//Can you force Garbage Collection? NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
			//System.gc is suggesting garbage collection
			if (i%15 == 0) System.gc();
		}
	}

}
