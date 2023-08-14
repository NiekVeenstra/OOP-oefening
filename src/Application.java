
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!");

		Product product1 = new Product();
		product1.name = "tv";
		product1.soldOut = false;
		product1.price = 12;

		product1.increasePrice(2);
		System.out.println(product1.price);

		boolean uitkomst = product1.isCheap();
		System.out.println(uitkomst);

		Product product2 = new Product();
		product2.name = "laptop";
		product2.soldOut = false;
		product2.price = 119;

		Car car1 = new Car();
		car1.brand = "Volvo";
		car1.amountOfDoors = 5;
		car1.isElectric = false;
		car1.maxSpeed = 300;
		car1.engineBrand = "whatEver";

		System.out.println("---------------");

		car1.printMaxSpeed();

		System.out.println("---------------");

		car1.printAllProperties();

		System.out.println("---------------");
		car1.updateBrand("Tesla");
		car1.updateMaxSpeed(400);
		car1.printAllProperties();

		System.out.println("---------------");
		System.out.println(car1.isFast());
		System.out.println(car1.isSmall());

	}

}
