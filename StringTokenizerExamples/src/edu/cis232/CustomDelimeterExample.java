package edu.cis232;

import java.util.StringTokenizer;

public class CustomDelimeterExample {

	public static void main(String[] args) {
		String data = "peter;james;kevin;paul;";
		
		StringTokenizer nameTokens = new StringTokenizer(data, ";");
		
		while(nameTokens.hasMoreTokens()){
			System.out.println(nameTokens.nextToken());
		}

	}

}
