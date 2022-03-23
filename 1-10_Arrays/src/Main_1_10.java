
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
		// Remember - index numbers count like machines do (starting from 0)
		
		// You can also have an array of numbers, like so:
		
		int evenNum[] = {2, 4, 6, 8, 10, 12, 14}; // 2, 4, 6, etc. are all elements
		
		// index #:		 0  1  2  3   4   5   6
		
		// Index numbers are how we refer to each element in our program
		
		String favColour = colours[3]; // Try changing this number. If you enter a number outside the array range, you will receive an error
		System.out.println("Long way of Fav Colour: " + favColour);
		
		// Or simply:
		
		System.out.println("Fav Colour: " + colours[3]);
		
		// You can also use a For Loop to output every element in an array:
		
		String col "";
		
		for (col : colours) {
			System.out.println(col);
		}
		
	}

}
