import java.lang.reflect.Method;

// |=============================|
// |   INNER AND OUTER CLASSES   |
// |=============================|

// The following is a demonstration of inner and outer classes. We can "nest" classes within classes.
// Remember that this code would normally be in their own separate Java Files.
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
}

// You can make inner classes private, protected, or static (among others).
// ** NOTE ** This is NOT the same thing as making a method private, protected, or static.
// ** NOTE ** Just like static attributes and methods, a static inner class does not have access to members of the outer class.

public class Main_3_7 {
	
	public static void main(String[] args) {
		
		OuterClass outerObject = new OuterClass();
		
		// This is how we create an object for an inner class.
		OuterClass.InnerClass outerInnerObject = outerObject.new InnerClass(); 
		
		System.out.println(outerObject.x); // Output: 10
		System.out.println(outerInnerObject.y); // Output: 5
		
		
		// This is the same approach, but with the code in a different Java File.
		OuterClass2 outerObject2 = new OuterClass2();
		OuterClass2.InnerClass2 outerInnerObject2 = outerObject2.new InnerClass2();
		
		System.out.println(outerObject2.a); // Output: 99
		System.out.println(outerInnerObject2.b); // Output: 100
		
		
		// Read OuterClass2.java file for more information on the below code snippet.
		// outerObject2.printSomething(); <-- This works too!
		outerInnerObject2.inheritExample(); // Output: Printed
	}
}
