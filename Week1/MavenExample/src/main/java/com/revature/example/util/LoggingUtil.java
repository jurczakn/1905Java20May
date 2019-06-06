package com.revature.example.util;

import org.apache.log4j.Logger;

public class LoggingUtil {
	
	private static Logger log = Logger.getRootLogger();
	
	public static void trace(String msg) {
		log.trace(msg);
	}

}
