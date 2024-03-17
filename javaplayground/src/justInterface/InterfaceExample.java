package justInterface;

public class InterfaceExample implements WaterBottleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		
		//create a new instance of InterfaceExample called ex
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();

	}

	@Override
	public void fillUp() {
		//methods defined in the WaterBottle Interface need to be here
		System.out.println("It is filled");
	}

}
