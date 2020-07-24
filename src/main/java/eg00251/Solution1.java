package eg00251;

public class Solution1 {
	public static void main(String[] args) {

		Solution1 obj = new Solution1();
		// int[] a = { 2, 0, 2 };
		int[] a = { 3, 0, 2, 0, 4 };
		System.out.println(obj.getMaxTrappedWater(a));
	}

	// Using Binary Search approach
	// decalre start and end variables
	public int getMaxTrappedWater(int[] height) {
		int result = 0;
		int start = 0;
		int end = height.length - 1;
		while (start < end) {
			// if start less than end
			if (height[start] <= height[end]) {
				int current = height[start];
				while (height[++start] < current) {
					result = result + current - height[start];
				}
			}
			// if start is greater than end
			else {
				int current = height[end];
				while (height[--end] < current) {
					result = result + current - height[end];
				}
			}
		}
		return result;
	}
}
