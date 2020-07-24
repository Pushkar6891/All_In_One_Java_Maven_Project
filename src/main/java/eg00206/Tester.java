package eg00206;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Tester {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = null;
		
		Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			Object object = constructor.newInstance();
			singleton2 = (Singleton)object;
			break;
		}
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}


