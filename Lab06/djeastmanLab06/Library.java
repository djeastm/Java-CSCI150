/**
 * Library - represents a library
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 9/24/2015
 * @email djeastman@g.coastal.edu
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Library {

	public static final int DEFAULT_SIZE = 10;

	public static void main(String[] args) {
		Book[] bookArray = new Book[DEFAULT_SIZE];

		Scanner keyboard = new Scanner(System.in);
		
		// Call menu
		int selection = menu(keyboard);

		// Take selection and only exit when user selects quit
		while (selection != 6) {
			switch (selection) {
			case 1: // Add
				addBook(bookArray, keyboard);
				break;
			case 2: // Remove
				removeBook(bookArray, keyboard);
				break;
			case 3: // Show All
				showAll(bookArray);
				break;
			case 4: // Count
				countBooks(bookArray);
				break;
			case 5: // Pages
				totalNumberOfPages(bookArray);
				break;
			case 6: // Quit
				System.out.println("Thank you for visiting the Library today!");
				break;
			}

			System.out.println();
			selection = menu(keyboard);
		}
		keyboard.close();

	} // End main

	/**
	 * menu - Prints the menu and takes in a selection from the user
	 * 
	 * @return the number corresponding to the desired selection as an integer
	 */
	public static int menu(Scanner keyboard) {
		printMenu();

		int selection = -1;

		while (selection == -1) {
			try {
				System.out.print("Please enter your selection: ");
				String selectionName = keyboard.nextLine();

				selectionName = selectionName.toLowerCase();

				switch (selectionName) {
				case "add":
					selection = 1;
					break;
				case "remove":
					selection = 2;
					break;
				case "show all":
					selection = 3;
					break;
				case "count":
					selection = 4;
					break;
				case "pages":
					selection = 5;
					break;
				case "quit":
					selection = 6;
					break;
				default:
					System.out.println("Please enter a valid option.");
				}
			} catch (Exception e) {
				System.out.println("Something went wrong with your selection.");
				e.printStackTrace();
			}
		}
		System.out.println();
		return selection;
	} // End menu

	/**
	 * printMenu - Prints a menu to the screen
	 */
	public static void printMenu() {
		System.out.println("Select an option:");
		System.out.println("Type \"add\" to add a Book");
		System.out.println("Type \"remove\" to remove a Book");
		System.out
				.println("Type \"show all\" to display the contents of the Library");
		System.out
				.println("Type \"count\" to determine the total number of Books in the Library");
		System.out
				.println("Type \"pages\" to determine the total number of pages in the Library");
		System.out.println("Type \"quit\" to exit the program:");
		System.out.println();
	} // End printMenu

	/**
	 * printGreeting - displays an informative message to the console
	 */
	public static void printGreeting() {
		System.out.println("Welcome to the Library Program.");
		System.out.println();
	}

	/**
	 * addBook - accepts an array of Book objects and proceeds to prompt the
	 * user for information, instantiates a Book object, and adds it to the
	 * array.
	 * 
	 * @param bookArray
	 *            the array of books
	 */
	public static void addBook(Book[] bookArray, Scanner keyboard) {
		boolean added = false;
		
		System.out.println("Please enter the Title: ");
		String bookTitle = keyboard.nextLine();

		System.out.println("Please enter the Author: ");
		String bookAuthor = keyboard.nextLine();

		System.out.println("Please enter the number of pages: ");

		int bookNumberOfPages = 0;
		try {
			bookNumberOfPages = keyboard.nextInt();
			keyboard.nextLine();
		} catch (InputMismatchException ime) {
			System.out
					.println("You might have used a letter instead of a number.");
			ime.printStackTrace();
		}

		Book newBook = new Book(bookTitle, bookAuthor, bookNumberOfPages);

		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] == null) {
				bookArray[i] = newBook;
				added = true;
				break;
			}
		}

		if (added) {
			System.out.println(bookTitle
					+ " has been successfully added to Library.");
		}
		else {
			System.out.println("Sorry, the library is full.");
		}

	}

	/**
	 * removeBook - accepts an array of Book objects and proceeds to prompt the
	 * user for the title of a Book and its author, finally removing it from the
	 * Library (or printing a descriptive message if the book was not found.
	 * 
	 * @param bookArray
	 *            the array of books
	 */
	public static void removeBook(Book[] bookArray, Scanner keyboard) {

		System.out.print("Please enter title of book to remove: ");
		String removeTitle = keyboard.nextLine();

		System.out.print("Please enter author of book to remove: ");
		String removeAuthor = keyboard.nextLine();

		System.out.println();

		int count = 0;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null) {
				if (bookArray[i].getTitle().equals(removeTitle)
						&& bookArray[i].getAuthor().equals(removeAuthor)) {
					bookArray[i] = null;
					count++;

				}
			}
		}

		if (count != 0) {
			// Item was removed
			System.out.println(removeTitle + " was successfully removed.");
		} else {
			// Item not present
			System.out.println("Item not present.");
		}
	}

	/**
	 * countBooks - determines how many Book objects are present in the Library
	 * 
	 * @param bookArray
	 *            the array of books
	 */
	public static void countBooks(Book[] bookArray) {
		int bookCount = 0;

		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null) {
				bookCount++;
			}
		}

		System.out.println("There are " + bookCount + " books in the Library.");

	}

	/**
	 * totalNumberOfPages - determines the total number of pages of all of the
	 * Book objects that are present in the library
	 * 
	 * @param bookArray
	 *            the array of books
	 */
	public static void totalNumberOfPages(Book[] bookArray) {
		int pageCount = 0;

		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null) {
				pageCount += bookArray[i].getNumberOfPages();
			}
		}

		if (pageCount != 0) {
			System.out.println("There are " + pageCount
					+ " pages in the Library.");
		} else {
			System.out.println("There are no pages in the Library!");
		}
	}

	/**
	 * showAll - method merely displays the contents of the Books in the Library
	 * 
	 * @param bookArray
	 *            the array of books
	 */
	public static void showAll(Book[] bookArray) {
		int count = 0;

		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null) {
				System.out.println("Title: " + bookArray[i].getTitle());
				System.out.println("Author: " + bookArray[i].getAuthor());
				System.out.println("Number of Pages: "
						+ bookArray[i].getNumberOfPages());
				System.out.println();
				count++;
			}
		}

		if (count == 0) {
			System.out.println("There are no Books in the Library!");
		}
	}

}
