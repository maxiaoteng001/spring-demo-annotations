package com.maxiaoteng.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Retrieve the beans from the Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		// print out the beans' location
		
		System.out.println("Pointing to the same object "+result);
		
		System.out.println("Memory location for theCoach: "+ theCoach);
		
		System.out.println("Memory location for alphaCoach: "+ alphaCoach);
		
		// Close the context
		context.close();
		
	}

}
