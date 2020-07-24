package eg00214;

public class Laptop {

	private String ram;
	private String cpu;
	private String hdd;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	// 1. Make constructor private and pass BUilder
	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// 2. Only create getters
	public String getRam() {
		return ram;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	// Create a nested public static LaptopBuilder class
	public static class LaptopBuilder {

		// 1 copy all parameters in outer class
		// mandatory parameter
		private String ram;
		private String cpu;
		private String hdd;

		// optional parameter
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;

		// provide manadatory parameter in consructor
		public LaptopBuilder(String ram, String cpu, String hdd) {
			super();
			this.ram = ram;
			this.cpu = cpu;
			this.hdd = hdd;
		}

		// provide setter for optional parameter and return LaptopBuilder Object
		public LaptopBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		// public build method
		public Laptop build() {
			return new Laptop(this);
		}

	}

}
