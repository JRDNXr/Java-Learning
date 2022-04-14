
// |=======================|
// |   COLLECTIONS CLASS   |
// |=======================|

import java.util.ArrayList;

// Import the Collections class
import java.util.Collections;

public class Main_5_4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3); // Element number: 0
		numbers.add(5); // Element number: 1
		numbers.add(1); // Element number: 2
		numbers.add(4); // Element number: 3
		numbers.add(-8); // Element number: 4
		
		// We use the sort() method to sort the text.
		// If they are numbers, it will be organized from least to greatest.
		// If they are Strings, they will be organized alphabetically.
		Collections.sort(numbers);
		
		for (Integer output : numbers) {
			System.out.println(output);
			// Output: -8
			//		   1
			//		   3
			//		   4
			//		   5
		}
		
		System.out.print("\n");
		
		
		// Collections doesn't just "sort" the ArrayList. It physically changes their element number order.
		// For example, before sorting, element number 4 had the value -8.
		// After sorting, element number 4 has the value 5.
		System.out.println(numbers.get(4)); // Output: 5
		
		System.out.print("\n");
		
		// Essentially, when you sort an ArrayList using the Collections class, that new sorted list will replace your current one (if there were
		// any changes, that is).
		
		
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("JRDN");
		names.add("Thiya");
		names.add("Stephen");
		names.add("Ryan");
		names.add("Sam");
		names.add("Jason");
		names.add("Steven");
		names.add("David");
		names.add("Simon");
		
		Collections.sort(names);
		
		for (String output2 : names) {
			System.out.println(output2);
			
			// Output: David
			//		   JRDN
			//		   Jason
			//		   Ryan
			//		   Sam
			//		   Simon
			//		   Stephen
			//		   Steven
			//		   Thiya
		}
		
	}

}
