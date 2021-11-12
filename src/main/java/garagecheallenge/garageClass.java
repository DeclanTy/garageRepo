package garagecheallenge;

import java.util.ArrayList;


public class garageClass {
	ArrayList<vehicle> listVehicle = new ArrayList<vehicle>();

	public void addToList(vehicle vehicle) {

		listVehicle.add(vehicle); //adds vehicle to the list created above

	}

	public void printVehicle() { //list printer, using loop to go through each line
		for (vehicle i : listVehicle) {
			System.out.println(i);
		}
	}
    //bill calculator -petrol = £2 for a litre, Electric =£1 a litre
	public int bill(vehicle vehicle) {
		int tankSize = vehicle.getTankSize(); //getters
		int tankLevel = vehicle.getTankLevel();
		String fuelType = vehicle.getFuelType();
		if (fuelType == "petrol") {
			return ((tankSize - tankLevel) * 2);
		} else if (fuelType == "electric") {
			return (tankSize - tankLevel);
		} else {
			return (-1); //only possbile inputs are electric or petrol
			//but can add diesel later
			
		}

	}
	

//	public void printVehicle() {
//		for(vehicle i: listVehicle) {
//			System.out.println(i);

}
