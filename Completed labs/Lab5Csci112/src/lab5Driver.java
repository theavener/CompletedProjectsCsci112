
public class lab5Driver {
	
	public static void main (String [] args){
		
		// notice that the left declaration is of Shape and the right is Square
		// This is an example of Polymorphism
		Shape square = new Square(7.4, 7.4);
		
		
		// again the left is Shape but this time the right is Rectangle
		// another example of Polymorphism
		Shape rect = new Rectangle(10.4, 5.6);
		
		
		// neither Square or Rectangle have a getArea method but Shape does
		// so Square and Rectangle can use Shapes getArea method
		System.out.println("The area of the square is: " + square.getArea() + " and it's perimeter is " + ((Square) square).getPerimeter());
		System.out.println("The area of the rectangle is: " + ((Rectangle)rect).getArea() + " and it's perimeter is " + ((Rectangle) rect).getPerimeter());
	}
}
