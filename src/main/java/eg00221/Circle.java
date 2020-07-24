package eg00221;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "Circle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + label + " with radius " + radius + " fillColor " + fillColor + " lineColor "
				+ lineColor);
	}
}
