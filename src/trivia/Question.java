package trivia;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	String question;
	List<String> options; //changed String[] to List<String> to resize to use shuffle
	int answer;
	
	Question(String question, String[] options, int answer) {
		this.question = question;
		this.options = new ArrayList<>(List.of(options));
		this.answer = answer;
	}


}
