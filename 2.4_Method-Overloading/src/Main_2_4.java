
// |========================|
// |   METHOD OVERLOADING   |
// |========================|

public class Main_2_4 {

//	static int plusMethodInt(int x, int y) {
//		return x + y;
//	}
//
//	static double plusMethodDouble(double x, double y) {
//		return x + y;
//	}
//
//	public static void main(String[] args) {
//		int myNum1 = plusMethodInt(8, 5);
//		double myNum2 = plusMethodDouble(4.3, 6.26);
//		
//		System.out.println("int: " + myNum1);
//		System.out.println("double: " + myNum2);
//	}
	
	// Above we created 2 methods that add different integer types
	
	// Below is the exact same thing, except with a new technique called "Method Overloading"
	
	static int addNumbers(int x, int y) {
		return x + y;
	}

	static double addNumbers(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int myNum1 = addNumbers(8, 5);
		double myNum2 = addNumbers(4.3, 6.26);
		
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}
	
	// We are overloading the addNumbers method. Notice how both methods have the same method name
	// The difference here is the preceding Data Type (int and double)
	// Rather than creating two different methods that do the same thing, we can Overload them
	
}
