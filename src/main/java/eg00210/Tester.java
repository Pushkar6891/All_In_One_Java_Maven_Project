package eg00210;

import java.io.IOException;

public class Tester {

	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = (Singleton) singleton1.clone();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

