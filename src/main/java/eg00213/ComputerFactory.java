package eg00213;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}

}
