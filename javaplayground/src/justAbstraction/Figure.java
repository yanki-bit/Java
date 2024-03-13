/**
 * 
 */
package justAbstraction;

/**
 * 
 */
public abstract class Figure {
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public abstract String typeofFig();

	@Override
	public String toString() {
		return "Figure [area()=" + area() + ", perimeter()=" + perimeter() + ", typeofFig()=" + typeofFig() + "]\n";
	}

	
	
	

}
