
// |===========================|
// |   TOSTRING AND PARSEINT   |
// |===========================|

public class Main_2_6_7 {
	
	public static void main(String[] args) {
		
		// int num = 5  <-- Primitive types won't work with the toString method.
		// 				You must use a non-primitive type, such as Integer:
		Integer num = 5;
		
		String numberAsText = "BLANK";
		
		numberAsText = num.toString();
		
		System.out.println(numberAsText); // Output: 5
		
		
		
		// REVERSE - Convert a String back into an integer
		
		int num2 = 10;
		// Integer num2; <-- BOTH int and Integer will work here. This is because we are using the Wrapper Class "Integer" in the method
		// 				 parseInt(). Java automatically does the work for us.
		
		num2 = Integer.parseInt(numberAsText);
		
		System.out.println(num2);
	}

}
