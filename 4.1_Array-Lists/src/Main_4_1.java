
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
		cars.add("Volvo"); // Element number: 2
		cars.add("Toyota"); // Element number: 3
		
		System.out.println("LIST 1: " + cars); // Output: LIST 1: [Audi, Lexus, Volvo, Toyota]
		System.out.print("\n");
		
		// We can call values based off their element number.
		System.out.println("ELEMENT 2: " + cars.get(2)); // Output: ELEMENT 2: Volvo
		System.out.print("\n");
		
		// We can remove values in an ArrayList.
		cars.remove(1); // Removes Lexus
		
		// As you can see from the print statements, when we remove an element from an ArrayList, Java automatically re-shuffles the ENTIRE list.
		// Audi stays the same at element 0, but Volvo and Toyota move up one element number. Volvo takes element 1, and Toyota takes element 2.
		// Element 3 releases back into memory, and will generate an error if called.
		
		System.out.println("LIST 2: " + cars); // Output: LIST 2: [Audi, Volvo, Toyota]
		System.out.print("\n");
		
		System.out.println(cars.get(0)); // Output: Audi
		System.out.println(cars.get(1)); // Output: Volvo
		System.out.println(cars.get(2)); // Output: Toyota
		// System.out.println(cars.get(3)); <-- This will generate an error.
		
		
		System.out.println(cars.get(1));
		
		
		// This will not work. Since we removed the element 2, 
//		cars.add("Volvo");
//		
//		System.out.println(cars.get(1)); // Output: Volvo
	}
}
