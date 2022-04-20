
// |=======================|
// |   INT VARIABLE TYPE   |
// |=======================|

public class Main_1_2_1 {

	public static void main(String[] args) {
		
		// This will assign one value to multiple variables
		// int declares w, x, y, and z. They have no initializations
		
		// Integer; <-- You can declare variables using this initializer as well. More information in 1.2.2_Data-Types.
		int w, x, y, z;
		x = y = z = 3;
		
		// By appending continuous equals signs, you are making z = 3
		// y = z, and since z has a value, that makes y = 3
		// x = y | y = z | z = 3. Which means x = 3
		
		// System.out.println(w);   |  Without initialization, this line will output an error
		System.out.println("Value of z: " + z); // Output: Value of z: 3
		
		// Lets change the value of z
		z = 5;
		System.out.println("Value of x: " + x); // Output: Value of x: 3
		
		// You'll notice that x still evaluates to 3. Looking back on Line 10, x = z which was equal to 3. Therefore making x = 3
		// The program finished processing that line, and moves towards the next
		// The variable x will not change when the value of z does, since it processes LATER in the program (AFTER x = y = z = 3)

		
		// You can also add 0's to the beginning of numbers. This has no effect, and Java will treat the numbers as if there were no 0's in front of them.
		// You'll notice that even when the numbers are printed, they are displayed with no 0's.
		int num = 01, num2 = 002;
		
		System.out.println(num2); // Output: 2
	}
}
