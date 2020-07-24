package eg00214;

public class Tester {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop.LaptopBuilder("8gb", "2.4 Hz", "1TB").build();
		System.out.println("Laptop Config : " + laptop1);

		Laptop laptop2 = new Laptop.LaptopBuilder("16gb", "2.6 Hz", "2TB").setBluetoothEnabled(true).build();
		System.out.println("Laptop Config : " + laptop2);

		Laptop laptop3 = new Laptop.LaptopBuilder("32gb", "2.8 Hz", "4TB").setBluetoothEnabled(true)
				.setGraphicsEnabled(true).build();
		System.out.println("Laptop Config : " + laptop3);
	}

}
