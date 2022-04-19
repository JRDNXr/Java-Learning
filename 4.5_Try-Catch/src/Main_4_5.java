
// |=================|
// |   TRY...CATCH   |
// |=================|

import java.util.Scanner;

public class Main_4_5 {

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
		
		while (userNum > 0 || userNum < 0) {
			System.out.print("Enter a character or text (NOT A NUMBER): ");
			
			try {
				userNum = userInput.nextInt();
			} catch (Exception e) {
				System.out.print("\n");
				System.out.print("ERROR: Please enter a number.");
			}
		}
	}
}
