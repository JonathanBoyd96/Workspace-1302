//***************************************************************
//DoubleLinked.java
//
//A class using a doubly linked list to represent a list of integers.
//
//***************************************************************
public class DoubleLinked
{
private IntNode list;
//----------------------------------------------
//Constructor -- initializes list
//----------------------------------------------
	public DoubleLinked()
	{
		list = null;
	}
//----------------------------------------------
//Prints the list elements
//----------------------------------------------
	public void print()
	{
		for (IntNode temp = list; temp != null; temp = temp.next)
		System.out.println(temp.val);
	}
//----------------------------------------------
//Adds new element to front of list
//----------------------------------------------
	public void addToFront(int val)
	{
		IntNode newNode = new IntNode(val);
		newNode.next = list;
		if (list != null)
		list.prev = newNode;
		list = newNode;
	}

//***************************************************************
//An inner class that represents a list element.
//***************************************************************
	private class IntNode
	{
		public int val;
		public IntNode next;
		public IntNode prev;
		public IntNode(int val)
		{
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
	public void addToEnd(int val)
	{
		IntNode newnode = new IntNode(val);
		//if list is empty, this will be the only node in it
		if (list == null)
			list = newnode;
		
		else
		{
			//make temp point to last thing in list
			IntNode temp = list;
			while (temp.next != null)
			temp = temp.next;
			//link new node into list
			temp.next = newnode;
			newnode.prev=temp;
		}
	}
	public void removeFirst()
	{
		if (list.next==null)
		{
			list=null;
		}
		if (list != null)
		{
		list = list.next;
		list.prev=null;
		}
	}
	public void removeLast()
	{
		if(list!=null)
		{
			IntNode temp= list;
			IntNode trailNode= null;
			while(temp.next!=null)
			{
				trailNode=temp;
				temp=temp.next;
			}
			if(trailNode !=null)
				trailNode.next=null;
				else
				{
					list.prev=null;
					list=null;
				}
		}
		
	}
	public void remove(int oldVal)
	{
		IntNode temp= list;
		IntNode prevNode= null;
		while(temp!=null && temp.val!=oldVal)
		{
			temp= temp.next;
		}
		if(temp !=null)
		{
			if(temp.prev!=null)
			{
				temp.prev.next=temp.next;
			}
		}
		else
		{
			list=temp.next;
		}
		if(temp.next!=null)
		{
			temp.next.prev= temp.prev;
		}
	}
}