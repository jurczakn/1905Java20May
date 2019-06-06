package com.revature.example.util;

import org.apache.log4j.Logger;

public class LoggingUtil {
	
	private static Logger log = Logger.getRootLogger();
	
	public static void trace(String msg) {
		log.trace(msg);
	}
	
	public static void debug(String msg) {
		log.debug(msg);
	}
	
	public static void info(String msg) {
		log.info(msg);
	}
	
	public static void warn(String msg) {
		log.warn(msg);
	}
	
	public static void error(String msg) {
		log.error(msg);
	}
	
	public static void fatal(String msg) {
		log.fatal(msg);
	}

}
