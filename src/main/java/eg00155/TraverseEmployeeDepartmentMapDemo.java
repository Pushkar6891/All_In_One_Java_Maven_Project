package eg00155;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eg00152.Employee;

public class TraverseEmployeeDepartmentMapDemo {

	public static void main(String[] args) {

		TraverseEmployeeDepartmentMapDemo obj = new TraverseEmployeeDepartmentMapDemo();
		Map<Employee, Department> map = new HashMap<>();
		Employee employee1 = new Employee(109, "Pushkar", 1000, false);
		Employee employee2 = new Employee(102, "Amit", 2000, true);
		Employee employee3 = new Employee(103, "Ram", 7000, true);
		Employee employee4 = new Employee(101, "Lucky", 4000, true);
		Employee employee5 = new Employee(105, "Vikram", 6000, false);
		Employee employee6 = new Employee(109, "Pushkar", 1000, false);
		Employee employee7 = new Employee(102, "Amit", 2000, true);
		Employee employee8 = new Employee(103, "Ram", 7000, true);
		Employee employee9 = new Employee(101, "Lucky", 4000, true);
		Employee employee10 = new Employee(105, "Vikram", 6000, false);
		Department department1 = new Department(201, "HR");
		Department department2 = new Department(203, "Finance");
		Department department3 = new Department(204, "Marketing");
		Department department4 = new Department(202, "Sales");
		Department department5 = new Department(205, "IT");
		map.put(employee1, department1);
		map.put(employee2, department2);
		map.put(employee3, department2);
		map.put(employee4, department5);
		map.put(employee5, department5);
		map.put(employee6, department4);
		map.put(employee7, department3);
		map.put(employee8, department3);
		map.put(employee9, department3);
		map.put(employee10, department1);
		System.out.println("Size : " + map.size());

		System.out.println("\n1. Using Iterator And EntrySet 1 Way");
		obj.traverseEmployeeMapUsingIteratorAndentrySet(map);
		System.out.println("\n2. Using Iterator And keySet 2 Way");
		obj.traverseEmployeeMapUsingIteratorAndkeySet(map);
		System.out.println("\n3. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseEmployeeUsingJava8StackInheritForEachFromIterableInterface(map);
		System.out.println("\n4. Using map.keySet() and map.values()");
		obj.traverseEmployeeMapUsingOnlyKeysAndOnlyValues(map);

	}

	public void traverseEmployeeMapUsingIteratorAndentrySet(Map<Employee, Department> map) {
		Iterator<Entry<Employee, Department>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Employee, Department> entry = iterator.next();
			System.out.print(entry.getKey() + " " + entry.getValue());
		}
	}

	public void traverseEmployeeMapUsingIteratorAndkeySet(Map<Employee, Department> map) {
		Set<Employee> keySet = map.keySet();
		Iterator<Employee> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Employee key = iterator.next();
			System.out.print(key + " " + map.get(key));
		}
	}

	public void traverseEmployeeUsingJava8StackInheritForEachFromIterableInterface(Map<Employee, Department> map) {
		map.forEach((k, v) -> System.out.print(k + " " + v));
	}

	public void traverseEmployeeMapUsingOnlyKeysAndOnlyValues(Map<Employee, Department> map) {
		for (Employee employeeKey : map.keySet()) {
			System.out.print(employeeKey);
		}
		for (Department departmentValue : map.values()) {
			System.out.print(departmentValue);
		}
	}

}
