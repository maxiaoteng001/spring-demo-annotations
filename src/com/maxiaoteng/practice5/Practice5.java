package com.maxiaoteng.practice5;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author jizhu
 *
 *1. Define a new implementation for the FortuneService.
 *	Your fortune service should read the fortunes from a file.
 *	The fortune service should load the fortunes into an array
 *	When the getFortune() method is called it would return a random fortune from the array.
 *
 *2. Inject your new dependency into your Coach implementation
 *
 *3. Test your application to verify you are getting random fortunes based on your fortunes file.
 */
public class Practice5 {

	public static void main(String[] args) {
		
		// Load the Spring config file: practice5-applicationContext.xml
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("practice5-applicationContext.xml");
		
		
		// Get the bean
		Coach theCoach = context.getBean("theSillyCoach", Coach.class);
		
		// Call the getDailyFortune() method for determine whether config is right
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// Close Spring Container
		context.close();
	}

}
