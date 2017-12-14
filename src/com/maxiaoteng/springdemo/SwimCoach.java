package com.maxiaoteng.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	public String getEmail() {
		return this.email;
	}



	public String getTeam() {
		return this.team;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice FreeStyle swimming for 30 minutes.\n";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
