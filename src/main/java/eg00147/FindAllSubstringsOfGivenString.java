package eg00147;

public class FindAllSubstringsOfGivenString {
	public static void main(String[] args) {

		FindAllSubstringsOfGivenString obj = new FindAllSubstringsOfGivenString();
		String str = "abc";
		obj.findAllSubstringsUsingSubstringMethod(str);
	}

	public void findAllSubstringsUsingSubstringMethod(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}