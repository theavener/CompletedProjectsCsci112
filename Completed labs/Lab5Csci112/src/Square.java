
public class Square extends Shape {

	private double perimeter;

	public Square() {
		perimeter = 0;
	}

	public Square(double height, double width) {
		perimeter = height * 4;
		setArea(height * width);
	}

	public double getPerimeter() {
		return perimeter;
	}
}
