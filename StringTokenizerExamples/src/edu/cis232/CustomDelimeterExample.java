package edu.cis232;

import java.util.StringTokenizer;

public class CustomDelimeterExample {

	public static void main(String[] args) {
		String data = "1-703-242-5024";
		
		StringTokenizer phoneTokens = new StringTokenizer(data, "-");
		
		while(phoneTokens.hasMoreTokens()){
			System.out.println(phoneTokens.nextToken());
		}

	}

}
