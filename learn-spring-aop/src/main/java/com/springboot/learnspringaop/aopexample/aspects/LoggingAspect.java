package com.springboot.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	//PointCut - When?
	@Before("execution(* com.springboot.learnspringaop.aopexample.business.*.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		//Logic - What?
		logger.info("Before Aspect - Method is called -{}", joinPoint);
		//Before Aspect - Method is called -execution(int com.springboot.learnspringaop.aopexample.business.BusinessService1.calculateMax())
	}
}
