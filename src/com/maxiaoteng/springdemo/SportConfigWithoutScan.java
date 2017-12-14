package com.maxiaoteng.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfigWithoutScan {

	// Define bean for our Swim Coach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(randomFortuneService());
	}
	// define bean for our Random FortuneService
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
}
