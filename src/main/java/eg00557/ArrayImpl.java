package eg00557;

import java.util.Stack;

public class ArrayImpl {

	public void printNextLargerElements(int arr[]) {
		if (arr.length == 0) {
			return;
		}

		Stack<Integer> s = new Stack<>();

		s.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > s.peek()) {
				s.pop();
				System.out.print(arr[i] + " ");
			}

			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(-1);
			s.pop();
		}
	}

}
