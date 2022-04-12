
// |=================|
// |   ABSTRACTION   |
// |=================|

public class Main_3_6 {
	
	public static void main(String[] args) {
		
		Pig pigObject = new Pig();
		
		System.out.println(pigObject.animalSound() + pigObject.pigSound()); // Output: This animal makes the sound: OINK!
		
		// Data abstraction is the process of hiding certain details and showing only essential information to the user.
		
		/* ** NOTES **
		  
			Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

    		Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
    		(inherited from).
		*/
	}

}
