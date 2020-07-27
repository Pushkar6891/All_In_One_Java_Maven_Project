package eg00199;

import java.util.Collections;
import java.util.PriorityQueue;

public class TesterKthLargestAndSmallestElementInArray {

	public static void main(String[] args) {

//		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int[] arr = { 9, 8, 2, 6, 3, 7, 1, 0, 11 };

		int k = 2;

		KthSmallestElementInArrayService kthSmallestService = new KthSmallestElementInArrayService() {

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

		KthLargestElementInArrayService kthLargestService = new KthLargestElementInArrayService() {

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

		KthSmallestElementInArray smallest = new KthSmallestElementInArray(kthSmallestService);
		KthLargestElementInArray largest = new KthLargestElementInArray(kthLargestService);

		int smallestResult = smallest.perform(arr, k);
		int largestResult = largest.perform(arr, k);

		System.out.println(smallestResult);
		System.out.println(largestResult);

	}

}