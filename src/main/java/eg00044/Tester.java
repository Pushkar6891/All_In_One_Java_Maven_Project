package eg00044;

public class Tester {

	public static void main(String[] args) {

		MyInterface1 myInterface1 = () -> System.out.println("Inside display()");
		myInterface1.display();
		MyInterface2 myInterface2 = (a, b) -> System.out.println(("Sum: " + (a + b)));
		myInterface2.sum(20, 30);
	}

}
