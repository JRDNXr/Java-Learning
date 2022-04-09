
// |===============|
// |   RECURSION   |
// |===============|

public class Main_2_5 {

	static int recursionAdd(int j) {
	
		if (j <= 10) {
			return j + (recursionAdd(j + 1));
		} else {
			return 0;
		}
	}
	
	/*
	 * Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems
	 * down into simple problems which are easier to solve.
	 */
	
	static void factorial() {
		
		
	}
	
	public static void main(String[] args) {
		
		int recursionResult = recursionAdd(5);
		
		System.out.println(recursionResult);
		
		
		// Here is another example. Let's say we want to calculate 5! (five factorial. This means we want 1 x 2 x 3 x 4 x 5. The sum of this equation
		// is 120
		
		int sum = 0; 
				
		for (int countI = 1; countI <= 5; countI++) {
			
			sum = countI * (countI + 1);
			//System.out.println(sum);
		}
	}
		
}
