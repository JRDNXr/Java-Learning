
// |================================================|
// |   WRAPPER CLASSES (NON-PRIMITIVE DATA TYPES)   |
// |================================================|

public class Main_5_5 {
	
	public static void main(String[] args) {

		// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		//
		// byte, short, int, long, double, float, boolean, and char are all primitive data types.
		// Byte, Short, Integer, Long, Double, Float, Boolean, and Character are all non-primitive data types.
		//
		// Recall this information about objects:
		//
		// When the individual objects are created, they inherit all the variables and methods from the class.
		//
		// For example: in real life, a car is an object. The car has attributes, such as weight and color. It also has methods,
		// such as drive and brake.
		
		Integer anInt = 7;
		
		// Both options below will print the same output:
		// Notice the second option uses the method intValue() to print the object "anInt".
		System.out.println(anInt); // Output: 7
		System.out.println(anInt.intValue()); // Output: 7
		
		// There are also methods for the other Data Types:
		//
		// byteValue(), shortValue(), intValue(), longValue(), doubleValue(), floatValue(), booleanValue(), and charValue().
	}

}
