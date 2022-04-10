
// |============|
// |   ARRAYS   |
// |============|

public class Main_1_10 {
	
	public static void main(String[] args) {
		
		// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		// These values inside an array are also known as "elements"
		
		// Say suppose you have a bunch of colours. Rather than name every single colour, you can use an array:
		 
		String colours[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"}; // Red, Orange, Yellow, etc. are all elements
		
		// index #:			  0        1         2        3        4        5
		// Array Range: 0 (inclusive) and 5 (inclusive).
		// REMEMBER - index numbers count like machines do (starting from 0)
		
		// You can also have an array of numbers, like so:
		
		int evenNum[] = {2, 4, 6, 8, 10, 12, 14}; // 2, 4, 6, etc. are all elements
		
		// index #:		 0  1  2  3   4   5   6
		
		// Index numbers are how we refer to each element in our program
		
		String favColour = colours[3]; // Try changing this number. If you enter a number outside the array range, you will receive an error
		System.out.println("Long way of Fav Colour: " + favColour); // Output: Long way of Fav Colour: Green
		
		// Or simply:
		
		System.out.println("Fav Colour: " + colours[3]); // Output: Fav Colour: Green
		System.out.print("\n");
		
		// You can also use a For-Each Loop to output every element in an array:
		
		// String Array
		for (String colourPrint : colours) {
			System.out.println(colourPrint);
			
			// Output: Red
			//		   Orange
			//		   Yellow
			//		   Green
			//		   Blue
			//		   Purple
			
		}
		
		System.out.print("\n");
		
		// int Array
		for (int evenNumPrint : evenNum) {
			System.out.println(evenNumPrint);
			
			// Output: 2
			//		   4
			//		   6
			//		   8
			//		   10
			//		   12
			//		   14
			
		}
		
		System.out.print("\n");
				
		// To change or modify an element within an existing array, you can do this:
		
		colours[2] = "White";
				
		// Notice how there is no curly braces when modifying an element
		
		System.out.println(colours[2]); // Output: White
		
		// To determine the length of an array, you can use the length() method
		
		System.out.println(colours.length); // Output: 6
		
		// REMEMBER: Length() starts counting from 1
		// REMEMBER: You do not place () after length() when determining the length of an array. See below for when you do:
		
		String text = "test";
		System.out.println(text.length()); // Output: 4
		
	}

}
