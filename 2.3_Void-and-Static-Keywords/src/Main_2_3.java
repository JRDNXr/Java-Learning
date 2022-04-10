
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
		
		// Static means the method or attribute can be accessed without creating an object of the class first.
		
		// Void means the method does not return any value.
		// Remember, anything with void in it basically means that by the end of the method, everything gets burnt up / destroyed.
		// This is why you can't println a void method. You must put println within the method if you wish for it to print to the console.
		
		// Calls the static method
		myStaticMethod(); // Output: Static methods can be called without creating objects
		 
	    // myPublicMethod(); This would output an error
		
	    Main_2_3 myObj = new Main_2_3(); // Create an object of Main
	    
	    // Calls the public method
	    myObj.myPublicMethod(); // Output: Public methods must be called by creating objects
		
	}

}
