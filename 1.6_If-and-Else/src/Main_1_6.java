
// |=================|
// |   IF AND ELSE   |
// |=================|

public class Main_1_6 {
	
	public static void main(String[] args) {
		
		// if and else are ways to validate statements
		
		int count = 1; // Try changing this number to something else
		
		if (count == 1) { // Remember, we use == to compare. We use a single = to assign a value only
			System.out.println("Your number is 1!");
			
		} else {
			System.out.println("Your number is " + count + "."); // Output: Your number is 1!
		}
		
		/* 
			There are lots of Comparison Operators you could use in an if statement. Below are all of them:
		  		>> 	==	Equal to
		 		>>	!=	Not equal to
		 		>>	>	Greater than
		 		>>	<	Less than
		 		>>	>=	Greater than or equal to
		 		>>	<=	Less than or equal to
		 */
		
		
		
		///////////////////////
		// ELSE IF STATEMENT //
		///////////////////////
		
		// No, this isn't a repeat. There is a statement called "else if".
		// "else if" specifies a new condition to test, usually when the "if" statement comes back as false
		
		count = 10; // Try changing this number to something else
		
		if (count == 1) {
			System.out.println("You got the WRONG number :(");
		}
		else if (count == 10) {
			System.out.println("You got the RIGHT number! Congratulations! :D"); // Output: You got the RIGHT number! Congratulations! :D
		}
		else {
			System.out.println("Something's not right here... You have a different number.");
		}
		
		
		
		////////////////////////
		// BOOLEAN CONDITIONS //
		////////////////////////
		
		// You can also use Boolean conditions within if and else if statements
		// Variables can also be tested
		
		if (1 > 2) {
			System.out.println("This will never, ever happen.");
		}
		else {
			System.out.println("PERFECT!"); // Output: PERFECT!
		}
	}

}
