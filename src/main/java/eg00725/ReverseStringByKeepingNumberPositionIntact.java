package eg00725;

public class ReverseStringByKeepingNumberPositionIntact {

	public static void main(String[] args) {

		ReverseStringByKeepingNumberPositionIntact obj = new ReverseStringByKeepingNumberPositionIntact();
		String str = "ab2cd5xyz";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("Revesed String with fixed Number Position : ");
		System.out.println(obj.reverseStringWithFixedNumberPostition(str));
	}

	public String reverseStringWithFixedNumberPostition(String str) {
		// Find Length of Array
		int n = str.length();

		// Boundary checks
		if (n == 0 || str.isEmpty() || str == null) {
			System.out.println("Invalid String");
			return str;
		}

		// Convert Array to Char Array
		char[] arr = str.toCharArray();

		// Declare two pointers low and high
		int low = 0;
		int high = n - 1;
		while (low < high) {
			// Check if got a Character from Starting of array
			if (Character.isDigit(arr[low])) {
				low++;
			}
			// Check if got a Character from Ending of array
			else if (Character.isDigit(arr[high])) {
				high--;
			}
			// If it is not a Character swap current character with last
			else {
				// swap
				char temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}

		// Convert Char Array to String
		return String.valueOf(arr);
	}

}
