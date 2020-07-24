package eg00032;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMapDemo obj = new HashMapDemo();
		obj.displayMap();
	}
	
	public void displayMap() {
		Map<Customer,Integer> customerScoreCache = new HashMap<>();
		int scores[] = {9,8,7,9,6};
		customerScoreCache.put(new Customer(101, "Pushkar"), scores[0]);
		customerScoreCache.put(new Customer(104, "Amit"), scores[1]);
		customerScoreCache.put(new Customer(102, "Varun"), scores[2]);
		customerScoreCache.put(new Customer(109, "Geeta"), scores[3]);
		customerScoreCache.put(new Customer(107, "Seeta"), scores[4]);
		customerScoreCache.forEach((k,v)-> System.out.println("Key: " + k + "\t" +  "Value: " + v));
	}

}
