package eg00201;

public class Tester {

	public static void main(String[] args) {

		Singleton singletonInstance1 = Singleton.getInstance();
		Singleton singletonInstance2 = Singleton.getInstance();
		
		System.out.println(singletonInstance1.hashCode());
		System.out.println(singletonInstance2.hashCode());
	}

}
