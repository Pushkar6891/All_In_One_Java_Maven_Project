package eg00095;

public class SplitStringDemo {

	public static void main(String[] args) {

		SplitStringDemo obj = new SplitStringDemo();
		String str = "Welcome to KK Java Tutorials";
		int result = obj.countNumberOfWords(str);
		System.out.println(result);
	}

	public int countNumberOfWords(String str) {
		if(str==null || str.length()==0 || str.isEmpty()) {
			System.out.println("Please enter a valid String");
			return 0;
		}
		
		String[] words = str.split(" ");
		int result = words.length;
		return result;
	}

}
