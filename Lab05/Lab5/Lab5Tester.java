import java.io.IOException;

/**
 * Lab5Test.java
 * 
 * A test harness for the Book class to be completed in lab.
 *
 * @author Clint
 * @author David Eastman
 * @course CSCI 150
 * @version 1.0
 */

public class Lab5Tester {

	public static final int NUMBER_OF_TESTS = 15;
	public static int passed = 0;

	/**
	 * Note the overloaded checkEqualsMethods here
	 */

	/**
	 * @return expectedResult is compared with the actualResult and a message is
	 *         printed indicating the testName and if the comparison was passed
	 *         or failed.
	 */
	public static void checkEquals(String testName, String expectedResult,
			String actualResult) {

		// add your code here
		if (expectedResult.equals(actualResult)) {
			System.out.println("Passed " + testName + ": " + expectedResult
					+ " " + actualResult);
			passed++;
		} else {
			System.out.println("Failed " + testName + ": " + expectedResult
					+ " " + actualResult);
		}

	}

	/**
	 * @return expectedResult is compared with the actualResult and a message is
	 *         printed indicating the testName and if the comparison was passed
	 *         or failed.
	 */
	public static void checkEquals(String testName, int expectedResult,
			int actualResult) {
		// add your code here
		if (expectedResult == actualResult) {
			System.out.println("Passed " + testName + ": " + expectedResult
					+ " " + actualResult);
			passed++;
		} else {
			System.out.println("Failed " + testName + ": " + expectedResult
					+ " " + actualResult);
		}

	}

	/**
	 * @return expectedResult is compared with the actualResult and a message is
	 *         printed indicating the testName and if the comparison was passed
	 *         or failed.
	 */
	public static void checkEquals(String testName, boolean expectedResult,
			boolean actualResult) {
		// add your code here
		if (expectedResult == actualResult) {			// Use overridden equals method
			System.out.println("Passed " + testName + ": "
					+ expectedResult + " "
					+ actualResult);
			passed++;
		} else {
			System.out.println("Failed " + testName + ": "
					+ expectedResult + " "
					+ actualResult);
		}

	}

	public static void main(String[] args) {
		
		String defaultTitle = "Default Title";
		String defaultAuthor = "Default Author";
		int defaultNumberOfPages = 999;
		
		Book bookDefault = new Book();
		Book book1 = new Book("The Firm", "John Grisham", 560);
		Book book2 = new Book("Clear and Present Danger", "Tom Clancy", 704);

		// // Constructors Tests

		// Default Constructor
		checkEquals("Default constructor title", defaultTitle, bookDefault.getTitle());
		checkEquals("Default constructor author", defaultAuthor,
				bookDefault.getAuthor());
		checkEquals("Default constructor numberOfPages", defaultNumberOfPages,
				bookDefault.getNumberOfPages());
		
		// Overloaded Constructor
		checkEquals("Overloaded constructor title", "The Firm", book1.getTitle());
		checkEquals("Overloaded constructor author", "John Grisham",
				book1.getAuthor());
		checkEquals("Overloaded constructor numberOfPages", 560,
				book1.getNumberOfPages());

		// // Accessors Tests

		checkEquals("getTitle", "The Firm", book1.getTitle());
		checkEquals("getAuthor", "John Grisham", book1.getAuthor());
		checkEquals("getNumberOfPages", 560, book1.getNumberOfPages());

		// // Mutators Tests

		String newTitle = "The Sun Also Rises";
		String newAuthor = "Ernest Hemingway";
		int newNumberOfPages = 777;

		book2.setTitle(newTitle);
		checkEquals("setTitle", newTitle, book2.getTitle());
		book2.setAuthor(newAuthor);
		checkEquals("setAuthor", newAuthor, book2.getAuthor());
		try {
			book2.setNumberOfPages(newNumberOfPages);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		checkEquals("setNumberOfPages", newNumberOfPages,
				book2.getNumberOfPages());

		// Test invalid number of pages and IOexception
		try {
			book2.setNumberOfPages(-1);
			System.out
					.println("Failed setNumberOfPages INVALID test, allowed -1");
		} catch (IOException e) {
			e.printStackTrace();
			System.out
					.println("Passed setNumberOfPages INVALID test, did NOT allow -1");
		}

		// // Methods Tests

		// getDescription test
		String testDescription = "Book [Title = The Firm, Author = John Grisham, Number of Pages = 560]";
		checkEquals("getDescription", testDescription, book1.getDescription());

		// Equals test
		checkEquals("equals books same", true, book1.equals(book1));
		checkEquals("equals books different", false, book1.equals(book2));

		if (passed == NUMBER_OF_TESTS) {
			System.out.println("Passed all tests, WHOO HOOO!!");
		} else {
			System.out
					.println("Failed at least one test, please refer to printouts to troubleshoot.");
		}
	}
}
