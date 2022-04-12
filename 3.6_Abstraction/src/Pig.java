
// |=================|
// |   ABSTRACTION   |
// |=================|

public class Pig extends Animal {

	// The body of the abstract method "animalSound".
	public String animalSound() {
		String animalMsg = "This animal makes the sound: ";
		
		return animalMsg;
	}
	
	public String pigSound() {
		String pigMsg = "OINK!";
		
		return pigMsg;
	}
	
}
