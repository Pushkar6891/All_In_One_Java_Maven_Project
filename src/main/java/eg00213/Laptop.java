package eg00213;

public class Laptop implements Computer {

	public String ram;
	public String cpu;
	public String hdd;
	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;

	public Laptop() {
	}

	public Laptop(String ram, String cpu, String hdd, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		return this.ram;
	}

	@Override
	public String cpu() {
		return this.cpu;
	}

	@Override
	public String hdd() {
		return hdd;
	}

	@Override
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + ", ram()=" + ram() + ", cpu()=" + cpu() + ", hdd()="
				+ hdd() + ", isGraphicsEnabled()=" + isGraphicsEnabled() + ", isBluetoothEnabled()="
				+ isBluetoothEnabled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
