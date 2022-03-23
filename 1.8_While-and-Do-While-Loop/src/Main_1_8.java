
// |============================|
// |   WHILE AND DO WHILE LOOP  |
// |============================|

public class Main_1_8 {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		// Loops can execute a block of code as long as a specified condition is reached.

		while(true) { // Placing true here will continuously loop your program until a break statement is reached
					  // If no break statement is placed within the loop, you will create an endless loop (which could crash, run infinitely, etc.)
					  // It's ALWAYS recommended to place at least one break statement
			
			if (count == 5) {
				break;
			} else {
				System.out.println(count);
				count++;
			}
		}
		
		count = 0;
		System.out.print("\n");
		
		// You can simplify the first while loop with this one:
		while(count < 5) {
			System.out.println(count);
			count++;
		}
		
		
		
		///////////////////
		// DO WHILE LOOP //
		///////////////////
	
		// A do while loop will execute the code block once BEFORE checking if the condition is true. It will ONLY repeat the loop as long as
		// the condition is true
		
		count = 0;
		System.out.println("\n");
		
		do {
			System.out.println("You will only see this statement twice");
			count++;
		}
		while (count < 2);
	}

}
