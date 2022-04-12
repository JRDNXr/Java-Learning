
public class OuterClass2 {
	int a = 99;
	
	public void printSomething() {
		System.out.println("Printed");
	}
	
	class InnerClass2 {
		int b = 100;
		
		// You may be wondering how an inner class can access the attribute "a" from "OuterClass2". Turns out that this is an advantage to
		// nesting classes.
		// Our advantage is that inner classes "inherit" all of the attributes and methods of the outer class.
		// You can think of this as if there was an "extends" keyword near the class name.
		// Eg. class InnerClass2 extends OuterClass2
		// This would inherit everything the attributes and methods from the outer class. However, this is done by default, so including extends
		// would be redundant.
		
		// Here we do the above for an attribute.
		public int innerMethod() {
			return a;
		}
		
		
		// Here we do the above for a method.
		public void inheritExample() {
			printSomething();
		}
	}

}
