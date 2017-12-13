package com.maxiaoteng.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create a String array for fortunes
	String[] data = {
		"Diligence is the mother of good luck.",
		"Beware of the wolf in sheep's clothing.",
		"The journey is the reward."
	};
	
	
	// Create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
