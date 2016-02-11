package edu.cis232;
import java.util.StringTokenizer;

public class StringTokenizerExample1 {

	public static void main(String[] args) {
		String sentence = "This is a simple sentence";
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		
		//Show the number of words(tokens)
		System.out.printf("The sentence contains %d words%n", tokenizer.countTokens());
		
		int count = 1;
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			System.out.printf("%d. %s%n", count++, token);
		}
	}

}
