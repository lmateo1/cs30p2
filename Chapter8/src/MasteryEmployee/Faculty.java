package MasteryEmployee;

public class Faculty extends UEmployee 
{
	
	private String depart;
	
	public Faculty(double s, String n, String d) 
	{
		super(s, n);
		depart = d;
	}
	
	public String getDepart()
	{
		return depart;
	}

}
