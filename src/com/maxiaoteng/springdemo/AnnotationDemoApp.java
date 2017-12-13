package com.maxiaoteng.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read the Spring config file
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring container
		Coach theSillyCoach = myContext.getBean("theSillyCoach", Coach.class);
		
		// Call the methods of bean
		System.out.println(theSillyCoach.getDailyWorkout());
		
		// Close the Spring container or applicationContext
		myContext.close();
	}

}
