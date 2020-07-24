package eg00216;

public class MobileAdapterImpl implements IMobileAdapter {

	private IWallSocket wallSocket;

	// Composition
	public MobileAdapterImpl(IWallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts() / 80;
		return new Volt(v3);
	}

}
