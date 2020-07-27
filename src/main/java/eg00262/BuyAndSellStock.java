package eg00262;

public class BuyAndSellStock {

	public static void main(String[] args) {

		BuyAndSellStock obj = new BuyAndSellStock();
		int[] arr = { 7, 1, 5, 3, 6, 5 };
		System.out.println("Maximum Profit: ");
		System.out.println(obj.getMaxProfit(arr));
	}

	public int getMaxProfit(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] - min > max) {
				max = arr[i] - min;
			}
		}
		return max;
	}
}
// Input : [7,1,5,3,6,5]
// Output : 5
// Buy on day 2 and sell on day 5
// profit = 6 - 1 = 5
// selling price > buying/cost price