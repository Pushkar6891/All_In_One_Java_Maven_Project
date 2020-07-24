package eg00128;

public interface B {
	default void m1() {
		System.out.println("Inside m1() in B");
	}
}
