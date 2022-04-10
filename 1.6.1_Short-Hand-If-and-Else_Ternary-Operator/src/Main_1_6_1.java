
// |===============================================|
// |   SHORT HAND IF AND ELSE (TERNARY OPERATOR)   |
// |===============================================|

public class Main_1_6_1 {
	
	public static void main(String[] args) {
		
		// Short-hand if and else statements (or sometimes known as Ternary Operators) are used to replace simple if and else statements 
		// Below is an example of a simple if and else statement
		
		int time = 20;
		
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening."); // Output: Good evening.
		}

		// We can modify this into a Ternary Operator
		
		String result = (time < 18) ? "Good day." : "Good evening.";
		
		// Let's break this down:
		//
		// (time < 18)	-	This checks the condition of whether the time is below 18
		// ?			-	Tells the compiler that it is validating a conditional statement
		// [condition 1] : [condition 2]	-	On the left is condition 1, and on the right is condition 2. The colon is used to separate the
		// 										conditions
		
		System.out.println(result); // Output: Good evening.
		
	}

}
