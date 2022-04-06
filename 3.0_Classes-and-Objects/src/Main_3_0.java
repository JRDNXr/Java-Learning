
// |=========================|
// |   CLASSES AND OBJECTS   |
// |=========================|

public class Main_3_0 {
	
	/*
	 
	 A class is a template for objects.
	  
	 An object is an instance of a class.
	
	 When the individual objects are created, they inherit all the variables and methods from the class.
	
	 Think of it like this. Everything in Java is associated with classes and objects, along with its attributes and methods.
	  
	 For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods,
	 such as drive and brake.
	 
	 A Class is like an object constructor, or a "blueprint" for creating objects.
	 
    */
	
//	public class Car { // This is how we create classes (you'll learn about public later)
	
	String colour = "Blue";
	int cost = 30000;
	
	public static void main(String[] args) {
		
		Main_3_0 newCar = new Main_3_0();
		
		System.out.println(newCar.cost);
		
	}

}
