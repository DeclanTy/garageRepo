package garagecheallenge;

public class car extends vehicle {
	private String brand;

	public car(String model, String category, String fuelType, int tankSize, int tankLevel, String brand) {
		super(model, category, fuelType, tankSize, tankLevel);
		this.brand = brand;

	}
	// getter

	public String getBrand() {
		return brand;
	}

    //setter
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "car [brand=" + brand + ", getModel()=" + getModel() + ", getCategory()=" + getCategory()
				+ ", getFuelType()=" + getFuelType() + ", getTankSize()=" + getTankSize() + ", getTankLevel()="
				+ getTankLevel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
