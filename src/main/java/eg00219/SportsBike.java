package eg00219;

public class SportsBike extends DecoratorBike {

	public SportsBike(Bike bike) {
		super(bike);
	}

	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding features of Sports Bike...");
	};
}
