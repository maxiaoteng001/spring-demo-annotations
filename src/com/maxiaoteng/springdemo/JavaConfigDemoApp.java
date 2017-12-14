package com.maxiaoteng.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read the Spring config file
		AnnotationConfigApplicationContext myContext = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve the bean from Spring container
		Coach theSillyCoach = myContext.getBean("tennisCoach", Coach.class);
		
		// Call the methods of bean
		System.out.println(theSillyCoach.getDailyWorkout());
		
		// Call the new method for get daily fortune
		System.out.println(theSillyCoach.getDailyFortune());
		
		// Close the Spring container or applicationContext
		myContext.close();
	}

}
