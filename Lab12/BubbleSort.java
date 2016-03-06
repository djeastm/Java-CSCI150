import java.util.Arrays;

/**
 * BubbleSort.java - implements the bubble sort algorithm
 * 
 * The efficiency of the bubble sort algorithm is O(n^2)
 * because you have to iterate over the array twice for each step
 */

/**
 * @author David Eastman
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = getRandomArray(20, 50);
		sort(array);
	}

	/**
	 * getRandomArray - generates a random array
	 * @param length - desired length of array
	 * @param max - the highest number of each element
	 * @return a random array
	 */
	public static int[] getRandomArray(int length, int max) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) Math.floor(Math.random() * (max + 1));
			array[i] = rand;
		}
		return array;
	}

	/**
	 * sort - sorting algorithm
	 * @param array the array to sort
	 */
	public static void sort(int[] array) {
		int n = array.length;

		for (int i = (n - 1); i > 0; i--) {
			for (int j = (n - 1); j >= (n - i) ; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					System.out.println(Arrays.toString(array));
				} 
			}
		}
	}
}
