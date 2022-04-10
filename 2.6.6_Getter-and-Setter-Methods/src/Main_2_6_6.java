
// |===============================|
// |   GETTER AND SETTER METHODS   |
// |===============================|

public class Main_2_6_6 {

	// Declared a Class Attribute with a data type String called "colour"
	String colour;
	
	// Getter Method
	public String getColour() {
		return colour;
		
		// A constructor here would initialize the variable name.
		// Unlike a constructor, however, we are simply returning the value. This is called a "Getter".
		// Get methods return the value of the variable.
	}
	
	public void setColour(String newColour) {
		this.colour = newColour;
	
		System.out.println("COL" + colour);
		// A setter takes a parameter (newColour) and assigns it to the Class Attribute "colour".
		// We use the "this" keyword to refer to the current object.
		
		// There's a reason we use "this". See the commented code below:
		//
		// String colour = "RED";
		// colour = newColour;
		//
		// If the method (this one) declares a variable that happens to be the same name as the Class Attribute name, our program bugs out.
		// "colour = newColour;" is referring to the current scope variable "colour" (Line 29) rather than the Class Attribute variable "colour" (Line
		// 9). Therefore, it's crucial we use "this" to prevent future problems.
	}
	
	public static void main(String[] args) {
		
		Main_2_6_6 objectColour = new Main_2_6_6();
		
		objectColour.setColour("Green");
		System.out.println("Chosen Colour: " + objectColour.getColour());
		
	}
}
