package eg00232;

public class ACStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned OFF");
	}

}
