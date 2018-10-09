// ***************************************************************
// LinkedStack.java
//
// A linked implementation of an Object stack class with operations push,
// pop, and isEmpty and isFull.
//
// ***************************************************************
public class LinkedStack implements StackADT
{
	
	private Node top; // reference to top of stack
	// ---------------------------------------------------
	// Constructor -- initializes top
	// ---------------------------------------------------
	public LinkedStack()
	{
	}
	// ---------------------------------------------------
	// Adds element to top of stack if it's not full, else
	// does nothing.
	// ---------------------------------------------------
	public void push(Object val)
	{
		if (!isFull())
		{
			Node last = top;
			top = new Node(val);
			top.setNext(last);
		}
	}
	// ---------------------------------------------------
	// Removes and returns value at top of stack. If stack
	// is empty returns null.
	// ---------------------------------------------------
	public Object pop()
	{
		if (!isEmpty())
		{
			Node last = top;
			top = top.getNext();
			return last.getElement();
		}
		else
		{
			return null;
		}
	}
	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty()
	{
		if (top != null)
	    {
	        return false;
	    }
		else
		{
			return true;
		}
		
	}
	// ---------------------------------------------------
	// Returns true if stack is full, false otherwise.
	// ---------------------------------------------------
	public boolean isFull()
	{
		return false;
	}
}