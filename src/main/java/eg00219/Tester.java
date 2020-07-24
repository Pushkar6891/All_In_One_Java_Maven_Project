package eg00219;

public class Tester {

	public static void main(String[] args) {

		Bike basicBike = new BasicBike();
		basicBike.assembleBike();
		System.out.println("=======================");
		Bike sportsBike = new SportsBike(basicBike);
		sportsBike.assembleBike();
		System.out.println("=======================");
		Bike luxuryBike = new LuxuryBike(basicBike);
		luxuryBike.assembleBike();
		System.out.println("=======================");
		// adding features of both sprtes and luxury
		Bike sportsLuxuryBike = new SportsBike(new LuxuryBike(new BasicBike()));
		sportsLuxuryBike.assembleBike();
		System.out.println("=======================");
	}

}
