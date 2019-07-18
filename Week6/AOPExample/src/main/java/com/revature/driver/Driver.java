package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.services.CowService;
import com.revature.services.GoatService;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		CowService cs = (CowService) ac.getBean("cowService");
		
		GoatService gs = (GoatService) ac.getBean("goatService");
		
		System.out.println("-------------------------------");
		
			cs.butcher("I hope I taste great.");
			System.out.println("-------------------------------");
				
			cs.milk("Bessie");
			System.out.println("-------------------------------");
			
			cs.clean("water", "soap", "shampoo", "brush");
			System.out.println("-------------------------------");
			
			cs.milk("Milky");
			System.out.println("-------------------------------");
			
			cs.milk("Insert Cow Name Here");
			System.out.println("-------------------------------");
			
			gs.milk("Goaty");
			System.out.println("-------------------------------");
			
			gs.butcher();
			System.out.println("-------------------------------");
			
			gs.shear();
			System.out.println("-------------------------------");
			
	}

}
