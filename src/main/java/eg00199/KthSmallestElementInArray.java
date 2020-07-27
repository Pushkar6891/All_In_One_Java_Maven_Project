package eg00199;

public class KthSmallestElementInArray {

	KthSmallestElementInArrayService service;

	public KthSmallestElementInArray() {

	}

	public KthSmallestElementInArray(KthSmallestElementInArrayService service) {

		this.service = service;

	}

	public int perform(int[] arr, int k) {
		return service.getKthSmallestElementUsingHeap(arr, k);

	}

}