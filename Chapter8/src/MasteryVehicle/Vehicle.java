package MasteryVehicle;

public abstract class Vehicle 
{
	
	//Declare variables
	double  fuelEconomyCity;
    double fuelEconomyHwy;
    int seatingCapacity;
    double cargoVolume;
    
    //Constructor
    public Vehicle(double fEC, double fEH, int sC, double cV) 
    {
    	
    	fuelEconomyCity = fEC;
    	fuelEconomyHwy = fEH;
    	seatingCapacity = sC;
    	cargoVolume = cV;
    	
    }
    
    //Call to show details
	public abstract void showDetails();

}


