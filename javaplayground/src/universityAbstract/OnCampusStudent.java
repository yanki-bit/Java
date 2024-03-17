package universityAbstract;

import java.util.Scanner; //need these for getting user input

public class OnCampusStudent extends UniversityStudent implements EssentialLivingCost {

	//initialize a new scanner object and call in the individual methods
	Scanner scan = null;
	
	//this constant is available only for OnCampusStudent
	//monetary values usually better to keep as double
	private final double HOUSING_COST = 12000.00;
	
	public OnCampusStudent(String name, int nCourses) {
		super(name, nCourses);
		// constructors from abstract classes are not inherent so we have to explicitly mention it 
		scan = new Scanner(System.in); // better to initialize scanner in the constructor coz it is temporary
	}

	@Override // no need to explicitly mention the override keyword in java 10 up
	public double foodCost() {
		// we can use nextInt because of type casting, int is higher
		System.out.println("Please enter the yearly food cost: ");
		
		double cost = scan.nextDouble();
		
		return cost;
	}

	
	public double bookCost() {
		System.out.println("Please enter the yearly book cost: ");
		
		double cost = scan.nextDouble();
		
		return cost;
	}

	
	public double miscCost() {
		System.out.println("Please enter the total misc cost: ");
		
		double cost = scan.nextDouble();
		
		return cost;
	}


	public double totalcost() {
		// calculate using all the previous methods
		/** added super keyword to tuition since it's coming directly from the 
		 * parent class university student
		*/
		return super.tuition() + foodCost()  + bookCost() + miscCost() + HOUSING_COST ;
	}

	@Override
	public String toString() {
		return "OnCampusStudent [totalcost()=" + totalcost() + "]";
	}
	
	
	

}
