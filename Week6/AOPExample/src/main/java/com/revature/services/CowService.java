package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class CowService {
	
	public void milk(String cowName) {
		
		System.out.println("Got plenty of milk from " + cowName);
		
	}
	
	public void clean(String ... supplies) {
		
		System.out.println("Cleaning a cow with the following supplies: ");
		for (String supply : supplies) {
			System.out.println("\t" + supply);
		}
		
	}
	
	public void butcher(String lastWords) {
		
		System.out.println("Perparing the cow for hamburgers as it says " + lastWords);
		
	}

}
