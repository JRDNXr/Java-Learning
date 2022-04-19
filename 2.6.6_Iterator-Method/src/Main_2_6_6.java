
// |=====================|
// |   ITERATOR METHOD   |
// |=====================|

// Import the Iterator class:
import java.util.Iterator;
import java.util.ArrayList;

public class Main_2_6_6 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<String>();
		
		colours.add("Red");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Yellow");
		
		// Creating an object "iterate" of the Iterator class:
		Iterator<String> iterateStr = colours.iterator();
		
		
		// Prints the first value of the ArrayList "colour" to the console:
		System.out.println(iterateStr.next()); // Output: Red
		
		
		// Loop through a collection using an Iterator method:
		while (iterateStr.hasNext()) {
			System.out.println(iterateStr.next());
			
			// Output: Red
			//		   Green
			//		   Blue
			//		   Yellow
		}
		System.out.print("\n");
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(8);
		nums.add(15);
		nums.add(19);
		nums.add(4);
		
		Iterator<Integer> iterateNums = nums.iterator();
		
		while(iterateNums.hasNext()) {
			int i = iterateNums.next();
			
			if (i < 10) {
				iterateNums.remove();
			}
		}
		
		//System.out.println(iterateNums.next()); <-- This will now give an error since we removed the 0th element in the ArrayList
		
		System.out.println(nums); // Output: [15, 19]
	}

}
