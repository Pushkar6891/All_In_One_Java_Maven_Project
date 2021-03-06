package eg00718;

public class AllPermutationsOfStringUsingRecursion {

	public static void main(String[] args) {

		AllPermutationsOfStringUsingRecursion obj = new AllPermutationsOfStringUsingRecursion();
		String str = "abc";
		String prefix = "";
		obj.permute(str, prefix);
	}

	public void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.print(prefix + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			permute(ros, prefix + ch);
		}
	}

}
