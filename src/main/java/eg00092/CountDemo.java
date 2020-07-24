package eg00092;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountDemo {

	public static void main(String[] args) throws IOException {

		String line = "";
		int lineCounter = 0;
		int wordCounter = 0;
		int charCounter = 0;
		String filePath = "readme92.txt";
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
			lineCounter++;
			String[] words = line.split(" ");
			wordCounter += words.length;
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				charCounter += word.length();
			}
		}
		System.out.println("Line Counter : " + lineCounter);
		System.out.println("Word Counter : " + wordCounter);
		System.out.println("Char Counter : " + charCounter);
	}

}
