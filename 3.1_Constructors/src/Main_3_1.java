
// |==================|
// |   CONSTRUCTORS   |
// |==================|

public class Main_3_1 {
	
	int num; // We declare a int named num here
	
	String testString = "JRDN";
	
	public Main_3_1() {
		num = 5; // Here we initialize the int named num to 5
	}

	public static void main(String[] args) {
		
		// A constructor in Java is a special method that is used to initialize objects.
		
		Main_3_1 object1 = new Main_3_1();
		
		// Constructors are called just like objects are.
		// Remember that when an object is created, it "inherits" all of the attribute values.
		
		System.out.println(object1.num);
		
		// ** NOTES **
		//		1. Constructors must match the class name
		// 		2. Constructors cannot have a void keyword
		
		// System.out.println(testString);
		
		// Uncomment the code above. You will receive an error.
		// This is because it cannot make a static reference to a non-static field. What this means is, attributes / class attributes / fields
		// can DECLARE and INITIALIZE variables. However, one of the options below must also happen:
		//		1. The data type MUST be prefaced with static
		//		2. A method or constructor initializes the variable
		//		3. An object is created within the class, and through the object, the variable is accessed
		
	}
}
