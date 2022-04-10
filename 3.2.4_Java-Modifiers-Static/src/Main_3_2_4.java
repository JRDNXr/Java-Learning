
// |============================|
// |   JAVA MODIFIERS - STATIC  |
// |============================|

public class Main_3_2_4 {

	// When making a class attribute static, it can be accessed anywhere within the class.
	static String name = "JRDN";
	
	static int addNumbers(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		// This calls a static class attribute.
		System.out.println(name); // Output: JRDN
		
		// This calls a static method. Notice how it does not require an object to be created.
		addNumbers(5, 6);
		
		// This calls a static method from another class. Again, you do not need to create an object. You can simply call the method
		// by typing in the class name followed by a period and finally the method name. Don't forget the parenthesis! [ () ]
		Employee.printName(); // Output: JRDN D'Souza
	}
	
}
