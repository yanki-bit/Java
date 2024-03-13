/**
 * 
 */
package justAbstraction;

/**
 * 
 */
public class Rectangle extends Figure {

	
	//define variables
	private double length, width;
	
	//constructors
	public Rectangle(double length, double width) {
	super();
	this.length = length;
	this.width = width;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
	
	@Override
	public String typeofFig() {
		// this is the type of figure!
		return "Rectangle";
	}

}
