
public class Main_2_0 {
	
	// A method is a block of code which only runs when it is called 
	
	// You can pass data through a method. These are called parameters
	
	// Methods are also known as functions
	
	// Methods are used to reuse code. Write once, reuse multiple times

	// For now, ignore static and void. You will learn those later on.
	
	static void saySomething() {
		System.out.println("Hello, World!.. from a Method!");
	}
	
	static void anotherStatement() {
		System.out.println("This is a test");
	}
	
	public static void main(String[] args) {
	
		saySomething(); // You can call a method like this. Don't forget the parentheses ()
		
		// You can also call a method multiple times
		
		anotherStatement();
		anotherStatement();
	}
}
