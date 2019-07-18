package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class GoatService {
	
	public void milk(String goatName) {
		System.out.println("We are milking the goat.  May not taste quite like what you're used to");
	}
	
	public void butcher() {
		System.out.println("This will make for some great curry later.");
	}
	
	public String shear() {
		System.out.println("Hopefully this makes a great rug.");
		return "one pile of goat fur";
	}

}
