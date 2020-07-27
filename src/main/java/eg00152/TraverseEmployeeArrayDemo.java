package eg00152;

import java.util.Arrays;

public class TraverseEmployeeArrayDemo {

	public static void main(String[] args) {

		TraverseEmployeeArrayDemo obj = new TraverseEmployeeArrayDemo();
		Employee[] arr = new Employee[5];
		Employee employee1 = new Employee(109, "Pushkar", 1000, false);
		Employee employee2 = new Employee(102, "Amit", 2000, true);
		Employee employee3 = new Employee(103, "Ram", 7000, true);
		Employee employee4 = new Employee(101, "Lucky", 4000, true);
		Employee employee5 = new Employee(105, "Vikram", 6000, false);
		arr[0] = employee1;
		arr[1] = employee2;
		arr[2] = employee3;
		arr[3] = employee4;
		arr[4] = employee5;
		System.out.println("Size : " + arr.length);
		System.out.println("1. Using for Loop");
		obj.traverseEmployeeArrayUsingforLoop(arr);
		System.out.println("\n2. Using while Loop");
		obj.traverseEmployeeArrayUsingwhileLoop(arr);
		System.out.println("\n3. Using do while Loop");
		obj.traverseEmployeeArrayUsingdowhileLoop(arr);
		System.out.println("\n4. Using enhanced for Loop");
		obj.traverseEmployeeArrayUsingenhancedforLoop(arr);
		System.out.println("\n5. Using Java 8 Streams");
		obj.traverseEmployeeArrayUsingJava8Streams(arr);
	}

	public void traverseEmployeeArrayUsingforLoop(Employee[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void traverseEmployeeArrayUsingwhileLoop(Employee[] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

	public void traverseEmployeeArrayUsingdowhileLoop(Employee[] arr) {
		int n = arr.length;
		int i = 0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		} while (i < n);
	}

	public void traverseEmployeeArrayUsingenhancedforLoop(Employee[] arr) {
		for (Employee value : arr)
			System.out.print(value + " ");

	}

	public void traverseEmployeeArrayUsingJava8Streams(Employee[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
	}

}
