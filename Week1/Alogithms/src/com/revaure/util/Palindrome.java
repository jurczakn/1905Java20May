package com.revaure.util;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		boolean cont;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a word/sentence: ");
			String input = scan.nextLine();
			if (isPalindrome(input)) {
				System.out.println("Congratulation, that is a Palindrome");
			} else {
				System.out.println("Better luck next time");
			}
			
			System.out.println("Do you want to try again?");
			String response = scan.nextLine();
			cont = (response.toLowerCase().charAt(0)=='y') ? true : false;
		} while (cont);
		System.out.println("Thanks for playing ");
	}
	
	private static boolean isPalindromeOld(String input) {
		String reverse = "";
		char[] charArr = input.toCharArray();
		
		for (int i = charArr.length - 1; i >= 0; i--) {
			reverse = reverse + charArr[i];
		}
		
		return reverse.equals(input);
	}
	
	private static boolean isPalindromeOld2(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		return input.equals(sb.toString());
	}
	
	private static boolean isPalindrome(String input) {
		return input.equals(new StringBuilder(input).reverse().toString());
	}

}
