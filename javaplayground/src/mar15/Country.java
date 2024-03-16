package mar15;

public class Country implements Measurable {
	
	//add variables
	private double area;
	private String name;
	
	public Country(String name, double area) {
		this.name = name;
		this.area = area;
	}

	@Override
	public double getMeasure() {
		
		return this.area;
	}

}
