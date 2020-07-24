package eg00217;

public class Tester {

	public static void main(String[] args) {

		Shape circle = new Circle(new Red());
		String redCircle = circle.draw();
		System.out.println(redCircle);

		Shape square = new Square(new Blue());
		String blueSquare = square.draw();
		System.out.println(blueSquare);
	}

}
