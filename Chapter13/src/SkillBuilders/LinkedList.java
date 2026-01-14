package SkillBuilders;

public class LinkedList 
{
	
	private NODE head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(String str)
	{
		NODE newNODE = new NODE(str);
		newNODE.setNext(head);
		head = newNODE;
	}
	
	public void addAtEnd(String str)
	{
		NODE newNODE = new NODE(str);
		NODE current = head;
		
		while(current.getNext() != null) 
		{
			current = current.getNext();
			current.setNext(newNODE);
			
		}
	}
	
	public void remove(String str)
	{
		NODE current = head;
		NODE previous = head;
		
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
	
	public String toString()
	{
		
		NODE current = head;
		String listString;
		
		if(current != null)
		{
			listString  = current.getData() + "\n";
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		}
		else
		{
			return("There are no items in the list.");
		}

		
	}
	
	public int size()
	{
		NODE current = head;
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
	
	public void makeEmpty()
	{
		head = null;
	}

}
