/**
 * RaiseToPower.java - recursively prints the value of input raised to a given power
 * @author David Eastman
 * 
 * Check if the number is zero, if it is, return 1; Otherwise, return
 * the given base multiplied by what the raiseToPower function gives
 * with the base and the power minus 1
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class RaiseToPower {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the RaiseToPower program");

		boolean valid = false;
		int base = 0;
		int power = 0;
		while (!valid) {

			System.out.println("Enter an integer to be raised to its power:");
			try {
				base = keyboard.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("You must enter an integer");
			}
			keyboard.next(); // ignore caret
			try {
				power = keyboard.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("You must enter an integer");
			}
			keyboard.nextLine();

			if (power < 0 || power > 30) { // limit the power to 30 to prevent
											// crazy overflow
				System.out.println(base + " ^ " + power + " is invalid.");
			} else {
				valid = true;
			}
		}

		int raisedNumber = raiseToPower(base, power);
		System.out.println(base + " ^ " + power + " converts to "
				+ raisedNumber);
		System.out.println();

		System.out
				.println("Thank you for using the RaiseToPower program, have a nice day!");
	}

	/**
	 * raises a number to a power
	 * 
	 * @param base
	 *            an integer representing the base
	 * @param power
	 *            an integer representing the power to be raised to
	 * @return the base raised to a certain power
	 */
	public static int raiseToPower(int base, int power) {

		if (power == 0) {
			return 1;
		} else {
			return base * raiseToPower(base, power - 1);
		}

	}

}
