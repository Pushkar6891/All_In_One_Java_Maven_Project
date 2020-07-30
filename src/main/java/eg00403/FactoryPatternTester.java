package eg00403;

abstract class Vehicle {
	public abstract int getWheel();

	public String toString() {
		return "Wheel: " + this.getWheel();
	}
}

public class FactoryPatternTester {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("car", 4);
		System.out.println(car);

		Vehicle bike = VehicleFactory.getInstance("bike", 2);
		System.out.println(bike);
	}

}