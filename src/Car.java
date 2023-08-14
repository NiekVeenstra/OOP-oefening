
public class Car {
	public String brand;
	public int amountOfDoors;
	public boolean isElectric;
	public int maxSpeed;
	public String engineBrand;

	public void printMaxSpeed() {
		System.out.println(maxSpeed);
	}

	public void printAllProperties() {
		System.out.println(brand);
		System.out.println(amountOfDoors);
		System.out.println(isElectric);
		System.out.println(maxSpeed);
		System.out.println(engineBrand);
	}

	public void updateBrand(String brand) {
		this.brand = brand;
	}

	public void updateMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isFast() {
		return maxSpeed > 200;
	}

	public boolean isSmall() {
		return amountOfDoors < 5;
	}

	public Car() {
		maxSpeed = 200;
	}

	public Car(int maxSpeed, String brand) {
		this.maxSpeed = maxSpeed;
		this.brand = brand;
	}
}
