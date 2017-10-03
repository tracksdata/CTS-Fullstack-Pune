package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Test {
	static Logger log = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/log4j.properties");

		log.debug("Sample debug message");
		log.info("Sample info message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
		System.out.println("-- Done");
	}

}