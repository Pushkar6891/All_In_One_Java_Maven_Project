package eg00069;

public class ReverseStringByWord {

	public static void main(String[] args) {
		ReverseStringByWord obj = new ReverseStringByWord();
		String str = "My name is Pushkar Chauhan";
		String result = obj.reverseStringByWord(str);
		System.out.println(result.trim());
	}

	public String reverseStringByWord(String str) {
		StringBuilder sb = new StringBuilder();
		String[] splitStr = str.split(" ");
		for (int i = 0; i < splitStr.length; i++) {
			String reversedStr = reverseString(splitStr[i]);
			sb.append(reversedStr);
		}
		return sb.toString();
	}

	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString() + " ";
	}
}
