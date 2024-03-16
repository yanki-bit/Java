package justAbstraction;

import java.util.ArrayList;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure c1 = new Circle(1.0);
		
		Figure r1 = new Rectangle(1.5,2.5);
		
		//put these in the ArrayList
		ArrayList<Figure> figures = new ArrayList<Figure>();
		
		//add them to the figures array list
		figures.add(c1);
		figures.add(r1);
		
		//alternative way is to use for loop similar to pizza sample
		
		//check arraylist by printing 
		System.out.println(figures);

	}

}


