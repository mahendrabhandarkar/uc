package com.uc.demo.config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.uc.demo.controller.AvailsController;

// Generic Logging API of every function call of this project. It is Aspect Oriented Programming
@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LogManager.getLogger(AvailsController.class);

	@Pointcut(value = "execution(* com.uc.demo.service.*.*(..))")
	private void businessService() {
		logger.info("--------- Service API Call -----------------");
	}  // signature

	@Before(value = "businessService()")
	public void doBeforeTask(){
		logger.info("--------- Before any Task -----------------");
	}

	@After(value = "businessService()")
	public void doAfterTask(){
		logger.info("--------- After any Task -----------------");
	}

	@AfterReturning(pointcut = "businessService()", returning="retVal")
	public void doAfterReturnningTask(Object retVal){
	  // you can intercept retVal here.
		logger.info("--------- After returning to Task -----------------");
	}

	@AfterThrowing(pointcut = "businessService()", throwing="ex")
	public void doAfterThrowingTask(Exception ex){
	  // you can intercept thrown exception here.
		logger.error("--------- Intercept thrown exception here -----------------");
	}

	@Around(value = "businessService()")
	public void doAroundTask(){
		logger.info("--------- execute any Task -----------------");
	}
	
}
