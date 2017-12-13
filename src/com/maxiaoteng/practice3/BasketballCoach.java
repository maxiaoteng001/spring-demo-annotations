package com.maxiaoteng.practice3;

import org.springframework.stereotype.Component;

import com.maxiaoteng.springdemo.Coach;
//Use default bean id
@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes of jump shooting";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
