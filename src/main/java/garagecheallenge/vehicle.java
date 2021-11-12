package garagecheallenge;

public abstract class vehicle {
	private String model;
	private String category;
	private String fuelType;

	private int tankSize;
	private int tankLevel;
	

	public vehicle(String model, String category, String fuelType, int tankSize, int tankLevel) {
		super();
		this.model = model;
		this.category = category;
		this.fuelType = fuelType;
		this.tankSize = tankSize;
		this.tankLevel = tankLevel;
	}
	public abstract double calculateBill();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public int getTankLevel() {
		return tankLevel;
	}

	public void setTankLevel(int tankLevel) {
		this.tankLevel = tankLevel;
	}

}

// Class for petrol car
// class for motorbike
// class for electric vehicle
