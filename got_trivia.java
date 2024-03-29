package qanda;
import java.util.*;
import javax.swing.JOptionPane;

/**
* <h1>Question and Answer</h1>
* Java application that is a trivia game
* for Game of Thrones, that uses swing to 
* make a GUI.
*
* @author  Blane Staskiewicz
*/
public class got_trivia{
	public static final int max_q = 10;  // maximum number of questions 
	
	/** 
	* This method is the main/driver method
	* 
	* @param args  Unused
	*/
	public static void main(String[] args){
		// opening prompt for trivia game
		String prompt = "Welcome to the GoT Trivia Game! Enjoy!";
		String title =  "GoT Trivia Game";
		
		javax.swing.JOptionPane.showMessageDialog(null, prompt, title, JOptionPane.INFORMATION_MESSAGE);
		String[] questions = {"At the beginning of the series, how many children do Ned and Catelyn Stark have?",
				"Who is the first character in the series to be called 'King in the North'?", 
				"How does Daenerys hatch her dragon eggs?", "Which cast memeber has also played a Disney character?", 
				"What is the name of Arya's Direwolf?", "Which house has a rose as its Sigil?", 
				"What is Pycelle's offical title?", "What is Olenna Tyrell's nickname?", 
				"Who is executed via molten gold?", "Who is Sansa Stark's first fiance?"};
		String[] answers = {"5", "ROBB STARK", "A FUNERAL PYRE", "RICHARD MADDEN", "NYMERIA", "TYRELL", "GRAND MAESTER", 
				"QUEEN OF THORNS", "VISERYS TARGARYEN", "JOFFREY BARATHEON"};
		
		// random unused value for question
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < max_q; i++){
		    list.add(new Integer(i));
		}
		
		Collections.shuffle(list);
		for(int i = 0; i < max_q; i++){
			// gets random value, asks questions and checks the answers
	        	// int num = rand_val(s);
			String res = new QuestionAndAnswer().setQuestion(questions[list.get(i)]);
			new QuestionAndAnswer().setAnswer(answers[list.get(i)], res);
			
			// play again? but not again the last question
			if(i != 9){
				String promptq = "Do you want to Play again?";
				int again = javax.swing.JOptionPane.showConfirmDialog(null, promptq, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(again == 1) {
					String end = "Thanks for playing GoT Trivia Game! Goodbye!";
					javax.swing.JOptionPane.showMessageDialog(null, end, title, JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			}
		}
		// end message
		String end = "Thanks for playing GoT Trivia Game! Goodbye!";
		javax.swing.JOptionPane.showMessageDialog(null, end, title, JOptionPane.INFORMATION_MESSAGE);
	}
}
