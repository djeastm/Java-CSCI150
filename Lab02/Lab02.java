/**
 * 		Lab 02
 * 		CSCI 150L
 * 		
 * 		@author David Eastman
 * 		@version 1.0
 * 		Last Revised: 8/27/2015
 * 		Email: djeastman@g.coastal.edu
 *
 *		Create two methods, one that checks two arrays for similarities
 *		and one that checks for runs of numbers in an array
 *
 */

import java.util.Random;

public class Lab02
{

	public static void main(String[] args)
	{
		//// Part One
		
		System.out.println("Part One:");
		System.out.println();
		
		int[] array1 = {1,5,8,8,8,7,6};				// sample array 1
		int[] array2 = {5,5,7,6,8,1};				// sample array 2
		
		// Test arrays
		//int[] array3 = {1,8,5,6};
		//int[] array4 = {1,1,5,8,7,6};
		//int[] array5 = {1};
		//int[] array6 = {1};
		//int[] array7 = getRandArray(10, 10);
		//int[] array8 = getRandArray(7, 10);

		// Test functions
		//printArray(array1);
		//printArray(array2);
		
		Boolean areSimilar = false;					// flag for similarity 
		
		// Run similarity check
		areSimilar = similar(array1, array2);
		
		// Print results
		if (areSimilar)
		{
			printArray(array1);
			printArray(array2);
			System.out.println("----------------------");
			System.out.println("The arrays are similar");
			System.out.println("----------------------");
			System.out.println();
		} else 
		{
			printArray(array1);
			printArray(array2);
			System.out.println("--------------------------");
			System.out.println("The arrays are not similar");
			System.out.println("--------------------------");
			System.out.println();
		}
		
		
		//// Part Two
		
		System.out.println("Part Two:");
		System.out.println();
		
		// Get a randomized array of 20 numbers from 1-6
		int[] randomTosses = getRandArray(20, 6);
		
		// Print the array with the desired parentheses around the runs
		showRuns(randomTosses);
		
	} // End Main
	
	/**
	 * getRandArray - Create a array of size arraySize starting at 1 and ending at numRand
	 * 
	 * @param arraySize	the desired array size
	 * @param numRand	the desired upper limit
	 * @return the desired array
	 */
	public static int[] getRandArray(int arraySize, int numRand)
	{
		Random rand = new Random();
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++){
			array[i] = rand.nextInt(numRand) + 1;
		}
		
		return array;
	}
	
	/**
	 * printArray - prints an array to the screen
	 * 
	 * @param array The array we want to print
	 */
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		} 
		System.out.println();
	} // End printArray

	/**
	 * similar - Run through the two arrays and determine
	 * if they're similar
	 * 
	 * @param array1 The first array given
	 * @param array2 The second array given
	 * @return A Boolean saying whether the arrays are similar
	 */
	public static Boolean similar(int[] array1, int[] array2) {
		if (array1.length != 0 && array2.length != 0) {			// Verify that the arrays aren't empty
			
			Boolean areSimilar = true;							// Similarity flag
			
			// Run the arrays through a check one way
			for (int i = 0; i < array1.length; i++)				
			{
				Boolean foundSimilar = false;
				for (int j = 0; j < array2.length; j++){
					if (array2[j] == array1[i]) {
						foundSimilar = true;
					} 
				}
				
				if (foundSimilar != true) {
					areSimilar = false;
				}
			}
			
			// ... Then run through the same check the reverse way
			for (int i = 0; i < array2.length; i++)
			{
				Boolean foundSimilar = false;
				for (int j = 0; j < array1.length; j++){
					if (array1[j] == array2[i]) {
						foundSimilar = true;
					} 
				}
				if (foundSimilar != true) {
					areSimilar = false;
				}
			}
			
			return areSimilar;
			
		} else {
			// Print a friendly response to an empty array
			System.out.println("Please make sure your arrays aren't empty and try again.");
			return false;
		}
		
	} // End similar
	
	/**
	 * showRuns - Determines if there are any runs in the values
	 * in an array.
	 * 
	 * @param tosses The array of tosses to show
	 */
	public static void showRuns(int[] tosses) {
		
		Boolean inRun = false;
		
		for (int i = 0; i < tosses.length; i++) {
				if (inRun) {
					if (i-1 > 0 && tosses[i] != tosses[i-1]) {		
						System.out.print(") ");
						inRun = false;
					}
				} else if (i+1 < tosses.length && tosses[i] == tosses[i+1]){
						System.out.print("( ");
						inRun = true;
				}
				System.out.print(tosses[i]+" ");
		}
		if (inRun)
		{
			System.out.print(") ");
		}
	} // End showRuns

} // End Lab2