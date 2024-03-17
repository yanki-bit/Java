/**
 * 
 */
package universityAbstract;

import java.util.Scanner;

/**
 * 
 */
public class StudentTester {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// initialize a scanner to take user input
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = inp.nextLine();
		
		System.out.println("Hi " + name + " , how many courses are you taking?: ");
		int courses = inp.nextInt();
		
		//use the new variable to substitute for arg parameters
		UniversityStudent Ari = new OnCampusStudent(name,courses);
		
		System.out.println(Ari.totalcost());
		
		//System.out.println(Ari.getYears());
		Ari.YearOfStudy();

	}

}
