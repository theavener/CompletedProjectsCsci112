
public class Rectangle extends Shape {

	private double perimeter;

	public Rectangle() {
		area = 0;
		perimeter = 0;
	}

	public Rectangle(double height, double width) {
		area = height * width;
		perimeter = (height + width) * 2;
	}

	public double getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
	

}
