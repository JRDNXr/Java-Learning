
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
		
		
		
		// We can also iterate through all enum constants using a for loop:
		
		for (Level levelsEnum : levelEasy.values()) {
			System.out.println(levelsEnum);
		}
		
	}

}
