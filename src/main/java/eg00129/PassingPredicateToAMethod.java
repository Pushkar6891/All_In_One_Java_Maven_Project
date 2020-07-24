package eg00129;

import java.util.function.Predicate;

//Predicate is a boolean function which returns true or false
public class PassingPredicateToAMethod {

	public static void main(String[] args) {

		PassingPredicateToAMethod obj = new PassingPredicateToAMethod();
		int[] arr = {9,8,3,1,10,11,12,39,-1};
		Predicate<Integer> predicate = i -> (i > 10);
		obj.showValuesGreaterThan10(arr, predicate);
	}
	
	public void showValuesGreaterThan10(int[] arr, Predicate<Integer> predicate) {
		for(int value:arr) {
			if(predicate.test(value)) {
				System.out.println(value);
			}
		}
	}
}
