
// |=============|
// |   HASHSET   |
// |=============|

// Import HashSet
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main_4_4 {
	
	public static void main(String[] args) {
		
		// A HashSet is a collection of items where every item is unique.
		
		
		// This creates an HashSet object called "cars":
		HashSet<String> cars = new HashSet<String>();
		
		
		// Add values to a HashSet:
		cars.add("Audi");
		cars.add("Toyota");
		cars.add("Volvo");
		
		
		// Print out all values in a HashSet.
		// ** NOTE ** Notice that the console prints the values in reverse order. This also happens in a for-loop. 
		System.out.println(cars); // Output: [Volvo, Toyota, Audi]
		System.out.print("\n");
		
		// You can also use both a for-each and a for-loop:
		for (String out_HashSetcars : cars) {
			System.out.println(out_HashSetcars);
			
			// Output: Volvo
			//		   Toyota
			//		   Audi
		}
		System.out.print("\n");
		
		
		// Check if an item exists:
		System.out.println(cars.contains("Audi")); // Output: true
		System.out.print("\n");
		
		System.out.println(cars.contains("Porsche")); // Output: false
		System.out.print("\n");
		
		
		// Get the size of a HashSet:
		System.out.println("Size: " + cars.size()); // Output: Size: 3
	
		
		// HashSet does not contain duplicate values since every item in a set has to be unique. Size will remain at 3.
		cars.add("Audi");
		System.out.println("Size 2: " + cars.size()); // Output: Size: 3
		
		
		// Remove a value from a HashSet:
		cars.remove("Toyota");
		
		
		// Clear all items from a Hashset:
		cars.clear();
		
		
		
		//////////////////////////
		//   OTHER DATA TYPES   //
		//////////////////////////
		
		// To create another data type, just specify the type within the carrot symbols (< >).
		// Below we created a HashSet with an Integer data type:
		// ** NOTE ** Remember, we use Integer, NOT int for HashSet. This is because Collection objects, such as HashSet, cannot use
		// 			  primitive types.
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		// Below are all the other data types that you can have with a HashSet:
		HashSet<Byte> btye = new HashSet<Byte>();
		
		HashSet<Short> shrot = new HashSet<Short>();
		
		HashSet<Long> lnog = new HashSet<Long>();
		
		HashSet<Float> flaot = new HashSet<Float>();
		
		HashSet<Double> duoble = new HashSet<Double>();
		
		HashSet<Boolean> Boolaen = new HashSet<Boolean>();
		
		HashSet<Character> cahr = new HashSet<Character>();
	}

}
