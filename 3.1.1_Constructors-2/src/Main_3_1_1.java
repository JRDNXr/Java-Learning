
// |===================|
// |   CONSTRUCTORS 2  |
// |===================|

public class Main_3_1_1 {
	
	// We declare these variables here for the entire class
	String fName, lName;
	int empNum;
	
	// When the constructor is called (and it passes the values when an object is created, like on Line 28), these parameters ensure that the scope
	// here has a data type ready for them. For example, when we pass "JRDN" into this constructor, "String firstName" is ready to initialize the
	// firstName with the value "JRDN". You can see this from Line 13 when it writes it to the console
	public Main_3_1_1(String firstName, String lastName, int empNumber) {
		
		System.out.println("Constructor: " + firstName + " " + lastName + " " + empNumber); // Output: Constructor: JRDN DSouza 3456

		// Since the variables firstName, lastName, and empNumber are limited to THIS scope, we must initialize (or copy their values) into a variable
		// that can be read by everything in this class
		
		fName = firstName;
		lName = lastName;
		empNum = empNumber;
		
		// This is how we're able to write these to the console in the Main method below
		
	}
	
	public static void main(String[] args) {
		
		Main_3_1_1 object1 = new Main_3_1_1("JRDN", "DSouza", 3456); // Creates an object. When an object is created, it calls a constructor
		
		System.out.println("Main: " + object1.fName + " " + object1.lName + " " + object1.empNum); // Output: Main: JRDN DSouza 3456
	}

}
