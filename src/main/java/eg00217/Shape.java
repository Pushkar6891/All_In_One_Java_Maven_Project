package eg00217;

//Shape establish bridge between Shape and Color
public abstract class Shape {

	// 1. declare a protected reference of Color
	protected Color color;

	// 2. Initialize the reference
	public Shape(Color color) {
		this.color = color;
	}

	// 3. abstract method
	public abstract String draw();

}
