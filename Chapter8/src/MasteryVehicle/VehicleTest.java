/*

Program: VehicleTest.java          Last Revision: December 4, 2025

Purpose: Create a Vehicle class that defines the general details and actions associated with a vehicle.

Mateo Luna, CHHS
Computer Programming 30
 
*/

package MasteryVehicle;

public class VehicleTest {

	public static void main(String[] args) 
	{
		
		//Declare car, truck, and minivan objects, and assign details to each of the vehicles
        Vehicle car = new Car(10, 7, 4, 500.0, true);
        Vehicle truck = new Truck(15, 12, 2, 2000.0, true);
        Vehicle minivan = new Minivan(12, 9, 6, 3000.0, true);

        //Display details of the car
    	car.showDetails();
    	System.out.println();
    	
    	//Display details of the minivan
    	minivan.showDetails();
    	System.out.println();
    	
    	 //Display details of the truck
    	truck.showDetails();
    	System.out.println();
    	
	}
	

}

/*

- Car Details
Fuel economy (City): 10.0 L/100km
Fuel economy (Highway): 7.0 L/100km
Seats: 4
Cargo Volume: 500.0 Litres
Electric: Yes

- Minivan Details
Fuel economy (City): 12.0 L/100km
Fuel economy (Highway): 9.0 L/100km
Seats: 6
Cargo Volume: 3000.0 Litres
Sunroof: Has

- Truck Details
Fuel economy (City): 15.0 L/100km
Fuel economy (Highway): 12.0 L/100km
Seats: 2
Cargo Volume: 2000.0 Litres
Winter Tires: Has

*/