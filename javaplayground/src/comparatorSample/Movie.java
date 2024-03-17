package comparatorSample;

import javaFrameworkSample.Movie;

//assume it is pre-created without no changes
public class Movie {
	
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
