package eg00253;

public class TesterMaxZeroesBetweenOnes {

	public static void main(String[] args) {

		String str = "1000110000100";

		MaxZeroesBetweenOnesService service = new MaxZeroesBetweenOnesService() {

			@Override

			public int maxConsecutiveZeroes(String str) {

				int n = str.length();

				String[] strArr = str.split("");

				int[] arr = new int[n];

				for (int i = 0; i < n; i++) {

					arr[i] = Integer.parseInt(strArr[i]);

				}

				int count = 0;

				int maxConsecutiveZeroes = 0;

				for (int i = 0; i < n; i++) {

					if (arr[i] == 0) {

						count++;

						if (maxConsecutiveZeroes < count) {

							maxConsecutiveZeroes = count;

						}

					} else {

						count = 0;

					}

				}

				return maxConsecutiveZeroes;

			}

		};

		MaxZeroesBetweenOnes obj = new MaxZeroesBetweenOnes(service);

		int result = obj.perform(str);

		System.out.println(result);

	}

}