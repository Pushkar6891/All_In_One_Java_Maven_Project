package eg00222;

//Proxy Impl
public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {

	private static VeryExpensiveProcess veryExpensiveProcessObject;

	@Override
	public void process() {
		// Lazy Initialization
		if (veryExpensiveProcessObject == null) {
			veryExpensiveProcessObject = new VeryExpensiveProcessImpl();
		}
		veryExpensiveProcessObject.process();
	}

}
