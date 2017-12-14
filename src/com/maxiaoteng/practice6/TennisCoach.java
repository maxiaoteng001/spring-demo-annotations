package com.maxiaoteng.practice6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// Create the default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Now in default constructor.\n");
	}
	
	// Create the PostConstruct method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Now in doMyStartupStuff() method for init-method\n");
	}
	
	
	// Create the PreDestroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: Now in doMyCleanupStuff() method for destroy-method\n"); 
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
