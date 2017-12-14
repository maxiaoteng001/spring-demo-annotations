package com.maxiaoteng.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DefineBeanJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read the Spring config file
		AnnotationConfigApplicationContext myContext = 
				new AnnotationConfigApplicationContext(SportConfigWithoutScan.class);
		
		// Retrieve the bean from Spring container
		SwimCoach theSillyCoach = myContext.getBean("swimCoach", SwimCoach.class);
		
		// Call the methods of bean
		System.out.println(theSillyCoach.getDailyWorkout());
		
		// Call the new method for get daily fortune
		System.out.println(theSillyCoach.getDailyFortune());
		
		// Show the values from properties file
		System.out.println("the variable email :"+ theSillyCoach.getEmail());
		System.out.println("the variable team :"+ theSillyCoach.getTeam());		
		
		
		// Close the Spring container or applicationContext
		myContext.close();
	}

}
