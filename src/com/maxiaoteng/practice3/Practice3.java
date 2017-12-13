package com.maxiaoteng.practice3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxiaoteng.springdemo.Coach;

public class Practice3 {

	public static void main(String[] args) {

		// Load the Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring container
		Coach myCoach = context.getBean("basketballCoach", Coach.class);
		
		// Call the method of bean
		System.out.println(myCoach.getDailyWorkout());
		
		// Close the Spring container
		context.close();

	}

}
