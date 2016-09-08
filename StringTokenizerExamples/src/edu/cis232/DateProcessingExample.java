package edu.cis232;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DateProcessingExample {

	public static void main(String[] args) throws IOException{
		File file = new File("datesdata.txt");
		Scanner input = new Scanner(file);

		while(input.hasNextLine()){
			String data = input.nextLine();
			tokenizeThatLine(data);
		}
		
		input.close();
	}

	private static void tokenizeThatLine(String data) {
		StringTokenizer tokens = new StringTokenizer(data, "/-");
		
		if(tokens.countTokens() == 3){
			int month = Integer.parseInt(tokens.nextToken().trim());
			int day = Integer.parseInt(tokens.nextToken().trim());
			int year = Integer.parseInt(tokens.nextToken().trim());
			
			System.out.printf("Year: %d Month: %d Day: %d%n", year, month, day);
		}else{
			System.out.println("Invalid date format, skipping row");
		}
	}

}
