package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.daos.BearRepo;

public class DataDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("data.xml");
		
		BearRepo bearRepo = (BearRepo) ac.getBean("bearRepo");
		
		System.out.println(bearRepo.findAllByBreed("football"));
		
		
		
	}

}
