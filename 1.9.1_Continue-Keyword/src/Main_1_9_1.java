
// |======================|
// |   CONTINUE KEYWORD   |
// |======================|

public class Main_1_9_1 {
	
	public static void main(String[] args) {
		
		// The continue statement breaks one (skips) iteration in a loop, but allows it to continue
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 4) { // When i hits 4, it comes here
				System.out.print("\n");
				continue; // This acts like a break statement. The if statement executes its scope code, hits continue, which
						  // ignores everything else beneath i (just like break) and goes back into the for loop
			}
			
			System.out.println(i);
		}
		
	}

}
