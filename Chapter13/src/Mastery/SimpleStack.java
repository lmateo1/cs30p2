package Mastery;

public class SimpleStack 
{
	//Declare variables
	private Object[] data;
	private int top;
	
	//Constructor method
	public SimpleStack(int maxItems)
	{
		data = new Object[maxItems];
		top = -1;
	}

	//Show contents of stack
	public String showContents()
	{
		String contents = "";
		
		for (int i = 0; i <= top; i++) 
		{
	        contents += data[i];
	        
	        if (i < size() - 1) 
	        {
	            contents += ", ";
	        }
		}
		
		return(contents);
	}
	
	//Remove the object at the top of the stack
	public Object pop()
	{
		top = top - 1;
		return(data[top + 1]);
	}
	
	//Put an object at the top of the stack
	public void push(Object item)
	{
		if(top < data.length - 1)
		{
			top = top + 1;
			data[top] = item;
		}
	}
	
	//Check size of stack
	public int size()
	{
		if(isEmpty())
		{
			return(0);
		}
		else
		{
			return(top + 1);
		}
	}
	
	//Check if the stack is empty
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		
		else
			return false;
	}
	
	//Make the stack go empty
	public void makeEmpty()
	{
		top = -1;
	}
	
}
