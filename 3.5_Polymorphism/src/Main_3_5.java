
// |==================|
// |   POLYMORPHISM   |
// |==================|

public class Main_3_5 {

	public static void main(String[] args) {
		
		/* ** NOTES **
			
			Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
			
			
			The DIFFERENCES between Inheritance and Polymporphism:
				
				>> Inheritance lets us inherit attributes and methods from another class.
		
				>> Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.	
		*/
		
		// Each of these animals "inherits" the same phrase.
		// They each inherit the class AnimalSounds. Notice how there is no object created for the AnimalSounds Java Class. Doing so would create
		// redundant code.
		
		Pig pigObject = new Pig();
		Duck duckObject = new Duck();
		Cow cowObject = new Cow();
		Sheep sheepObject = new Sheep();

		System.out.println(pigObject.animalSound() + pigObject.pigSound()); // Output: This animal makes the sound: OINK!
		
		System.out.println(duckObject.animalSound() + duckObject.duckSound()); // Output: This animal makes the sound: QUACK!
		
		System.out.println(cowObject.animalSound() + cowObject.cowSound()); // Output: This animal makes the sound: MOO!
		
		System.out.println(sheepObject.animalSound() + sheepObject.sheepSound()); // Output: This animal makes the sound: BAH!
		
	}
}
