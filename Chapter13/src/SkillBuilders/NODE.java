package SkillBuilders;

public class NODE 
{
	
	private String data;
	private NODE next;
	
	//constructor method pluh
	public NODE(String newData)
	{
		
		data = newData;
		next = null;
		
	}
	
	//accessor
	public NODE getNext()
	{
		return next;
	}
	
	public void setNext(NODE newNODE)
	{
		next = newNODE;
	}
	
	public String getData()
	{
		return data;
	}

}
