
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
	
	public static void main(String[] args) {
		
		int recursionResult = recursionAdd(5);
		
		System.out.println(recursionResult);
	}
		
}
