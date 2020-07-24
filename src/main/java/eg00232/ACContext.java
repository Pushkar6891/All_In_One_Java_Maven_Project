package eg00232;

public class ACContext implements State {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	@Override
	public void doAction() {
		state.doAction();
	}

}
