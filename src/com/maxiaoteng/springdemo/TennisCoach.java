package com.maxiaoteng.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// Create the default constructor
	public TennisCoach() {
	
	}
	
	// define a setter method or any method that has a argument.
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	/*
	 * @Autowired
	public TennisCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
