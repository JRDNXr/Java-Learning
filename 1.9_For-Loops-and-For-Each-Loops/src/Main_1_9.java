
// |==================================|
// |   FOR LOOPS AND FOR-EACH LOOPS   |
// |==================================|

public class Main_1_9 {
	
	public static void main(String[] args) {
		
		/* ** NOTES **:
			Iterate: Go through an entire cycle.
		
			Use for loops to loop through your program a certain amount of times.
			
			For loops are highly customizable, and work with conditions operators and Booleans
		
		 	for (Statement 1, Statement 2, Statement 3) {
				code
		 	}
		
		 	Statement 1 is executed (one time) before the execution of the code block.
		 
		 	Statement 2 defines the condition for executing the code block.
		 
			Statement 3 is executed (every time) after the code block has been executed.
		 */
		
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			System.out.println(i);
			
			// Output: 0
			// 		   1
			// 		   2
			// 		   3
			// 		   4
		}
		
		System.out.print("\n");
		
		
		
		////////////////////
		// FOR-EACH LOOPS //
		////////////////////
		
		// The program above can be simplified with a For-Each Loop:
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for (String str : cars) {
			System.out.println(str);
			
			// Output: Volvo
			// 		   BMW
			// 		   Ford
			// 		   Mazda
		}
		
		// Essentially, the "str : cars" is acting like this: str <-- cars.
		// Each element in the car array is being copied to the str identifier.
		// Then, in the for loop scope, we are printing out str to the console.
		// The loop then repeats itself until all elements in the cars array have been printed out.
		
		System.out.print("\n");
		
		// This is an alternative method to the one above. The one above is still the recommended version.
		for (i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			
			// Output: Volvo
			// 		   BMW
			// 		   Ford
			// 		   Mazda
		}

	}

}
