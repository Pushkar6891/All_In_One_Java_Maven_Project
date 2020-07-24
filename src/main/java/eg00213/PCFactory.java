package eg00213;

public class PCFactory implements AbstractComputerFactory {

	public String ram;
	public String cpu;
	public String hdd;
	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;

	public PCFactory(String ram, String cpu, String hdd, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, cpu, hdd, isGraphicsEnabled, isBluetoothEnabled);
	}

}
