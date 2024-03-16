/**
 * 
 */
package mar15;

/**
 * 
 */
public interface Measurable {
	double getMeasure(); //undefined non static method
	
	//static methods are allowed
	//below is a method using an object array
	static double average(Measurable[] objects) {
		double sum = 0;
		
		for (Measurable obj:objects) {
			sum += obj.getMeasure(); 
			//this method should return a value if you are adding them together
		}
		
		//trying to find out the average of the objects  
		//generic interface method
		if(objects.length > 0) {
			return sum/objects.length;
			
		} else {
			return 0;
		}
	}
}
