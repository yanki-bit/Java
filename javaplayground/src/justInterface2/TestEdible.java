package justInterface2;

public class TestEdible {

	public static void main(String[] args) {
		//create an object array
		Object[] objects = {
				new Tiger(),
				new Chicken(),
				new Apple()
		};
		
		//for loop
		for (int i = 0; i < objects.length; i++) 
		{
			//checks if an object is an instance of Edible
			// or implements Edible
			if (objects[i] instanceof Edible) 
			{
				System.out.println(((Edible)objects[i]).howToEat());
			}
		}
		
	}
	
}

//classes that will use the Edible Interface

class Animal {
	
}

class Chicken extends Animal implements Edible {
	//Chicken is an Animal
	//Chicken will use the methods defined from Edible

	
	public String howToEat() {
		// TODO Auto-generated method stub
		return "chicken: good when fried.";
	}
	
}

class Tiger extends Animal {
	//will not appear because it doesn't implement Edible
	
}

abstract class Fruit implements Edible {
	//doesn't need to implement the methods in edible, but its subclasses do
	
}

class Apple extends Fruit {
	//subclass of fruit, so it needs to implement Edible's method
	public String howToEat() {
		// TODO Auto-generated method stub
		return "apple: good alone or candied.";
	}

}


class Orange extends Fruit {
	//subclass of fruit, so it needs to implement Edible's method
	public String howToEat() {
		// TODO Auto-generated method stub
		return "orange: turn into orange juice!";
	}

}

