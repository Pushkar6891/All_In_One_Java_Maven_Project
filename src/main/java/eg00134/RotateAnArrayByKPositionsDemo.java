package eg00134;

import java.util.Arrays;

public class RotateAnArrayByKPositionsDemo {

	public static void main(String[] args) {
		RotateAnArrayByKPositionsDemo obj = new RotateAnArrayByKPositionsDemo();
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int n = a.length;
		int k = 2;
		System.out.println(Arrays.toString(a));
		obj.rotateArray(a, n, k);
		System.out.println(Arrays.toString(a));
	}

	public int[] rotateArray(int[] a, int n, int k) {
		reverseArray(a, 0, k - 1);
		reverseArray(a, k, n - 1);
		reverseArray(a, 0, n - 1);
		return a;
	}

	public void reverseArray(int[] a, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

}
