package edu.cis232;

import java.util.StringTokenizer;

public class CsvData {

	public static void main(String[] args) {
		String data = "   Alex,5000   ,username   ";
		data = data.trim(); //Clean spaces from beginning and end

		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		
		if(tokenizer.countTokens() != 3){
			System.err.println("Data input requires 3 tokens!");
			System.exit(-1);
		}
		String name = tokenizer.nextToken();
		int points = Integer.parseInt(tokenizer.nextToken().trim());
		String username = tokenizer.nextToken();
		
		System.out.printf("Congratulations %s, you have %,d points!%n", name, points);
	}

}
