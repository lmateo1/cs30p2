package MasteryVehicle;

public class Truck extends Vehicle
{
	//Declare variable for unique attribute
	private boolean hasWinterTires;

	//Constructor
	public Truck(double fEC, double fEH, int sC, double cV, boolean hWT)
    {
		super(fEC, fEH, sC, cV);
		hasWinterTires = hWT;
    }

	//Display details for the truck
	public void showDetails() 
	{
		 System.out.println("- Truck Details");
	     System.out.println("Fuel economy (City): " + fuelEconomyCity + " L/100km");
	     System.out.println("Fuel economy (Highway): " + fuelEconomyHwy + " L/100km");
	     System.out.println("Seats: " + seatingCapacity);
	     System.out.println("Cargo Volume: " + cargoVolume + " Litres");
	     System.out.println("Winter Tires: " + (hasWinterTires ? "Has" : "Doesn't have"));
	}

}
