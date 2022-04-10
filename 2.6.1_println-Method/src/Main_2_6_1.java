
// |====================|
// |   PRINTLN METHOD   |
// |====================|

public class Main_2_6_1 {
	
	public static void main(String[] args) {
		
		// print() and println() are methods
		// Both accomplish the same task - printing output to the console. The difference here is that print() will print a line, and that's it.
		// println() will print a line and add a newline (ENTER) at the end. This moves the cursor to a new line
		//
		// There is also printf(), which is used to print floating numbers (float and double) to the console IF there is also String text
		
		// The following examples of Concatenation
		
		int x = 2, y = 3;
		String result = x + "" + y;
		
		String firstName = "JRDN", lastName = "D\'Souza";
		String fullName = firstName + " " + lastName;
		// fullName will result in "JRDN DSouza"
		// You can also declare concatenations
		
		System.out.println("EXAMPLE 1: Hello " + firstName); // Output: EXAMPLE 1: Hello JRDN
		// Console Output: Hello JRDN
		// Adding a plus sign (+) in between the text ("EXAMPLE 1: Hello ") and variable (firstName) concatenates them together
		// Remember to put a space after Hello. Anything between " " is registered to the console, including white space
		
		System.out.print("EXAMPLE 2: "); // Output: EXAMPLE 2: JRDND'SouzaJRDN D'Souza
		System.out.println(firstName + lastName + fullName);
		// Console Output: JRDNDSouzaJRDN DSouza
		// When concatenating string variables, the console will merge everything together
		
		System.out.println("EXAMPLE 3: Legal Name: " + lastName + ", " + firstName); // Output: EXAMPLE 3: Legal Name: D'Souza, JRDN
		// Console Output: Legal Name: DSouza, JRDN
		// Here we are concatenating console text and variables together
		
		System.out.println("EXAMPLE 4: " + x + " + " + y); // Output: EXAMPLE 4: 2 + 3
		// Console Output: 2 + 3
		// This is great if you want to print the actual mathematical expression into the console
		
		// This will add text before the example below, so that it will not interfere with the console's mathematical evaluation
		System.out.print("EXAMPLE 5: "); // Output: EXAMPLE 5: 5 
		System.out.println(x + y);
		// Console Output: 5
		// You can use the console to evaluate numbers
		// This WILL NOT merge the two (Eg. 23. Use the example below for that!)
		
		System.out.println("EXAMPLE 6: " + x + y); // Output: EXAMPLE 6: 23
		// Console Output: 23
		// When concatenating strings and integers, the console resorts back to default and concatenates them into one giant string
		
		System.out.println("EXAMPLE 7: " + Math.max(5, 10)); // Output: EXAMPLE 7: 10
		// You can also minimize (or simplify) your code by running methods and classes within a println statement
		
	}

}
