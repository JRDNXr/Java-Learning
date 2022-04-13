
// Import the Scanner class.
import java.util.Scanner;

public class Main_5_3 {
	
	public static void main(String[] args) {
		
		// The Scanner class is, as the name implies, a Java class.
		// Because of this, we create an object for it just like we would with any other Java class.
		
		Scanner userInput = new Scanner(System.in);
		
		// There is one noticeable difference. Towards the end, we include "(System.in)". This is crucial in making the Scanner class work.
		
		// Start by creating an identifer to store your user text. We created a String called "text" to do just that.
		String text;
		
		// Next, print a line of text. This will make it easier to see your cursor.
		// Don't forget a space after the colons (text: ).
		// ** NOTE ** We use "print" instead of "println". This will allow the user to type on the same line as the printed text.
		System.out.print("Write some text: ");
		//System.out.println("Write some text: "); <-- Try it out and see!
		
		// This next line is important! Using the String identifier "text", we want to fill it with a value.
		// Instead of filling it ourselves, we'll let our user do it! Using the method nextLine(), we're able to capture everything the user types.
		text = userInput.nextLine();
		
		
		System.out.print("\n");
		
		// Finally, we print out the user input:
		System.out.println(text);
		
		// There's also a bunch of other ways to capture user input.
		/*
			nextBoolean()	-	Reads a boolean value
			
			nextByte()		-	Reads a byte value
			
			nextDouble()	-	Reads a double value
			
			nextFloat()		-	Reads a float value
			
			nextInt()		-	Reads an int value
			
			nextLine()		-	Reads a String value
			
			nextLong()		-	Reads a long value
			
			nextShort()		-	Reads a short value
		*/

	}

}
