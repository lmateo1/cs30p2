package MasteryVehicle;

public class Car extends Vehicle
{
	//Declare variable for unique attribute
	private boolean isElectric;

	//Constructor
	public Car(double fEC, double fEH, int sC, double cV, boolean iE)
    {
		super(fEC, fEH, sC, cV);
		isElectric = iE;
    }

	//Display details for the car
	public void showDetails() 
	{
		 System.out.println("- Car Details");
	     System.out.println("Fuel economy (City): " + fuelEconomyCity + " L/100km");
	     System.out.println("Fuel economy (Highway): " + fuelEconomyHwy + " L/100km");
	     System.out.println("Seats: " + seatingCapacity);
	     System.out.println("Cargo Volume: " + cargoVolume + " Litres");
	     System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
	}
	
}

