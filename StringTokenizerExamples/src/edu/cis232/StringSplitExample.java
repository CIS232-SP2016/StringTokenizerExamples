package edu.cis232;

public class StringSplitExample {

	public static void main(String[] args) {
		String paragraph = "This method accepts a "
				+ "String object as an argument and returns the "
				+ "Character that occurs most frequently in the object. "
				+ "If null is passed in, return null. "
				+ "Return the character in uppercase, ignore case "
				+ "when computing which is the most frequently occuring character.";
		
		String[] sentences = paragraph.split("\\.");
		for(String sentence : sentences){
			System.out.println(sentence.trim());
		}
		
	}

}
