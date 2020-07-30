package eg00403;

class Bike extends Vehicle {
	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
}
