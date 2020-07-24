package eg00212;

public class Tester {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "16GB", "2.2Ghz", "2Tb", true, true);
		System.out.println("Pc Config: " + pc);

		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "32GB", "2.2Ghz", "100Tb", true, true);
		System.out.println("Server Config: " + server);

		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "8GB", "2.2Ghz", "1Tb", true, true);
		System.out.println("Laptop Config: " + laptop);

	}

}
