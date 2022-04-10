
// |===============|
// |   VARIABLES   |
// |===============|

public class Main_1_2 {

	public static void main(String[] args) {
		/* ** NOTES **
			 - Declaration: Tells the compiler about the existence of an entity
		     - Initialization: Assigning a value to a variable
		     - Identifiers: Variable names such as a, b or more descriptive such as firstName and lastName
		     		>> Names can contain letters, digits, underscores, and dollar signs
    				>> Names must begin with a letter
    				>> Names should start with a lowercase letter and it cannot contain whitespace
    				>> Names can also begin with $ and _ (but we will not use it in this tutorial)
    				>> Names are case sensitive ("myVar" and "myvar" are different variables)
    				>> Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		*/
		
		// It's best practice to declare and initialize variables at the top of a program
		// Any time you declare a variable, you start by using a "Data Type". String, int, etc. are all Data Types
		
		String a = "Hello";
		
		// Declares a string value (a word or line of text)
		
		// Notice the difference here between declaring an int and the rest of the variable types
		// You can declare multiple variables from a single variable type. Simply append a comma at the end of the variable value, as shown
		// Integers, floats, and boolean do not require any quotes 
		int b = 2, k = 17;
		
		// Declares an integer value (a whole number)
		
		float c = 5.99f;
		
		// Declares a float value (floating point numbers, such as decimals)
		
		char d = 'A';
		
		// Declares a char value (single characters). Must be surrounded with single quotes
		// You can also declare with ASCII values. These are numbers that correlate to symbols, letters, and numbers on a keyboard
		// If you declare a char with an ASCII value, no quotes are needed
				
		boolean e = true;
		
		// Declares a boolean value (true or false)
		
		final String j = "JRDN";
		
		// Final variables cannot be changed (they are "final")
		// Also known as unchangeable and read-only variables
		
		System.out.println(a); // Output: Hello
		System.out.println(b); // Output: 2
		System.out.println(c); // Output: 5.99
		System.out.println(d); // Output: A
		System.out.println(e); // Output: true
		System.out.println(j); // Output: JRDN
	}
	
}
