package eg00212;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(ComputerType computerType, String ram, String cpu, String hdd,
			boolean isGraphicsEnabled, boolean isBluetoothEnabled) {

		switch (computerType) {
		case PC:
			return new PC(ram, cpu, hdd, isGraphicsEnabled, isBluetoothEnabled);
		case SERVER:
			return new Server(ram, cpu, hdd, isGraphicsEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, cpu, hdd, isGraphicsEnabled, isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid Computer Type");
		}
	}

}
