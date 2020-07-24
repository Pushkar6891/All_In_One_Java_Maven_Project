package eg00232;

public class ACRemoteTesterProblem {

	private String state;

	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if("ON".equalsIgnoreCase(state)) {
			System.out.println("AC is turned ON");
		}else if("OFF".equalsIgnoreCase(state)) {
			System.out.println("AC is turned OFF");
		}
	}

	public static void main(String[] args) {

		ACRemoteTesterProblem obj = new ACRemoteTesterProblem();
		
		obj.setState("ON");
		obj.doAction();
		
		obj.setState("OFF");
		obj.doAction();
	}

}
