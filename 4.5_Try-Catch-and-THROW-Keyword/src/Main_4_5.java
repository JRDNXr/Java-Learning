
// |===================================|
// |   TRY...CATCH AND THROW KEYWORD   |
// |===================================|

import java.util.Scanner;

public class Main_4_5 {

	static void checkAge(int age) {
		if (age < 18) {
			
			// Read below first, then read this information.
			// We can use the "throw" keyword to create a custom error. throw is typically used with an exception type.
	      	throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// When coding, you've probably come across Java errors that have stopped your program from working. While "errors" is an accurate
		// name, we tend to use "throwing an exception" ("throwing an error") to explain these occurrences.
		
		// When these errors are thrown, your program immediately cuts the process and stops working. However, we can catch the error
		// before the console cuts the program in order to keep our program running smoothly (errors will always happen, sometimes in the most
		// unlikely scenarios).
		
		// The try statement allows you to define a block of code to be tested for errors while it is being executed.

		// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
		int userNum = 0;
		
		System.out.print("Enter a character or text (NOT A NUMBER): ");
		
		try {
			userNum = userInput.nextInt();
		} catch (Exception e) {
			System.out.print("\n");
			System.out.print("ERROR: Please enter a number.");
			
			System.out.print("\n");

		} finally { // Try-catch also has a finally keyword, which allows you to run code regardless of the outcome.
			System.out.print("\n");
			System.out.println("Thanks for the input!");
			System.out.print("\n");
		}
		
		
		// Check the static method.
	    checkAge(15);
		
	}
}
