package com.revature;

public class Driver {
	
	public static void Main(String[] args) {
		
		System.out.println("Fake Hello World!!!");
		
	}
	
	static public void main(String pirateSounds[]) {
		
		System.out.println("Hello World!!!");
		
		/*
		 * for (int i = 0; i < 24; i+=2) { int time = i + 1;
		 * System.out.println("Time is equal to " + time);
		 * System.out.println(greetings(time)); }
		 */
		
		//System.out.println(greetings(Integer.parseInt(pirateSounds[0])));
		
		for (int i  = 0; i < pirateSounds.length; i++) {
			
			int time = Integer.parseInt(pirateSounds[i]);
			
			System.out.println("Time is equal to " + time);
			
			System.out.println(greetings(time));
		
		}
		
	}
	
	public static String greetings(int time) {
		
		String greetingsReturn = "";
		
		if (time < 4) {
			greetingsReturn = "You are up way too early";
		} else if (time < 12) {
			greetingsReturn = "Good morning";
		} else if (time < 17) {
			greetingsReturn = "Good afternoon";
		} else if (time < 19) {
			greetingsReturn = "Good evening";
		} else {
			greetingsReturn = "hi";
		}
		
		return greetingsReturn;
		
	}

}
