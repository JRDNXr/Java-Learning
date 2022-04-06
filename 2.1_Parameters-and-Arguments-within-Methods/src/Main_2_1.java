
// |==============================================|
// |   PARAMETERS AND ARGUMENTS WITHIN METOHODS   |
// |==============================================|

public class Main_2_1 {
	
	// Parameters act as variables inside the method
	
	static void printName(String firstName, String lastName) { // When inputting parameters, you MUST include a data type before each variable
		System.out.println(firstName + " " + lastName);
	}
	
	static void printEmployeeData(String firstName, int empNum) {
		System.out.println(firstName + ": " + empNum);
		
		// You can use all kinds of Data Types. Keep these in mind:
		//		- You must match them in the order of your arguments (see below)
		//		- There must be the same amount of arguments as there are parameters (and vice versa)
	}
	
	public static void main(String[] args) {
		
		printName("JRDN", "DSouza"); // Output: JRDN D'Souza
		
		// The Strings "JRDN" and "DSouza" are known as arguments
		
		// Arguments are values that are passed to a method
		
		printEmployeeData("JRDN", 4523); // Output: JRDN: 4523
	}
	
}
