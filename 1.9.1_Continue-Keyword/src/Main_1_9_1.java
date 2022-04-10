
// |======================|
// |   CONTINUE KEYWORD   |
// |======================|

public class Main_1_9_1 {
	
	public static void main(String[] args) {
		
		// The continue statement breaks one (skips) iteration in a loop, but allows it to continue
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 4) { // When i hits 4, it comes here
				System.out.print("\n");
				
				// Output: 0
				//		   1
				//		   2
				//		   3
				//
				//		   5
				//		   6
				//		   7
				//		   8
				//		   9
	
				continue; // This acts like a break statement. The if statement executes its scope code, hits continue, which
						  // ignores everything else beneath it (just like break) and goes back into the for loop
			}
			
			// Remember, continue and break are ONLY for loops. If and else is NOT a loop. The keywords here are breaking out of the for loop
			// (if there's no loop, the program exits)
			System.out.println(i);
		}
		
	}

}
