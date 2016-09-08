package edu.cis232;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IncludeDelimiterExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input some math (i.e., 5 + 20 - 1)");
		String math = keyboard.nextLine();
		StringTokenizer tokens = new StringTokenizer(math, "+-", true);
		
		int result = 0;
		boolean add = true;
		while(tokens.hasMoreTokens()){
			String token = tokens.nextToken().trim();
			if(token.equals("+")){
				add = true;
			}else if (token.equals("-")){
				add = false;
			}else{
				int num = Integer.parseInt(token);
				if(add){
					result += num;
				}else{
					result -= num;
				}
			}
		}
		
		System.out.println("The result is " + result);

	}

}
