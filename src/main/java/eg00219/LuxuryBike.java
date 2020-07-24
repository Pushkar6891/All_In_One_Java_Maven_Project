package eg00219;

public class LuxuryBike extends DecoratorBike {

	public LuxuryBike(Bike bike) {
		super(bike);
	}

	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding features of Luxury Bike...");
	};
}
