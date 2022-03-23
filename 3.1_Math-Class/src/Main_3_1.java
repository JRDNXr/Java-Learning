
// |================|
// |   MATH CLASS   |
// |================|

public class Main_3_1 {
	
	public static void main(String[] args) {
		
		// Find the highest value of two numbers
		int highNum = Math.max(10, 100);
		
		// Find the lowest value of two numbers
		int lowNum = Math.min(40, 80);
		
		// Get the square root of a number (remember that it must be a double since square root could return decimals)
		double sqRoot = Math.sqrt(25);
		
		// Get the absolute value (positive version) of a number
		int absolute = Math.abs(-30);
		
		// Get a random number
		// Math.random will generate any random number (including decimals)
		// To gain control, you can append it with "* [number]". Whatever number you choose, it will be <[number] meaning not inclusive of that number.
		// Essentially, it means the generator will choose a number randomly between 0 (inclusive) and [number] exclusive
		int randomNum = (int)(Math.random() * 11);
		
		System.out.println("Which is higher, 10 or 100?: " + highNum);
		System.out.println("Which is lower, 40 or 80?: " + lowNum);	
		System.out.printf("The Square Root of 25 is " + "%.0f", sqRoot);
		System.out.print("\n");
		System.out.println("The postive version of \"-30\" is: " + absolute);
		System.out.println("Random number between 0 - 10 (inclusive): " + Math.random());
		
		
		
	}

}
