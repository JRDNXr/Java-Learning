
// |=======================================================|
// |   JAVA MODIFIERS (PUBLIC, PRIVATE, FINAL, AND MORE)   |
// |=======================================================|

public class Main_3_2 {
	
	public static void main(String[] args) {
		
		// There are 2 types of Java Modifiers:
		// 		- Access Modifiers		-	Controls the access level
		//		- Non-Access Modifiers	-	Does not control the access level, but controls other functionality
		
		// ACCESS MODIFIERS. These are used ONLY in class names:
		//		- public		-	The class is accessible by any other class
		//		- default		-	The class is ONLY accessible by classes within the same package. Used for when you don't specify a modifier
		
		// ACCESS MODIFIERS. These are used for attributes (variable declaration), methods, and constructors names:
		//		- public		-	Code is accessible for all classes
		// 		- private		-	Code is ONLY accessible within the declared class
		//		- default		-	Code is ONLY accessible within the same package. Used when you don't specify a modifier
		//		- protected 	-	Code is ONLY accessible in the same package and subclasses
		
		// NON-ACCESS MODIFIERS. These are used ONLY in class names:
		// 		- final			-	The class cannot be inherited by other classes
		//		- abstract		-	The class cannot be used to create objects
		
		// NON-ACCESS MODIFIERS. These are used for attributes and method names:
		//		- final			-	Attributes and methods cannot be overridden / modified
		//		- static		-	Attributes and methods belong to a class, rather than an object
		//		- abstract		-	Can only be used in an abstract class and only in methods. The method does not have a body. The body is inherited from a subclass
		//		- transient		-	Attributes and methods are skipped when serializing the object containing them
		//		- synchronized	-	Methods can ONLY be accessed by one thread at a time
		//		- volatile		-	Value of an attribute is not cached thread-locally. Instead, it is always read from the "main memory"
	}

}
