package com.maxiaoteng.practice7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPractice7 {
	
	@Bean 
	public FortuneService godFortuneService() {
		return new GodFortuneService();
	}
	
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(godFortuneService());
	}
}
