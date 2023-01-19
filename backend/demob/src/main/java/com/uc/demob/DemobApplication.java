package com.uc.demob;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemobApplication {

	private static final Logger logger = LogManager.getLogger(DemobApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemobApplication.class, args);
		logger.info("UrbanClap application started---");
		logger.info("UrbanClap Info level log message");
		logger.debug("UrbanClap Debug level log message");
		logger.error("UrbanClap Error level log message");
	}

}
