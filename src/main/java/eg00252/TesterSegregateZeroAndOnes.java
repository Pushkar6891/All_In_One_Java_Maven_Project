package eg00252;

import java.util.Arrays;

public class TesterSegregateZeroAndOnes {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 1, 0, 1 };

		SegregateZeroAndOnesService service = new SegregateZeroAndOnesService() {

			@Override
			public int[] segregateZeroAndOnes(int[] arr) {
				int zeroCount = 0;
				int n = arr.length;
				for (int i = 0; i < n; i++) {
					if (arr[i] == 0) {
						arr[zeroCount++] = 0;
					}
				}
				for (int i = zeroCount; i < n; i++) {
					arr[i] = 1;
				}
				return arr;
			}
		};

		SegregateZeroAndOnes obj = new SegregateZeroAndOnes(service);
		int[] result = obj.perform(arr);
		Arrays.stream(result).forEach(System.out::print);
	}

}