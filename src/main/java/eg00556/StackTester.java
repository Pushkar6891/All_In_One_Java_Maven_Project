package eg00556;

public class StackTester {

	public static void main(String[] args) {
		StackImpl a = new StackImpl();

		a.push(7);
		a.push(3);
		a.push(4);

		System.out.println(a.pop());
		System.out.println(a.pop());

		a.push(5);

		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
	}
}