package eg00232;

public class ACRemoteTesterSolution {

	public static void main(String[] args) {

		ACContext acContext = new ACContext();
		
		State ACStartState = new ACStartState();
		acContext.setState(ACStartState);
		acContext.doAction();
		
		State ACStopState = new ACStopState();
		acContext.setState(ACStopState);
		acContext.doAction();
	}

}
