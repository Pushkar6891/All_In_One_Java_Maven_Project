package eg00222;

//Original Impl
public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	public VeryExpensiveProcessImpl() {
		heavyInitialConfigurationSetup();
	}

	@Override
	public void process() {
		System.out.println("Processing is done");
	}

	public void heavyInitialConfigurationSetup() {
		System.out.println("Setting up initial configuration");
	}

}
