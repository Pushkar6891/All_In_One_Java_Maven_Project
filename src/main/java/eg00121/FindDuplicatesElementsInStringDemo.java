package eg00121;

import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesElementsInStringDemo {

	public static void main(String[] args) {

		FindDuplicatesElementsInStringDemo obj = new FindDuplicatesElementsInStringDemo();
		String str = "Pushkar";
		Set<Character> result = obj.findDuplicateElements(str);
		System.out.println(result);
		System.out.println(result.size());

	}

	public Set<Character> findDuplicateElements(String str) {
		int duplicateCount = 0;
		Set<Character> duplicateElementsSet = new TreeSet<>();
		char[] duplicateElementsArr = new char[str.length()];
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicateElementsArr[duplicateCount++] = arr[i];
				}
			}
		}

		for (int i = 0; i < duplicateElementsArr.length; i++) {
			duplicateElementsSet.add(duplicateElementsArr[i]);
		}
		return duplicateElementsSet;
	}

}
