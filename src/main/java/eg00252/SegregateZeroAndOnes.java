package eg00252;

public class SegregateZeroAndOnes {

	SegregateZeroAndOnesService service;

	public SegregateZeroAndOnes() {

	}

	public SegregateZeroAndOnes(SegregateZeroAndOnesService service) {
		this.service = service;
	}

	public int[] perform(int[] arr) {
		return service.segregateZeroAndOnes(arr);
	}

}