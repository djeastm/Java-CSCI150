//--------------------------------------------------------------------
//
// 
//  Class definition for the singly linked list implementation of 
//  the List ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for each class (SList and SListNode)
//
//--------------------------------------------------------------------

class SListNode
{
    // Data members
    public Object element;         // List element
    public SListNode next;         // Reference to the next element
    
    // Constructor
    SListNode ( Object elem )
        // Creates a list node containing element elem and next pointer
        // nextPtr.
    {
	this.element = elem;
	this.next = null;
    }
    
    
} // class SListNode
