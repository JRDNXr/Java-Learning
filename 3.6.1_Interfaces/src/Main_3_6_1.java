
// |================|
// |   INTERFACES   |
// |================|

public class Main_3_6_1 {
	
	public static void main(String[] args) {
		
		// Another way to achieve abstraction in Java, is with interfaces.

		// An interface is a completely "abstract class" that is used to group related methods with empty bodies.
		
		Pig pigObject = new Pig();
		
		System.out.println(pigObject.animalSound() + pigObject.pigSound()); // Output: This animal makes the sound: OINK OINK!
		
		/* ** NOTES **
			- Like abstract classes, interfaces cannot be used to create objects
    
    		- Interface methods do not have a body - the body is provided by the "implement" class
    
    		- On implementation of an interface, you must override all of its methods
    
    		- Interface methods are by default abstract and public
    
    		- Interface attributes are by default public, static and final
    
    		- An interface cannot contain a constructor (as it cannot be used to create objects)
    		
    		- ** IMPORTANT NOTE ** You can group multiple interfaces together by using a comma
		*/
	}

}