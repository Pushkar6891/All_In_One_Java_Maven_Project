package eg00197;

import java.util.Collections;

import java.util.PriorityQueue;

public class TesterKthSmallestElementInArray {

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 3, 20, 15 };

		int k = 3;

		KthSmallestElementInArrayService service = new KthSmallestElementInArrayService() {

			@Override

			public int getKthSmallestElementUsingHeap(int[] arr, int k) {

				PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

				for (int i : arr) {

					heap.add(i);

					if (heap.size() > k) {

						heap.remove();

					}

				}

				return heap.remove();

			}

		};

		KthSmallestElementInArray obj = new KthSmallestElementInArray(service);

		int result = obj.perform(arr, k);

		System.out.println(result);

	}

}