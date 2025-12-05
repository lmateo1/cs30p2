package SkillBuilders;

public class Puck extends Disk implements Comparable
{
	
	double MIN_STND_WEIGHT = 5;
	double MAX_STND_WEIGHT = 5.5;
	double MIN_YTH_WEIGHT = 4;
	double MAX_YTH_WEIGHT = 4.5;
	
	private double weight;
	private boolean standard, youth;
	
	//Constructor
	
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		if(weight >= 5 && weight <= 5.5)
		{
			standard = true;
			youth = false;
		}
		else
		{
			youth = true;
			standard = false;
		}
		
	}
	
	public double getWeight()
	{
		return weight;
	}

	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "Puck is standard";
		}
		else
		{
			div = "Pick is youth";
		}
		return div;
	}
	
}
