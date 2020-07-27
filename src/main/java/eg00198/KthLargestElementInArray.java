package eg00198;

public class KthLargestElementInArray {

	KthLargestElementInArrayService service;

	public KthLargestElementInArray() {

	}

	public KthLargestElementInArray(KthLargestElementInArrayService service) {

		this.service = service;

	}

	public int perform(int[] arr, int k) {

		return service.getKthLargestElementUsingHeap(arr, k);

	}

}