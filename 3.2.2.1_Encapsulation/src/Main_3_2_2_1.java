
// |===================|
// |   ENCAPSULATION   |
// |===================|

public class Main_3_2_2_1 {

	// The meaning of Encapsulation is to make sure that "sensitive" data is hidden from users.
	// This means making variables and attributes "private".
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public static void main(String[] args) {
		
		// Main_3_3 objec1 = new Main_3_3();
		// object1.name = "JRDN";
		
		// These lines of code will generate an error.
		// This is because our class attribute "name" is set to private. This means that it can only be read within the declared class
		
		Main_3_2_2_1 object1 = new Main_3_2_2_1();
		object1.setName("JRDN");
		
		System.out.println("First Name: " + object1.getName()); // Output: First Name: JRDN
		
		/* ** NOTES **
		 * Encapsulation offers the following:
		 * 		- Better control of class attributes and methods
    	 *		- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    	 *		- Flexible: the programmer can change one part of the code without affecting other parts
    	 *		- Increased security of data
		 * 
		 */
	}
}
