package com.revature.driver;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.House;
import com.revature.beans.StandardWindow;
import com.revature.beans.Window;

public class Driver {

	private static Logger log = Logger.getLogger("DRIVER_LOGGER");

	public static void main(String[] args) {
		// Old way
		/*
		 * House house = new House(); house.setName("I imported the wrong statement");
		 * house.setOwner("Matthew"); Window window = new StandardWindow("small",
		 * "circular", false); house.setWindow(window); log.log(Level.INFO,
		 * "Look at our new house: " + house);
		 */
		// Spring way
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotate.xml");
		House house = (House) ac.getBean("house");
		house.setName("I imported the wrong statement");
		house.setOwner("Matthew");
		Window window = house.getWindow();
		window.setOpen(false);
		window.setSize("small");
		window.setType("circular");
		//log.log(Level.INFO, "Look at our new house: " + house);
		
		House house2 = (House) ac.getBean("house");
		house2.setName("Brave's House");
		house2.setOwner("Ashton");
		Window window2 = house2.getWindow();
		//window2.setOpen(true);
		window2.setSize("Big");
		window2.setType("Square");
		//log.log(Level.INFO, "Look at our new house: " + house2);
		//log.log(Level.INFO, "Look at our new house: " + house);
		//log.log(Level.INFO, "Default Window: " + ac.getBean("window"));
		ac.getBean("lifecycleBean");
		System.exit(0);

	}

}
