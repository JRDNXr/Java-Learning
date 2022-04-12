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


public class Main_3_6 {
	int g = 50;

	private int print() {
		return g;
	}
	
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
		
		Main_3_6 exampleObject = new Main_3_6();
		System.out.println(exampleObject.print());
	}
}
