
// |====================|
// |   RETURN KEYWORD   |
// |====================|

public class Main_2_2 {

	static int addNumbers(int num1, int num2) {
		return num1 + num2;
		
		// The return keyword "returns" or "sends back" a value after the method is done computing
	}
	
	public static void main(String[] args) {
		
		System.out.println(addNumbers(5, 6)); // Output [1]: 11
		
		// It's better to use variables as arguments rather than hard coding values (when large scale projects come into play, it will
		// be easier to navigate and debug code)
		
		// It's also recommended to store the value of a return in a variable rather than printing it to the console (shown above)
		
		int sum = addNumbers(1, 2); // A neat way to initialize a variable as an argument for a method
		
		System.out.println(sum); // Output [2]: 3
		
		// * NOTE: Notice how we are reusing code here (using the addNumbers method to add 2 pairs of numbers on different lines).
		// This is how large scale projects work as well
	}
	

}
