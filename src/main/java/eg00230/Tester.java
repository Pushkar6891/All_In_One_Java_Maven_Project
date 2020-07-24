package eg00230;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		SubjectRead sub = new SubjectRead();
		new MyObserver(sub);
		// sub.readfile();
		sub.filereader();

	}
}
