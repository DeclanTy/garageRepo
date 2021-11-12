package garagecheallenge;

public class EV extends vehicle{
	private int range;

	public EV(String model, String category, String fuelType, int tankSize, int tankLevel, int range) {
		super(model, category, fuelType, tankSize, tankLevel);
		this.range = range;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "EV [range=" + range + ", getModel()=" + getModel() + ", getCategory()=" + getCategory()
				+ ", getFuelType()=" + getFuelType() + ", getTankSize()=" + getTankSize() + ", getTankLevel()="
				+ getTankLevel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
