package trivia;

import java.awt.print.Printable;
import java.util.Scanner;

public class triviaMain {

	public static void main(String[] args) {
		
		// String array of questions
		String[] questions = {"How many days in a week?", "What's the largest planet?", "Who painted Mona Lisa?"};
		
		// array of options
		String[][] options = {{"1. 5", "2. 6", "3. 7"}, 
							 {"1. mars", "2. jupiter", "3. saturn"}, 
							 {"1. leonardo da vinvi", "2. pablo picasso", "3. frida kahlo"}};
		
		// int array of answers
		int[] answers = {3, 2, 1};
		
		int score = 0;
		int guess;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			
			for(String option : options[i]) {
				System.out.println(option);
			}
			System.out.println();
		}
		
	}

}
