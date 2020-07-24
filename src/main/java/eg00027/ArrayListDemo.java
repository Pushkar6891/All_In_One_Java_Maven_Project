package eg00027;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayListDemo obj = new ArrayListDemo();
		obj.displayList();

	}

	public void displayList() {
		List<Integer> numList = new ArrayList<>();
		numList.add(9);
		numList.add(8);
		numList.add(2);
		numList.add(6);
		numList.add(3);
		numList.add(1);
		numList.add(-2);
		numList.add(-7);
		numList.add(4);
		numList.add(5);
		numList.forEach(System.out::println);
	}

}
