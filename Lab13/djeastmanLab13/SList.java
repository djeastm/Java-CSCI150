//--------------------------------------------------------------------
//
// 
//  Class definitions for the singly linked list implementation of 
//  the List ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for each class (Slist and SListNode)
//
//--------------------------------------------------------------------

class SList implements List {
	// Data members
	private SListNode head; // Reference to the beginning of the list
	private SListNode cursor; // Reference to current cursor position

	// Constructors & Helper Method
	SList() // Default constructor: Creates an empty list
	{
		setup();
	}

	SList(int size)
	// Creates an empty list. The argument is included for compatibility
	// with the array implementation; size is ignored.
	{
		setup();
	}

	// Class Methods
	private void setup() // Called by constructors only: Creates an empty list
	{
		head = null;
		cursor = null;
	}

	// ----- Insert method definitions for the interface List here ------ //

	public void insert(Object newElement) {
		SListNode newNode = new SListNode(newElement);

		if (isEmpty()) {
			// Case 1 - List is empty
			head = newNode;
			cursor = newNode;
		} else {
			// Case 2 - List is not empty
			// Save next node's reference
			SListNode nextNode = cursor.next;
			cursor.next = newNode;
			newNode.next = nextNode;
			cursor = newNode;
		}
	}

	// Inserts newElement after the cursor. If the list is empty, then
	// newElement is inserted as the first (and only) element in the list.
	// In either case, moves the cursor to newElement.

	public void remove() {
		if (isEmpty())
			return; // check if it's empty
		if (cursor.equals(head)) { // it's at the head
			head = cursor.next;
			cursor = cursor.next;
			return;
		}
		if (cursor.next != null) { // it's somewhere in the middle
			SListNode savedNextNode = cursor.next;
			gotoPrior();
			cursor.next = savedNextNode;
			gotoNext();
		} else { // it's at the end
			gotoPrior();
			cursor.next = null;
			gotoBeginning();
		}
	}

	// Removes the element marked by the cursor from a list. Moves the
	// cursor to the next element in the list. Assumes that the first list
	// element "follows" the last list element.

	public void replace(Object newElement) {
		if (cursor != null)
			cursor.element = newElement;
	}

	// Replaces the element marked by the cursor with newElement and
	// leaves the cursor at newElement.

	public void clear() {
		setup();
	}

	// Removes all elements in a list

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

	public boolean gotoBeginning() {
		if (isEmpty()) {
			return false;
		} else {
			cursor = head;
			return true;
		}

	}

	// If list not empty, moves cursor to beginning of list & returns true, else
	// returns false

	public boolean gotoEnd() {
		if (isEmpty()) {
			return false;
		} else {
			SListNode node = head;
			while (node != null) {
				// System.out.println(node.element);
				if (node.next == null)
					cursor = node;
				else
					cursor = node.next;
				node = node.next;
			}
			return true;
		}

	}

	// If list not empty, moves cursor to end of list & returns true,else
	// returns false

	public boolean gotoNext() {
		if (isEmpty()) {
			return false;
		} else {
			if (cursor.next == null)
				return false;
			else {
				cursor = cursor.next;
				return true;
			}
		}

	}

	// If cursor not at end of list, moves cursor to next element in list &
	// returns true
	// else returns false

	public boolean gotoPrior() {
		if (isEmpty()) {
			return false;
		} else {
			if (!cursor.equals(head))

			{
				SListNode iterator = head;
				while (iterator.next != null) {
					if (iterator.next.equals(cursor)) {
						cursor = iterator;
						return true;
					}
					iterator = iterator.next;
				}
			}
			return false;
		}
	}

	// If cursor not at beginning of list, moves cursor to preceding element
	// in list & returns true, else returns false

	public Object getCursor() {
		if (cursor != null)
			return cursor.element;
		else
			return "No nodes exist!";
	}

	// Returns the element at the cursor

	public void showStructure() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		SListNode iterator = head;
		while (iterator != null) {
			System.out.print(iterator.element + " ");
			iterator = iterator.next;
		}
	}

	// Outputs the elements in a list. If the list is empty, outputs
	// "Empty list". This operation is intended for testing and
	// debugging purposes only.

	void moveToBeginning() // Move to beginning
	{
		if (cursor != null)
		{
			SListNode movingNode = cursor;
			Object movingObject = movingNode.element;
			if (gotoBeginning()) {
				Object pushedElement = cursor.element;
				replace(movingObject);
				insert(pushedElement);
				cursor = movingNode;
				remove();
			}
		}
	}

	void insertBefore(Object newElement) // Insert before cursor
	{
		SListNode newNode = new SListNode(newElement);

		if (isEmpty()) {
			// Case 1 - List is empty
			head = newNode;
			cursor = newNode;
		} else {
			// Case 2 - List is not empty
			if (!cursor.equals(head))
			{
				gotoPrior();
				insert(newElement);
			} else 
			{
				head = newNode;
				head.next = cursor;
			}
		}
	}

} // class SList
