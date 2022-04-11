
// |=============================|
// |   INNER AND OUTER CLASSES   |
// |=============================|

class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
}

public class Main_3_6 {

	public static void main(String[] args) {
		
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass outerInnerObject = outerObject.new InnerClass();
		
		System.out.println(outerObject.x); // Output: 10
		System.out.println(outerInnerObject.y); // Output: 5
		
	}
}
