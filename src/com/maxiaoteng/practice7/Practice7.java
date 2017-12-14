/**
 * 
 */
package com.maxiaoteng.practice7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jizhu
 *Note: In this practice activity, do not use component scanning.
 *1. Create a new Coach implementation.
 *2. Create a new fortune service implementation (return a single hard-coded fortune)
 *3. Create a Java configuration class to perform IoC and DI with those classes.
 *4. Develop a main application to retrieve your coach implementation.
 */
public class Practice7 {

	public static void main(String[] args) {

		// Load the config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigPractice7.class);
		
		// Retrieve the bean from Spring container
		Coach theCoach = context.getBean("footballCoach", FootballCoach.class);
		
		// Call the methods of bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		// Close the context
		context.close();
	}

}
