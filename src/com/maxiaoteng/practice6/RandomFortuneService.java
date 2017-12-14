package com.maxiaoteng.practice6;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String filePath = "spring-demo-annotations/src/fortunes.txt";
	// Create a String array for fortunes
	private List<String> fortunes;
	
	// Create a random number generator
	private Random myRandom = new Random();

	
	public RandomFortuneService() {
		
		File thefile = new File(filePath);
		
		System.out.println("Reading fortunes from file "+filePath);
		
		System.out.println("File exist: "+ thefile.exists());
		
		// Initialize the fortunes
		fortunes = new ArrayList<String>();
		
		try(BufferedReader input = new BufferedReader(new FileReader(thefile))){
			String tempLine;
			
			while((tempLine=input.readLine())!= null) {
				fortunes.add(tempLine);
			}			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
	
	@Override
	public String getFortune() {
		
		// Pick a random string from the array
		int index = myRandom.nextInt(fortunes.size());
		
		String theFortune = fortunes.get(index);
		
		return theFortune;
	}

}
