package com.maxiaoteng.practice6;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author jizhu
 *
 *1. Modify your file based fortune service to make use of the @PostConstruct annotation
 *2. In the @PostConstruct code, read the fortunes from the file system
 *3. Test your application and verify your @PostConstruct code is being executed. Hint, add some println statements.
 */
public class Practice6 {

	public static void main(String[] args) {
		
		// Load the Spring config file: practice5-applicationContext.xml
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("practice6-applicationContext.xml");
		
		
		// Get the bean
		Coach theCoach = context.getBean("theSillyCoach", Coach.class);
		
		// Call the getDailyFortune() method for determine whether config is right
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// Close Spring Container
		context.close();
	}

}
