package eg00130;

import java.util.function.Predicate;

//Predicate is a boolean function which returns true or false
public class PassingPredicateToAMethodAndJoinPredicates {

	public static void main(String[] args) {

		PassingPredicateToAMethodAndJoinPredicates obj = new PassingPredicateToAMethodAndJoinPredicates();
		int[] arr = {9,8,3,1,10,11,12,39,-1};
		
		Predicate<Integer> predicate1 = i -> (i > 10);
		Predicate<Integer> predicate2 = i -> i%2==0;
		System.out.println("\nGreater than 10");
		obj.m1(arr, predicate1);
		System.out.println("\nEven Numbers");
		obj.m1(arr, predicate2);
		System.out.println("\nNot Even Numbers");
		obj.m1(arr, predicate2.negate());
		System.out.println("\nEven and Greater than 10");
		obj.m1(arr, predicate1.and(predicate2));
		System.out.println("\nEven or Greater than 10");
		obj.m1(arr, predicate1.or(predicate2));
	}
	
	public void m1(int[] arr, Predicate<Integer> predicate) {
		for(int value:arr) {
			if(predicate.test(value)) {
				System.out.println(value);
			}
		}
	}
}
