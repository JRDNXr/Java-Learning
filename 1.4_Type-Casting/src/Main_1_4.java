
// |==================|
// |   TYPE CASTING   |
// |==================|

public class Main_1_4 {
	
	public static void main(String[] args) {
		
		/* 
		   Widening Casting (automatically) - converting a smaller type to a larger size type
				
				byte -> short -> char -> int -> long -> float -> double
			
		   Narrowing Casting (manually) - converting a larger type to a smaller size type
				
				double -> float -> long -> int -> char -> short -> byte 
		*/
		
		//////////////////////
		// WIDENING CASTING //
		//////////////////////
		
		int num1 = 9;
		
		double num1_double = num1; // Wide casting (up size) is done automatically
		System.out.println("Int 1: " + num1); // Output: Int 1: 9
		System.out.println("Double 1: " + num1_double); // Output: Duoble 1: 9.0
		
		
		///////////////////////
		// NARROWING CASTING //
		///////////////////////
		
		double num2 = 9.78d;
		
		int num2_int = (int) num2; // We must manually narrow cast (down size) the double value into an int value
		System.out.println("Double 2: " + num2); // Output: Double 2: 9.78
		System.out.println("Int 2: " + num2_int); // Output: Int 2: 9
		
	}

}
