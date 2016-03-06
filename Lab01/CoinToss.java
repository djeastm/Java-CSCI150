/**
 * 		CoinToss
 * 		CSCI 150L
 * 		
 * 		@author David Eastman
 * 		@version 1.0
 * 		Last Revised: 8/20/2015
 * 		Email: djeastman@g.coastal.edu
 *
 *		Implements a simulation of tossing a coin, 
 *		that could turn up heads or tails 10,000 times,
 *		keep track of the number of times heads or tails appeared.
 *
 */

import java.util.Random;

public class CoinToss
{

	public static void main(String[] args)
	{
		printGreeting();
		runSimulation();
	} // End Main
	
	/**
	 * printGreeting - Prints a greeting
	 * 
	 */
	public static void printGreeting() {
		System.out.println("Welcome! This program simulates flipping a coin 10,000 times!");
		System.out.println("-------");
	} // End printGreeting
	
	/**
	 * runSimulation - Runs the simulation
	 * 
	 */
	public static void runSimulation() {
		int countHeads = -1;
		int countTails = -1;
		
		for (int i = 0; i < 10000; i++)
		{
			int flip = flipCoin();
			if (flip == 0) countHeads++;
			else countTails++;
		}
		
		printResults(countHeads, countTails);
	} // End runSimulation

	/**
	 * flipCoin - Flips a coin
	 * 
	 * @return the coin flip, 1 or 0
	 */
	public static int flipCoin() {
		int flip = -1;
		
		Random random = new Random();
		flip = random.nextInt(2);

		return flip;
	} // End flipCoin

	/**
	 * printResults - Prints the results
	 * 
	 * @param heads the head count as an integer
	 * @param tails the tails count as an integer
	 */
	public static void printResults(int heads, int tails) {
		System.out.println("Results");
		System.out.println("-------");
		System.out.println("Heads count: "+100*heads/(float)10000+" %");
		System.out.println("Tails count: "+100*tails/(float)10000+" %");
		
	} // End printResults
	

} // End Lab1