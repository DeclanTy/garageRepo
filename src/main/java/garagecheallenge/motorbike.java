package garagecheallenge;

public class motorbike extends vehicle{
	private String type;

	public motorbike(String model, String category, String fuelType, int tankSize, int tankLevel, String type) {
		super(model, category, fuelType, tankSize, tankLevel);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "motorbike [type=" + type + ", getModel()=" + getModel() + ", getCategory()=" + getCategory()
				+ ", getFuelType()=" + getFuelType() + ", getTankSize()=" + getTankSize() + ", getTankLevel()="
				+ getTankLevel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
