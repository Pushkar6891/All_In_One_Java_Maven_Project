package eg00216;

public class Tester {

	public static void main(String[] args) {

		IWallSocket wallSocket = new WallSocketImpl();
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);

		IMobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		Volt v3 = mobileAdapter.get3Volt();
		System.out.println(v3);
	}

}
