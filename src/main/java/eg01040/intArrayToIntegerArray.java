package eg01040;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.primitives.Ints;

public class intArrayToIntegerArray {

	public static void main(String[] args) {

		intArrayToIntegerArray obj = new intArrayToIntegerArray();
		obj.convertintArrayToIntgerArrayByCopyingTonewIntegerArray();
		obj.convertintArrayToIntgerArrayUsingJava8ArraysStream();
		obj.convertintArrayToIntgerArrayUsingJava8IntegerStream();
		obj.convertintArrayToIntgerArrayUsingGuavaLibrary1();
		obj.convertintArrayToIntgerArrayUsingGuavaLibrary2();
		obj.convertintArrayToIntgerArrayUsingApacheCommonsLangLibrary();
		
	}

	// 1. Using a new Integer Array
	public void convertintArrayToIntgerArrayByCopyingTonewIntegerArray() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = new Integer[intArr.length];
		for (int i = 0; i < intArr.length; i++) {
			integerBoxedArray[i] = Integer.valueOf(intArr[i]);
		}
		System.out.println(Arrays.toString(integerBoxedArray));
	}

	// 2. Using Integer[] integerBoxedArray =
	// Arrays.stream(intArr).boxed().toArray(Integer[]::new);
	public void convertintArrayToIntgerArrayUsingJava8ArraysStream() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(integerBoxedArray));
	}

	// 3. Using Integer[] integerBoxedArray =
	// Arrays.stream(intArr).boxed().toArray(Integer[]::new);
	public void convertintArrayToIntgerArrayUsingJava8IntegerStream() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = IntStream.of(intArr).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(integerBoxedArray));
	}

	// 4. Using Guava Library 1
	public void convertintArrayToIntgerArrayUsingGuavaLibrary1() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = Ints.asList(intArr).toArray(new Integer[0]);
		System.out.println(Arrays.toString(integerBoxedArray));
	}
	
	// 5. Using Guava Library 2
	public void convertintArrayToIntgerArrayUsingGuavaLibrary2() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = Ints.asList(intArr).toArray(new Integer[intArr.length]);
		System.out.println(Arrays.toString(integerBoxedArray));
	}
	
	// 6. Using Apache Commons Lang Library
	public void convertintArrayToIntgerArrayUsingApacheCommonsLangLibrary() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		Integer[] integerBoxedArray = ArrayUtils.toObject(intArr);
		System.out.println(Arrays.toString(integerBoxedArray));
	}
}
