
// |=================|
// |   ARRAY LISTS   |
// |=================|

// Import the Java Array List class.
import java.util.ArrayList;

public class Main_4_1 {

	public static void main(String[] args) {
		
		/* ** NOTES **
			The ArrayList class is a resizable array, which can be found in the java.util package.

			The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
			(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and
			removed from an ArrayList whenever you want. The syntax is also slightly different:
		*/
		
		// This creates an ArrayList object called "cars".
		ArrayList<String> cars = new ArrayList<String>();
		
		// Here is how we add values to an ArrayList:
		cars.add("Audi"); // Element number: 0
		cars.add("Lexus"); // Element number: 1
		cars.add("Toyota"); // Element number: 2
		
		System.out.println(cars); // Output: [Audi, Lexus, Toyota]
		
		// We can call values based off their element number.
		System.out.println(cars.get(2)); // Output: Toyota
		
		
		// Unlike arrays, we can change values of an ArrayList.
		cars.set(2, "BMW");
		
		System.out.println(cars.get(2)); // Output: BMW
	}
}
