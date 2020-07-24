package eg00213;

public class Tester {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "2.2Ghz", "2Tb", true, true));
		System.out.println("PC Config: " + pc);

		Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "2.2Ghz", "100Tb", true, true));
		System.out.println("Server Config: " + server);

		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8GB", "2.2Ghz", "1Tb", true, true));
		System.out.println("Laptop Config: " + laptop);

	}

}
