package com.numpyninja.codecrafters.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import freemarker.log.Logger;

public class LoggerLoad {
	private static Logger logger = LoggerFactory.getLogger(LoggerLoad.class);

	public static void info(String message) {
		logger.info("Info: " + message);
	}
	
	public static void warn(String message) {
		logger.warn("Warn: " + message);
	}
	
	public static void error(String message) {
		logger.error("Error: " + message);
	}
}