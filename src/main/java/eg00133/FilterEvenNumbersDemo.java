package eg00133;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbersDemo {

	public static void main(String[] args) {

		FilterEvenNumbersDemo obj = new FilterEvenNumbersDemo();
		int[] arr = { 23, 45, 66, 87, 12, 122, 212, 4 };
		obj.m1(arr);
		System.out.println();
		obj.m2(arr);
	}

	public void m1(int[] arr) {
		for (int value : arr) {
			if (value % 2 == 0) {
				System.out.print(value + " ");
			}
		}
	}

	public void m2(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int value : arr) {
			list.add(value);
		}
		
		Predicate<Integer> predicate = i->i%2==0;
		List<Integer> list2 = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(list2);
	}

}
