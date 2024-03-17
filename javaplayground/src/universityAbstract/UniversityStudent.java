/**
 * 
 */
package universityAbstract;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public abstract class UniversityStudent {
	
	//add a scanner for the number of courses
	Scanner scan = new Scanner(System.in);
	
	//variables 
	private String name;
	private int nCourses;
	
	private final double COURSE_FEE = 1000.30;
	
	//cannot put a string in an ArrayList
	//so we work around with a regular array
	private String[] yearinschool = {"freshman", "sophomore", "junior", "senior" };
	
	private ArrayList<String> years = new ArrayList<String>();
	
	//make a constructor
	// this constructor only needs name and number of courses
	public UniversityStudent(String name, int nCourses) {
		this.name = name;
		this.nCourses = nCourses;
		
		//use a loop to add the content of the array yearinschool to 
		// the ArrayList years
		for (String val : yearinschool) {
			years.add(val);
		}
	}
	
	//generate getters and setters

	public int getnCourses() {
		return nCourses;
	}

	public void setnCourses(int nCourses) {
		this.nCourses = nCourses;
	}
	
	public String getName() {
		return name;
	}
	
	//needs getter only since its a constant variable
	public double getCOURSE_FEE() {
		return COURSE_FEE;
	}
	
	
	// for arraylist need only getter to use with the get add
	public ArrayList<String> getYears() {
		return years;
	}
	
	//abstract methods can be placed in an abstract class w/o problems
	public abstract double totalcost();
	
	//method for tuition
	public double tuition() {
		//we put the user input in the Tester class 
		return COURSE_FEE * getnCourses(); //use getter for nCourses
	}
	
	//method to get the year of study
	public void YearOfStudy() {
		
		System.out.println("Tell us your year of study by entering a number: ");
		System.out.println("Enter 0 - freshman, 1 - sophomore, 2 - junior, 3 - senior");
		
		//save the user's choice
		int choice = scan.nextInt();
		
		
		// you can make a while loop until they pick a number from the choices provided
		
		// switch case for the different scenarios or choices
		switch (choice) {
		
		case 0:
			System.out.println("Freshman");
			break;
			
		case 1:
			System.out.println("Sophomore");
			break;
			
		case 2: //we can also use the arraylist instead of manually inputting it
			System.out.println(getYears().get(choice));
			break;
			
		case 3: //we can also use the arraylist instead of manually inputting it
			System.out.println(getYears().get(choice));
			break;
		
		default:
			System.out.println("Doesn't look like you're a student...");
			break;
		}
		
	}

	
	
	
	
	
	

}
