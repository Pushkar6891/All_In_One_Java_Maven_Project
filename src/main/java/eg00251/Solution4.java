package eg00251;

//Java program to find maximum amount of water that can 
//be trapped within given set of bars. 

public class Solution4 {

	// Method for maximum amount of water
	public int getMaxTrappedWater(int[] height, int n) {
		// time : O(n)
		// space : O(1)
		if (height.length == 0)
			return 0;
		int left = 0, right = height.length - 1;
		int leftMax = 0, rightMax = 0;
		int ans = 0;
		while (left < right) {
			if (height[left] > leftMax)
				leftMax = height[left];
			if (height[right] > rightMax)
				rightMax = height[right];
			if (leftMax < rightMax) {
				ans += Math.max(0, leftMax - height[left]);
				left++;
			} else {
				ans += Math.max(0, rightMax - height[right]);
				right--;
			}
		}
		return ans;
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		Solution4 obj = new Solution4();
		// int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		// int arr[] = { 2, 0, 2 };
		int arr[] = { 3, 0, 2, 0, 4 };
		int n = arr.length;
		System.out.println("Maximum water that can be accumulated is " + obj.getMaxTrappedWater(arr, n));
	}
}