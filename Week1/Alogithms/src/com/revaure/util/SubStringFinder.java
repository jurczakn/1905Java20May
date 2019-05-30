package com.revaure.util;

import java.util.ArrayList;
import java.util.Scanner;

public class SubStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cont;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a word/sentence: ");
			String input = scan.nextLine();
			System.out.println("What are you searching for?");
			String subString = scan.nextLine();
			
			ArrayList<Integer> results = findSubString(input, subString);
			
			System.out.println("There are " + results.size() + " instances of " +
								subString + " inside the text.");
			System.out.println("They are at the following indexes: ");
			for (Integer i : results) {
				System.out.println(i);
			}

			System.out.println("Do you want to try again?");
			String response = scan.nextLine();
			cont = (response.toLowerCase().charAt(0) == 'y') ? true : false;
		} while (cont);
		System.out.println("Thanks for playing ");
	}
	
	public static ArrayList<Integer> findSubString(String input, String subString) {
		char[] inputArr = input.toCharArray();
		char[] subArr = subString.toCharArray();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == subArr[0]) {
				boolean finished = true;
				for (int j = 1; j < subArr.length; j++) {
					if ((i+j > input.length()) || subArr[j] != inputArr[i+j]) {
						finished = false;
						break;
					}
				}
				if (finished) {
					results.add(i);
				}
				
			}
		}
		return results;
	}
}
