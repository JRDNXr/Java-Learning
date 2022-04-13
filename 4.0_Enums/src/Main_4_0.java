
// |===========|
// |   ENUMS   |
// |===========|

public class Main_4_0 {
	
	public static void main(String[] args) {
		
		// Enum stands for "Enumerations". This means "specifically listed".
	
		// This is how we create an enum:
		enum Level {
			EASY,
			MEDIUM,
			HARD
			
			// ** NOTE ** Enum values are called "constants".
			// ** NOTE ** Enum constants should be capitalized.
		}
		
		Level levelEasy = Level.EASY;
		
		System.out.println(levelEasy); // Output: EASY
		System.out.print("\n");
		
		
		
		// We can also iterate through all enum constants using a for loop:
		// (The example below is a for-each loop, but you can also use a for loop).
		
		for (Level levelsEnum : Level.values()) {
			System.out.println(levelsEnum);
			
			// Output: EASY
			//		   MEDIUM
			//		   HARD
		}
		
		/* ** NOTES **
			- An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public,
			static and final (unchangeable - cannot be overridden).

			- An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
			
			- Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
		 */
		
	}

}
