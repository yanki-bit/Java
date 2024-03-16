package mar15;

import java.text.Format; //needed to import to use format class

public class MeasureSample {
	
	public static void main(String[]args) {
		//another way 
		//format is an abstract class 
		//Format myformat = new Format("##.##");
		
		
		//make the array defined in interface
		//needs constructor of child, which is country
		//anonymous class definition to get all the values in
		Measurable[] countries = {
				new Country("Canada",9.985),
				new Country("United States",9.834),
				new Country("India",3.827),
				new Country("China",9.597)
				};
		
		//now to find out the average, which uses a return type of double
		//need the name of the interface (Measurable) because it is a static method
		//Measurable.average(countries);
		
		System.out.println("sample" + Measurable.average(countries));
	}
	
	
}
