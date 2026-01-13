package trivia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//randomize both questions and options later
public class triviaMain {

	public static void main(String[] args) {
		
		List<Question> questions = new ArrayList<>();

		questions.add(new Question("How many days in a week?", new String[]{"1. 5", "2. 6", "3. 7"}, 3)); // have the instance, arrays are objects, objects require new
		questions.add(new Question("What's the largest planet?", new String[]{"1. Mars", "2. Jupiter", "3. Saturn"},2));
		questions.add(new Question("Who painted Mona Lisa?", new String[]{"1. Leonardo da Vinci", "2. Pablo Picasso", "3. Frida Kahlo"},1));

		
		int score = 0;
		int guess;
		boolean is_running = true;
		
		Scanner s = new Scanner(System.in);
		
		Collections.shuffle(questions); // put outside b/c runs shuffle before printing
		while (is_running) {
			for(int i = 0; i < questions.size(); i++) { //array: length, string: length(), list: size()
				System.out.println(questions.get(i).question); //use [] for array, use .get() for list, put .options after i
//				Collections.shuffle(questions); //shuffles the questions not the options, ruins matching
				
				Collections.shuffle(questions.get(i).options); //works only if it's a list, not an array
				for(String option : questions.get(i).options) { //used to get the options in an arraylist
					System.out.println(option);
					
				}
				System.out.println();
				
				System.out.print("Enter the correct number (1-3): ");
				guess = s.nextInt();
				if(guess == questions.get(i).answer) {
					System.out.println("Correct!");
					System.out.println();
					score++;
				}
				else {
					System.out.println("Wrong! The answer is " + questions.get(i).answer + "!");
					System.out.println();
				}
				
				if (guess < 1 || guess > 3) {
					System.out.println("Invalid choice. Skipping question.");
				    continue;
				}
			}
			System.out.println("Thank you for playing!");
			System.out.println("You scored a " + score + "/" + questions.size() + "!");
			is_running = false;
		}
		s.close();
	}
}
