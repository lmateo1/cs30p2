package MasteryEmployee;

public class Staff extends UEmployee
{
	
	private String title;
	
	public Staff(double s, String n, String t) 
	{
		super(s, n);
		title = t;
	}
	
	public String getTitle()
	{
		return title;
	}

}
