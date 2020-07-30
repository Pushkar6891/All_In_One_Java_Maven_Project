package eg00407;

public class Sony extends TV {

	Remote remoteType;

	Sony(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
	void on() {
		System.out.print("Sony TV ON: ");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.print("Sony TV OFF: ");
		remoteType.off();
	}

}
