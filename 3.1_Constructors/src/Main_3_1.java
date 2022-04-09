
// |==================|
// |   CONSTRUCTORS   |
// |==================|

public class Main_3_1 {
	
	int num; // We declare a int named num here
	
	public Main_3_1() {
		num = 5; // Here we initialize the int named num to 5
	}

	public static void main(String[] args) {
		
		// A constructor in Java is a special method that is used to initialize objects.
		
		Main_3_1 object1 = new Main_3_1();
		
		// Constructors are called just like objects are.
		// Remember that when an object is created, it "inherits" all of the attribute values.
		
		System.out.println(object1.num);
		
		// ** NOTES **
		//		1. Constructors must match the class name
		// 		2. Constructors cannot have a void keyword

		// We can also pass parameters, like below:
		
		Part2 object2 = new Part2("JRDN", "DSouza", 3456);
		System.out.println(object2.fName + " " + object2.lName + " " + object2.empNum);
		
	}
}
