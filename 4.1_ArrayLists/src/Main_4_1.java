
// |================|
// |   ARRAYLISTS   |
// |================|

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
		
		// This creates an ArrayList object called "cars":
		ArrayList<String> cars = new ArrayList<String>();
		
		// Add values to an ArrayList:
		cars.add("Audi"); // Element number: 0
		cars.add("Lexus"); // Element number: 1
		cars.add("Volvo"); // Element number: 2
		cars.add("Toyota"); // Element number: 3
		
		
		
		// We can display all the values in an ArrayList by calling the identifier ("cars").
		// You can also use a for-loop and a for-each loop.
		System.out.println("LIST 1: " + cars); // Output: LIST 1: [Audi, Lexus, Volvo, Toyota]
		System.out.print("\n");
	
		
		System.out.println("Using For-Each Loop:");
		for (String str : cars) {
			System.out.println(str);
			
			// Output: Using For-Each Loop:
			//		   Audi
			//		   Lexus
			//		   Volvo
			//		   Toyota
		}
		System.out.print("\n");
		
		
		// We can call values based off their element number.
		System.out.println("ELEMENT 2: " + cars.get(2)); // Output: ELEMENT 2: Volvo
		System.out.print("\n");
		
		
		// We can remove values in an ArrayList.
		cars.remove(1); // Removes Lexus
		
		// As you can see from the print statements below, when we remove an element from an ArrayList, Java automatically re-shuffles the ENTIRE
		// list. Audi stays the same at element 0, but Volvo and Toyota move up one element number. Volvo takes element 1, and Toyota takes
		// element 2. Element 3 releases back into memory, and will generate an error if called.
		
		System.out.println("LIST 2: " + cars); // Output: LIST 2: [Audi, Volvo, Toyota]
		System.out.print("\n");
		
		System.out.println(cars.get(0)); // Output: Audi
		System.out.println(cars.get(1)); // Output: Volvo
		System.out.println(cars.get(2)); // Output: Toyota
		// System.out.println(cars.get(3)); <-- This will generate an error.
		
		System.out.print("\n");
		
		
		// We can set (replace) values in an ArrayList.
		cars.set(1, "Jaguar");
		System.out.println(cars.get(1)); // Output: Jaguar
		
		System.out.print("\n");
		
		
		// We can find the length of an ArrayList. We use the method size() rather than length().
		System.out.println(cars.size()); // Output: 3
		
		System.out.print("\n");
		
		
		
		// You can remove all values from an ArrayList.
		cars.clear();
		
		// Since the ArrayList exists, the below line will not generate an error. However, it will not display any values since all of them have
		// been cleared.
		System.out.println(cars); // Output: []
		
		
		
		// You can sort through an ArrayList using the class Collections().
		// Check out Main_5_4.java for more information.
		
		
		
		//////////////////////////
		//   OTHER DATA TYPES   //
		//////////////////////////
		
		// To create another data type, just specify the type within the carrot symbols (< >).
		// Below we created an ArrayList with an Integer data type:
		// ** NOTE ** Remember, we use Integer, NOT int for ArrayList.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Below are all the other data types that you can have with an ArrayList:
		ArrayList<Byte> btye = new ArrayList<Byte>();
		
		ArrayList<Short> shrot = new ArrayList<Short>();
		
		ArrayList<Long> lnog = new ArrayList<Long>();
		
		ArrayList<Float> flaot = new ArrayList<Float>();
		
		ArrayList<Double> duoble = new ArrayList<Double>();
		
		ArrayList<Boolean> Boolaen = new ArrayList<Boolean>();
		
	}
}
