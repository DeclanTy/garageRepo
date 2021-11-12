package garagecheallenge;

public class Runner {
	private static char[] listVehicle;

	public static void main(String[] args) {
		car ET67TRY = new car("X-BO", "car", "petrol", 60, 45,"Datsun");
		EV GR70GHJ = new EV("Honda E","EV","electric",1000,380,200);
		motorbike SU58YUC = new motorbike("Suzuki","motorbike","petrol",20,19,"quadbike");
		
garageClass garage = new garageClass();

		garage.addToList(ET67TRY);
		garage.addToList(SU58YUC);
		garage.printVehicle();
		System.out.println("Your fuel will cost £"+garage.bill(GR70GHJ)+"Welcome to 2050 prices!");
		
		
		
		
		
		//garageClass g=new garageClass();
		

	}


}
