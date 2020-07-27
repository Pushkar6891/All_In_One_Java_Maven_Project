package eg00198;

import java.util.PriorityQueue;

public class TesterKthLargestElementInArray {

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 3, 20, 15 };

		int k = 3;

		KthLargestElementInArrayService service = new KthLargestElementInArrayService() {

			@Override

			public int getKthLargestElementUsingHeap(int[] arr, int k) {

				PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

				for (int i : arr) {

					heap.add(i);

					if (heap.size() > k) {

						heap.remove();

					}

				}

				return heap.remove();

			}

		};

		KthLargestElementInArray obj = new KthLargestElementInArray(service);

		int result = obj.perform(arr, k);

		System.out.println(result);

	}

}