package Mastery;

public class SimpleStack 
{
	
	private Object[] data;
	private int top;
	
	public SimpleStack(int maxItems)
	{
		data = new Object[maxItems];
		top = -1;
	}

	public String showContents()
	{
		String contents = "";
		
		for (int i = 0; i < size(); i++) 
		{
	        int amount = (top + i) % data.length;
	        contents += data[amount];
	        
	        if (i < size() - 1) 
	        {
	            contents += ", ";
	        }
		}
		
		return(contents);
	}
	
	public Object pop()
	{
		top = top - 1;
		return(data[top + 1]);
	}
	
	public void push(Object item)
	{
		if(top < data.length - 1)
		{
			top = top + 1;
			data[top] = item;
		}
	}
	
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
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		
		else
			return false;
	}
	
	public void makeEmpty()
	{
		top = -1;
	}
	
}
