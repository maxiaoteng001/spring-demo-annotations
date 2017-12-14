package com.maxiaoteng.practice7;

public class FootballCoach implements Coach {

	private FortuneService theFortuneService;
	
	// Inject dependency via constructor
	
	public FootballCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
		
	
	@Override
	public String getDailyWorkout() {
		
		return "Running 1 kilemeter for warming up!";
	}

	@Override
	public String getDailyFortune() {

		return theFortuneService.getFortune();
	}

}
