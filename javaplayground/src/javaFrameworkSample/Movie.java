/**
 * 
 */
package javaFrameworkSample;

/**
 * Different ways to sort:
 * 1) if you have access to the Movie class,
 * let movie implement a specific interface: comparable
 
 * List is the parent class of ArrayList, 
 * since it is an interface you cannot use it on its own, so 
 * call on ArrayClass after defining on the left
 * 
 * Limitations:
 * > You must have access to the class
 * > You can do limited things here, uses int
 * > This does it one at a time
 * >
 *
 */
public class Movie implements Comparable {
	
	private int year;
	private String name;
	private double rating;
	
	//generate getters and setters
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	//ToString
	@Override
	public String toString() {
		return "\nMovie [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}
	
	//from the implemented Comparable abstract class
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return o.year - this.year;
	}
	
	//it will compare two movies at a time
	// 
	
	

}
