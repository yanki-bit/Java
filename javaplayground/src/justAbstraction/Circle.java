/**
 * 
 */
package justAbstraction;

/**
 * 
 */
public class Circle extends Figure {
	
	//new variables
	private double radius;
	
	//define constructor, uses same name as class
	public Circle (double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// use Math for a static function
		return Math.PI*Math.pow(radius,2.0);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public String typeofFig() {
		// this is the type of figure!
		return "Circle";
	}

}
