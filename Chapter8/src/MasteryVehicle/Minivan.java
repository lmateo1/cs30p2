package MasteryVehicle;

public class Minivan extends Vehicle
{
	//Declare variable for unique attribute
	private boolean hasSunroof;
	
	//Constructor
	public Minivan(double fEC, double fEH, int sC, double cV, boolean hS)
    {
		super(fEC, fEH, sC, cV);
		hasSunroof = hS;
    }

	//Display details for the minivan
	public void showDetails() 
	{
		 System.out.println("- Minivan Details");
	     System.out.println("Fuel economy (City): " + fuelEconomyCity + " L/100km");
	     System.out.println("Fuel economy (Highway): " + fuelEconomyHwy + " L/100km");
	     System.out.println("Seats: " + seatingCapacity);
	     System.out.println("Cargo Volume: " + cargoVolume + " Litres");
	     System.out.println("Sunroof: " + (hasSunroof ? "Has" : "Doesn't have"));
	}

}
