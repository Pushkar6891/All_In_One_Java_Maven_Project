package eg00207;

import java.lang.reflect.InvocationTargetException;

public class Tester {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singleton1 = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

		String name = "Pushkar";

		System.out.println(singleton1.welcome(name));
	}

}

