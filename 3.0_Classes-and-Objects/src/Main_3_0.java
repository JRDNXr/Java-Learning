
// |=========================|
// |   CLASSES AND OBJECTS   |
// |=========================|

public class Main_3_0 { // This is how we create classes (you'll learn about public later)
	
	// At minimum the top class must match the name of the Java file
	
	/*
	 
	 A class is a template for objects.
	  
	 An object is an instance of a class.
	
	 When the individual objects are created, they inherit all the variables and methods from the class.
	
	 Think of it like this. Everything in Java is associated with classes and objects, along with its attributes and methods.
	  
	 For example: in real life, a car is an object. The car has attributes, such as weight and color. It also has methods,
	 such as drive and brake.
	 
	 A Class is like an object constructor, or a "blueprint" for creating objects.
	 
	 ** NOTE ** Class name first letter should always be capitalized
	 
    */
	
	int cost = 30000; // While "cost" is known as a variable, it also has another name given its usage - attribute
	
	// Attributes are variables within a class
	// Attributes are also called Class Attributes or Fields
	
	public static void main(String[] args) {
		
		// You can call objects from classes anywhere. Below is how we call an object from a class (the data ("cost") is contained within this file
		// but not within this block scope)
		Main_3_0 anObject = new Main_3_0(); // This piece of code creates a new object of a class
		
		System.out.println(anObject.cost); // Output: 30000
		
		
		
		// You'll notice below that the approach is the same way as above, only this time the data ("colour") is in a completely different file
		Car newCar = new Car();

		System.out.println("1st Object: " + newCar.colour); // Output: Red
		
		// You can also create multiple objects of the same class:
		
		Car newCar2 = new Car();
		
		System.out.println("2nd Object: " + newCar2.colour); // Output: Red
	}

}
