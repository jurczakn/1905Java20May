package com.revature.runner;

public class StringRunner {
	
	public boolean isPalandrome(String s) {
		
		if (s==null) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length()-(i+1))){
				return false;
			}
		}
		
		return true;
	}

}
