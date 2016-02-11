package edu.cis232;

import java.util.StringTokenizer;

public class IncludeDelimiterExample {

	public static void main(String[] args) {
		String math = "32 + 5 - 2 + 35";
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
