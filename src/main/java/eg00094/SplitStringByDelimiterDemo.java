package eg00094;

import java.util.Arrays;

import eg00092.CountDemo;

public class SplitStringByDelimiterDemo {

	public static void main(String[] args) {

		SplitStringByDelimiterDemo obj = new SplitStringByDelimiterDemo();
		String countriesByCommaDelimiter = "USA,UK,USSR,NZ,AUS";
		String countriesByTabDelimiter = "USA	UK	USSR	NZ	AUS";
		String countriesByPipeDelimiter = "USA|UK|USSR|NZ|AUS";
		String[] str = new String[3];
		str[0] = countriesByCommaDelimiter;
		str[1] = countriesByTabDelimiter;
		str[2] = countriesByPipeDelimiter;
		obj.splitString(str);
	}

	public void splitString(String[] str) {
		for (String value : str) {
			if (value.contains(",")) {
				String[] countries = value.split(",");
				System.out.println(Arrays.toString(countries));
			} else if (value.contains("	")) {
				String[] countries = value.split("	");
				System.out.println(Arrays.toString(countries));
			} else if (value.contains("|")) {
				String[] countries = value.split("\\|");
				System.out.println(Arrays.toString(countries));
			} else {
				System.out.println("Please Enter a valid String");
			}
		}
	}

}
