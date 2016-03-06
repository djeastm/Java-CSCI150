/**
 * Book - represents a simple book
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 9/22/2015
 * @email djeastman@g.coastal.edu
 *
 */

import java.io.IOException;

public class Book {

	// Properties
	private String title;
	private String author;
	private int numberOfPages;

	// Constructors
	/**
	 * Default constructor
	 */
	public Book() {
		this.title = "Default Title";
		this.author = "Default Author";
		this.numberOfPages = 999;
	}

	/**
	 * @param title
	 * @param author
	 * @param numberOfPages
	 */
	public Book(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	/*
	 * Accessors
	 */
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/*
	 * Mutators
	 */

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param numberOfPages
	 *            the numberOfPages to set
	 */
	public void setNumberOfPages(int aNumberOfPages) throws IOException {
		if (aNumberOfPages > 0)
			this.numberOfPages = aNumberOfPages;
		else {
			throw new IOException("INVALID Number of Pages cannot be "
					+ aNumberOfPages);
		}
	}

	/*
	 * Utility/Behavioral methods
	 */

	/**
	 * getDescription - returns a String with information about the book
	 */
	public String getDescription() {
		return "Book [Title = " + title + ", Author = " + author
				+ ", Number of Pages = " + numberOfPages + "]";
	}

	/**
	 * equals - takes in an object and returns a boolean showing if the object
	 * equals this book
	 * 
	 * @param object
	 *            the object to be compared
	 */
	public boolean equals(Object obj) {
		boolean same = true;

		Book otherBook = (Book) obj;
		String otherTitle = otherBook.getTitle();
		String otherAuthor = otherBook.getAuthor();
		int otherNumberOfPages = otherBook.getNumberOfPages();

		if (!title.equals(otherTitle))
			same = false;
		if (!author.equals(otherAuthor))
			same = false;
		if (numberOfPages != otherNumberOfPages)
			same = false;

		return same;
	}
}
