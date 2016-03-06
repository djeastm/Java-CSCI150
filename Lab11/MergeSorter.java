import java.util.Arrays;

/**
 * MergeSorter.java - sorts an array of strings
 */

/**
 * @author David Eastman
 *
 */
public class MergeSorter {

	/**
	 * Sorts an array, using merge sort.
	 * @param a the array to sort
	 */
	public static void sort(String[] names) {
		if (names.length <= 1) {return;}
		String[] first = new String[names.length / 2];
		String[] second = new String[names.length - first.length];
		
		for (int i = 0; i < first.length; i++)
		{
			first[i] = names[i];
		}
		
		for (int i = 0; i < second.length; i++)
		{
			second[i] = names[first.length + i];
		}
		sort(first);
		sort(second);
		merge(first, second, names);
	}
	/**
	 * Merges two arrays together
	 * @param first	the first array
	 * @param second the second array
	 * @param names the array of names
	 */
	private static void merge(String[] first, String[] second, String[] names) 
	{
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;
		while (iFirst < first.length && iSecond < second.length)
		{
			if (first[iFirst].compareToIgnoreCase(second[iSecond]) > 0) 
				{
				names[j] = first[iFirst];
				iFirst++;
			}
			else
			{
				names[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		
		while (iFirst < first.length) 
		{
			names[j] = first[iFirst];
			iFirst++;
			j++;
		}
		
		while (iSecond < second.length) 
		{
			names[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
	
	/**
	 * Tests the merge sorter
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = {"John", "Mary", "Steve", "Isaac", "Paul"};
		System.out.println("Original: " + Arrays.toString(names));
		
		sort(names);
		
		System.out.println("Sorted (Desc.): " + Arrays.toString(names));
	}
}
