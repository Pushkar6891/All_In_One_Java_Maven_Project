package eg00216;

public class WallSocketImpl implements IWallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
