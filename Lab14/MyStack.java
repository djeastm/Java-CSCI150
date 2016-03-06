/**
 * MyStack - Class that acts as a stack
 */

/**
 * @author David Eastman
 *
 */
public class MyStack implements Stack {

	// Data members
	private WordNode head;
	private int numItems;

	// Constructors & Helper Method
	MyStack() // Default constructor: Creates an empty list
	{
		setup();
	}

	MyStack(int size)
	// Creates an empty list. The argument is included for compatibility
	// with the array implementation; size is ignored.
	{
		setup();
	}

	// Class Methods
	private void setup() // Called by constructors only: Creates an empty list
	{
		head = null;
		numItems = 0;
	}

	@Override
	public void push(Object newElement) {
		WordNode oldNode = head;
		head = new WordNode(newElement);
		head.next = oldNode;
		numItems++;
	}

	@Override
	public Object pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("The stack is empty!");

		Object obj = head.element;
		head = head.next;
		numItems--;
		return obj;
	}

	@Override
	public void clear() {
		head = null;
	}

	public Object peek() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("The stack is empty!");
		
		return head.element;
	}

	public int size() {
		return numItems;
	}

	@Override
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	// Returns true if list is empty, else returns false

	public boolean isFull() {
		return false;
	}
	// Returns true if list is full, else returns false
	// Always returns false because Java automatically
	// generates an OutOfMemory error otherwise.

}
