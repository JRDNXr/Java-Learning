// |========================================|
// |   SWITCH STATEMENTS AND BREAK KEYWORD  |
// |========================================|

public class Main_1_7 {
	
	public static void main(String[] args) {
		
		int day = 5; // Try changing this number to something else
		
		// This switch statement has no "break" statements (more below)
		// Because of this, when the switch finds a case for your number, it will continue executing every code block beneath that number
		// If it does not find your number, the entire switch statement is ignored
		// You can create a condition ONLY in the switch(expression) line
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
			
		case 4:
			System.out.println("Thursday");
			
		case 5:
			System.out.println("Friday");
			
		case 6:
			System.out.println("Saturday");
			
		case 7:
			System.out.println("Sunday");
		}
		
		System.out.print("\n");
		
		
		// This switch statement has break statements in it
		// Break statements break away from the code block once it is done executing. You place a break statement at the end of a code block
		// Placing it before the code block is finished will result in an error
		//
		// Now when you enter a number, it will choose ONLY 1 case below and ignore the rest
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
		
		default: // This creates a way to "error trap" your program. More on that in 
			System.out.println("Not a valid number");
		}
		
		// Default specifies code to run if there is no match in any case statement
		
	}

}
