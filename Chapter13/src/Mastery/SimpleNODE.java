package Mastery;

public class SimpleNODE 
{
	
	private String data;
	private SimpleNODE next;
	
	//Constructor
	public SimpleNODE(String newData)
	{
		data = newData;
		next = null;
	}
	
	//Accessor
	public SimpleNODE getNext()
	{
		return next;
	}
	
	//Setter
	public void setNext(SimpleNODE newNODE)
	{
		next = newNODE;
	}
	
	//Getter
	public String getData()
	{
		return data;
	}

}
