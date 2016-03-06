import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Reverser - reads the user input and reverses said input
 * 
 * @author David Eastman
 *
 */
public class Reverser {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String sentence = "";
		while (sentence.equals("")) {
			System.out
					.println("Please enter a sentence, and I will reverse it for you: ");
			sentence = keyboard.nextLine();
		}
		
		StringTokenizer tok = new StringTokenizer(sentence);
		
		int numWordsInSentence = tok.countTokens();
		MyStack stack = new MyStack(numWordsInSentence);

		while(tok.hasMoreTokens()){
			stack.push(tok.nextToken());
		}

		System.out.println("Your sentence in reverse order is: ");

		for (int i = 0; i < numWordsInSentence; i++) {
			try {
				System.out.print(stack.pop() + " ");
			} catch (EmptyStackException ese) {
				System.out.println(ese.getMessage());
			}
		}

	}
}
