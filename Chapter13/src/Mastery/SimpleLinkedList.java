package Mastery;

public class SimpleLinkedList 
{
	
	private SimpleNODE head;
	
	//Constructor Method
	public SimpleLinkedList()
	{
		head = null;
	}
	
	//Add item at front
	public void addAtFront(String str)
	{
		SimpleNODE newNODE = new SimpleNODE(str);
		newNODE.setNext(head);
		head = newNODE;
	}
	
	//Add item at end
	public void addAtEnd(String str)
	{
		SimpleNODE newNODE = new SimpleNODE(str);
		SimpleNODE current = head;
		
		while(current.getNext() != null) 
		{
			current = current.getNext();
			current.setNext(newNODE);	
		}
	}
	
	//Remove item
	public void remove(String str)
	{
		SimpleNODE current = head;
		SimpleNODE previous = head;
		
		if(current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	//Return ;ist of items
	public String toString()
	{
		SimpleNODE current = head;
		String listString;
		
		if(current != null)
		{
			listString  = current.getData() + ", ";
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData();
			}
			return(listString);
		}
		else
		{
			return("There are no items in the list.");
		}

		
	}
	
	//Return size of list
	public int size()
	{
		SimpleNODE current = head;
		int count = 0;
		
		if(current != null)
		{
			count += 1;
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				count +=1;
			}
			return count;
		}
		else
		{
			return 0;
		}
	}
	
	//Make the list go empty
	public void makeEmpty()
	{
		head = null;
	}

}



