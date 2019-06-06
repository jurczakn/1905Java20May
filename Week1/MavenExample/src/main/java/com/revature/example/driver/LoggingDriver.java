package com.revature.example.driver;

import com.revature.example.util.LoggingUtil;

public class LoggingDriver {

	public static void main(String[] args) {
		LoggingUtil.trace("This is a trace log");
		LoggingUtil.debug("This is a debug log");
		LoggingUtil.info("This is an info log");
		LoggingUtil.warn("This is a warn log");
		LoggingUtil.error("This is an error log");
		LoggingUtil.fatal("This is a fatal log");
	}

}
