package trivia;

import java.util.Scanner;
import java.util.Random;

//randomize both questions and options later
public class triviaMain {

	public static void main(String[] args) {
		
		// String array of questions
		String[] questions = {"How many days in a week?", "What's the largest planet?", "Who painted Mona Lisa?"};
		
		
		// array of options
		String[][] options = {{"1. 5", "2. 6", "3. 7"}, 
							 {"1. mars", "2. jupiter", "3. saturn"}, 
							 {"1. leonardo da vinci", "2. pablo picasso", "3. frida kahlo"}};
		
		// int array of answers
		int[] answers = {3, 2, 1};
		
		int score = 0;
		int guess;
		boolean is_running = true;
		
		Scanner s = new Scanner(System.in);
		
		while (is_running) {
			for(int i = 0; i < questions.length; i++) {
				System.out.println(questions[i]);
				
				for(String option : options[i]) {
					System.out.println(option);
				}
				System.out.println();
				
				System.out.print("Enter the correct number (1-3): ");
				guess = s.nextInt();
				if(guess == answers[i]) {
					System.out.println("Correct!");
					System.out.println();
					score++;
				}
				else {
					System.out.println("Wrong! The answer is " + answers[i] + "!");
					System.out.println();
				}
			}
			System.out.println("Thank you for playing!");
			System.out.println("You scored a " + score + "/" + questions.length + "!");
			break;
		}
		s.close();
	}
}
