
// |===================================================|
// |   INHERITANCE AND POLYMORPHISM (EXTENDS KEYWORD)  |
// |===================================================|

public class Main_3_3 extends Vehicle {
	
	// We use the extends keyword to "inherit" the attributes and methods from the class "Vehicle".
	
	// By doing this, we no longer need to create an object every time we have a new Java Class. 
	
	// Think of inheritance like a folder setup.
	
	// Main_3_3
	//	 L> Vehicle
	
	// The Main_3_3 folder includes the Vehicle folder.
	
	public static void main(String[] args) {
		
		/* ** NOTES **
				
			Inheritance allows us to "copy" (for a lack of better words) attributes and methods from one class to another.
			This is divided into two categories:

    			>> subclass (child) - the class that inherits from another class
    				
    			>> superclass (parent) - the class being inherited from
				
			Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.


			The DIFFERENCES between Inheritance and Polymporphism:
				
				>> Inheritance lets us inherit attributes and methods from another class.
		
				>> Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
		*/
		
		// The code commented below is normally how we would invoke the honkSound method. Doing so is not wrong, however, when you have many Java
		// Classes to work with, creating several different objects could get tricky (and memorizing their unique names also isn't fun). It also
		// creates organized and decluttered code. This is where inheritance and polymorphism shine.
		
		// Vehicle vehicle = new Vehicle();
		 	
		// vehicle.honkSound();
		
		
		// Here is how we can do it using Inheritance:
		Main_3_3 car = new Main_3_3();
		
		car.honkSound(); // Output: HONK!
		
	}

}
