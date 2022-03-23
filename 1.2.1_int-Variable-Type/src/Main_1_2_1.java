
// |=======================|
// |   INT VARIABLE TYPE   |
// |=======================|

public class Main_1_2_1 {

	public static void main(String[] args) {
		
		// This will assign one value to multiple variables
		// int declares w, x, y, and z. They have no initializations
		
		int w, x, y, z;
		x = y = z = 3;
		
		// By appending continuous equals signs, you are making z = 3
		// y = z, and since z has a value, that makes y = 3
		// x = y | y = z | z = 3. Which means x = 3
		
		// System.out.println(w);   |  Without initialization, this line will output an error
		System.out.println("Value of z: " + z);
		
		// Lets change the value of z
		z = 5;
		System.out.println("Value of x: " + x);
		
		// You'll notice that x still evaluates to 3. Looking back on Line 10, x = z which was equal to 3. Therefore making x = 3
		// The program finished processing that line, and moves towards the next
		// The variable x will not change when the value of z does, since it processes LATER in the program (AFTER x = y = z = 3)

	}
}
