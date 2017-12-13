package com.maxiaoteng.practice5;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create a String array for fortunes
	String[] data = new String[3];
	
	// Create a constructor for init the data array
	public RandomFortuneService(@Value("${fortune0}")String data0, 
									@Value("${fortune1}")String data1, 
									@Value("${fortune2}")String data2) {
		data[0] = data0;
		data[1] = data1;
		data[2] = data2;
	}
	
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
