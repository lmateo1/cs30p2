package Mastery;

public class SimpleQueue 
{
	
	//Declare variables
	private Object[] data;
	private int front, rear, maxSize;
	
	//Show contents of the queue
	public String showContents()
	{
		String contents = "";
		
		for (int i = 0; i < size(); i++) 
		{
	        int amount = (front + i) % data.length;
	        contents += data[amount];
	        
	        if (i < size() - 1) 
	        {
	            contents += ", ";
	        }
		}
		
		return(contents);
	}

	//Constructor method
	public SimpleQueue(int maxItems)
	{
		data = new Object [maxItems];
		front = -1;
		rear = -1;
		maxSize = maxItems;
	}
	
	//Dequeue an item from the queue
	public Object dequeue()
	{
		Object item;
		
		item = data[front];
		
		if(front == rear)
		{
			makeEmpty();
		}
		else
		{
			front = (front + 1) % maxSize;
		}
		
		return item;
	}
	
	//Enqueue an item into the queue
	public void enqueue(Object item)
	{
		if(isEmpty())
		{
			rear = 0;
			front = 0;
			data[rear] = item;
		}
		else
		{
			rear = (rear + 1) % maxSize;
			data[rear] = item;
		}
	}
	
	//Check if the queue is empty
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	//Make the queue go empty
	public void makeEmpty()
	{
		front = -1;
		rear = -1;
	}
	
	//Check the size of the queue
	public int size()
	{
		if(isEmpty())
		{
			return(0);
		}
		else if (rear >= front)
		{
			return(rear - front + 1);
		}
		else
		{
			return(maxSize - front + rear + 1);
		}
		
	}

}

