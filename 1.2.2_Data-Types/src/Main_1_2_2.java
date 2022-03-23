
// |================|
// |   DATA TYPES   |
// |================|

public class Main_1_2_2 {
	
	public static void main(String[] args) {
		
		// The following are primitive data types
		
		// byte = 1 byte
		// Stores whole numbers from -128 to 127
		byte b = 1;
		
		// short = 2 bytes
		// Stores whole numbers from -32,768 to 32,767
		short s = 10;
		
		// int = 4 bytes
		// Stores whole numbers from -2,147,483,648 to 2,147,483,647
		int i = 1932;
		
		// long = 8 bytes
		// Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		// * NOTE: Remember to append the number with an "L". Upper case and lower case both work, however, its best practice to use upper case
		long l = 9223372036854775807L;
		
		// float = 4 bytes
		// Stores fractional (decimal) numbers. Stores between 6 and 7 decimal digits
		// * NOTE: Remember to append the number with an "f". Upper case and lower case both work, however, its best practice to use lower case
		float f = 21450.1f;
		
		// double = 8 bytes
		// Stores fractional (decimal) numbers. Stores up to 15 decimal digits
		// * NOTE: Remember to append the number with a "d". Upper case and lower case both work, however, its best practice to use lower case
		double d = 585.03592d;
		
		// boolean = 1 byte
		boolean boo = false;
		
		// You can use boolean statements in variables and console output
		int x = 10, y = 20;
		boolean result = x > y;
		
		System.out.println("Is x greater than y?: " + result);
		System.out.println(10 > 9);
		System.out.print("Is x equal to 10?: ");
		System.out.println(x == 10); // Check out "1.5_Operators" for more. You can use a whole bunch with Boolean
		
		// char = 2 bytes
		// Stores a single character, letter, or ASCII value
		char c = 74;
		
		System.out.println("ASCII Value 74 is: " + c);
		
		
		
		///////////////
		// EXPONENTS //
		///////////////
		
		// You can place an upper case or lower case e to add an exponent
		float fl1 = 35e8f;
		double do1 = 35E8d;
		
		System.out.println("Float 1: " + fl1);
		System.out.println("Double 1: " + do1);
		
		
		
		///////////////////
		// DECIMAL SPOTS //
		///////////////////
		
		float f1 = 100f / 6.0f; // 16.66666667. Rounds up to 16
		double d1 = 100.00 / 3.00; // 33.333333. Rounds down to 33  |  Using .00 to force the answer to be a decimal. Otherwise, without
								   //								   appending a "d" or ".00", you will end up with an integer answer
		
		System.out.printf("Float 2: " + "%.5f", f1);
		System.out.println("");
		System.out.print("Double 2: ");
		System.out.printf("%.0f", d1);
		
		// We can use %.2f to indicate how many decimal points we want the output to have. The 2 represents the number of decimal spots. f is always
		// there
		// * NOTE: You can also enter 0 to have no decimal spots. This will round the number up or down
		
		
		
		///////////////////////////////////////////////////////////
		// INFORMATION ON PRIMITIVE AND NON-PRIMITIVE DATA TYPES //
		///////////////////////////////////////////////////////////
		
		/*
		  
		  Non-primitive data types are called reference types because they refer to objects.

		  The main difference between primitive and non-primitive data types are:
    	    - Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
    		- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
    		- A primitive type always has a value, while non-primitive types can be null.
    		- A primitive type starts with a lower case letter, while non-primitive types starts with an upper case letter.
    		- The size of a primitive type depends on the data type, while non-primitive types have all the same size.

		  Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.

		 */
	}

}
