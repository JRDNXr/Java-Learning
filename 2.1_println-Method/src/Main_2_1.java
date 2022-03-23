
// |====================|
// |   PRINTLN METHOD   |
// |====================|

public class Main_2_1 {
	
	public static void main(String[] args) {
		
		// print() and println() are methods
		// Both accomplish the same task - printing output to the console. The difference here is that print() will print a line, and that's it.
		// println() will print a line and add a newline (ENTER) at the end. This moves the cursor to a new line
		
		// The following examples of Concatenation
		
		int x = 2, y = 3;
		String result = x + "" + y;
		
		String firstName = "JRDN", lastName = "DSouza";
		String fullName = firstName + " " + lastName;
		// fullName will result in "JRDN DSouza"
		// You can also declare concatenations
		
		System.out.println("EXAMPLE 1: Hello " + firstName);
		// Console Output: Hello JRDN
		// Adding a plus sign (+) in between the text ("EXAMPLE 1: Hello ") and variable (firstName) concatenates them together
		// Remember to put a space after Hello. Anything between " " is registered to the console, including white space
		
		System.out.print("EXAMPLE 2: ");
		System.out.println(firstName + lastName + fullName);
		// Console Output: JRDNDSouzaJRDN DSouza
		// When concatenating string variables, the console will merge everything together
		
		System.out.println("EXAMPLE 3: Legal Name: " + lastName + ", " + firstName);
		// Console Output: Legal Name: DSouza, JRDN
		// Here we are concatenating console text and variables together
		
		System.out.println("EXAMPLE 4: " + x + " + " + y);
		// Console Output: 2 + 3
		// This is great if you want to print the actual mathematical expression into the console
		
		System.out.print("EXAMPLE 5: "); // This will add text before the example below, so that it will not interfere with the console's mathematical evaluation
		System.out.println(x + y);
		// Console Output: 5
		// You can use the console to evaluate numbers
		// This WILL NOT merge the two (Eg. 23. Use the example below for that!)
		
		System.out.println("EXAMPLE 6: " + x + y);
		// Console Output: 23
		// When concatenating strings and integers, the console resorts back to default and concatenates them into one giant string
		
	}

}
