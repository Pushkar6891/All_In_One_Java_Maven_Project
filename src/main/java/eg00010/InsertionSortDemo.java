package eg00010;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {

		InsertionSortDemo obj = new InsertionSortDemo();
		int[] arr = { 5, 4, 10, 1, 6, 2 };
		System.out.println(Arrays.toString(arr));
		int[] result = obj.insertionSort(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] insertionSort1(int[] arr) {
		int n = arr.length;
	
		for (int i = 1; i < n; ++i) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				}
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	public int[] insertionSort(int[] arr) {

		int n = arr.length;
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
		
		return arr;
	}

}
