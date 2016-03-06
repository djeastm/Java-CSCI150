/**
 * ConvertToBinary.java - recursively prints the binary equivalent of a positive integer
 * @author David Eastman
 * 
 *
 */

import java.util.Scanner;

public class ConvertToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the ConvertToBinary program");

		System.out
				.println("Would you like to convert a positive integer to its binary equivalent(yes/no)?");
		String choice = keyboard.nextLine();

		while (choice.equalsIgnoreCase("yes")) {
			boolean valid = false;
			int num = -1;
			
			while (!valid) {

				System.out.println("Enter a positive integer to convert: ");

				num = keyboard.nextInt();
				keyboard.nextLine();

				if (num <= 0) {
					System.out.println(num + " is not a positive integer.");
				} else {
					valid = true;
				}

				
			}
			
			int binaryNumber = convertToBinary(num);
			System.out.println(binaryNumber);
			System.out.println();
		}

		System.out
				.println("Thank you for using the ConvertToBinary program, have a nice day!");
	}

	/**
	 * converts a decimal number to binary
	 * 
	 * Check if the number is zero, if it is, return 0; Otherwise, take the modulus
	 * 2 of the number, then add that to 10 times the conversion of the number /
	 * 2 to get the binary representation of that number
	 * 
	 * @param number
	 * @return the binary representation of the given number
	 */
	public static int convertToBinary(int number) {

		if (number == 0) {
			return 0;
		} else {
			int mod2Num = number % 2;

			int binary = mod2Num + 10 * convertToBinary(number / 2);
			return binary;
		}

	}

}
