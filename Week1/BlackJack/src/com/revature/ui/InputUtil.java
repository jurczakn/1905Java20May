package com.revature.ui;

import java.util.Scanner;

public class InputUtil {
	
	private static final Scanner SCAN = new Scanner(System.in);
	
	public static int getNumber(int min, int max) {
		
		System.out.println("Please input a number between " + min + " and " + max);
		
		int input = SCAN.nextInt();
		
		if (input < min || input > max) {
			return getNumber(min, max);
		}
		
		return input;
		
	}

}
