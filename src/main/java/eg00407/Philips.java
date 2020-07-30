package eg00407;

public class Philips extends TV {

	Remote remoteType;

	Philips(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
	void on() {
		System.out.print("Philips TV ON: ");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.print("Philips TV OFF: ");
		remoteType.off();
	}

}
