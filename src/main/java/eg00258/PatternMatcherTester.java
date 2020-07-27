package eg00258;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTester {

	public static void main(String[] args) {
		PatternMatcherTester obj = new PatternMatcherTester();
		String text = "abcaabcabbabca";
		String regex = "abca";
		System.out.println(Arrays.toString(obj.getIndexForMatchedPattern(text, regex)));
		// obj.printMatches(text, regex);
		// System.out.println(Arrays.toString(obj.regExIndex(regex, text)));
	}

	public int[] getIndexForMatchedPattern(String text, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		String index = "";

		// Check all occurrences
		while (matcher.find()) {
		//	System.out.println("Start index: " + matcher.start());
			index += matcher.start() + " ";
		}

		String[] splitedIndex = index.split(" ");
		int[] indexesArr = new int[splitedIndex.length];
		for (int i = 0; i < indexesArr.length; i++) {
			indexesArr[i] = Integer.parseInt(splitedIndex[i]);
		}

		return indexesArr;
	}
	
	public void printMatches(String text, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		// Check all occurrences
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end());
			System.out.println(" Found: " + matcher.group());
		}
	}



	public int[] regExIndex(String pattern, String text) {
		Integer fromIndex = 0;
		Matcher matcher = Pattern.compile(pattern).matcher(text);
		if ((fromIndex != null && matcher.find(fromIndex)) || matcher.find()) {
			return new int[] { matcher.start(), matcher.end() };
		}
		return new int[] { -1, -1 };
	}

}
