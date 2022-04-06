
// |==============================|
// |   VOID AND STATIC KEYWORDS   |
// |==============================|

public class Main_2_3 {
		
	// Static method
	static void myStaticMethod() {
    
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {

		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args) {
		
		// Static means the method or attribute can be accessed without creating an object of the class first
		// Void means the method does not return any value
		
		myStaticMethod(); // Calls the static method
		 
	    // myPublicMethod(); This would output an error
		
	    Main_2_3 myObj = new Main_2_3(); // Create an object of Main
	    myObj.myPublicMethod(); // Calls the public method
		
	}

}
