
// |===========================|
// |   CLASSES AND OBJECTS 2   |
// |===========================|

public class Main_3_0_1 {
	
	public static void main(String[] args) {
		
		// Employee Data Example
		EmployeeData empData = new EmployeeData();
		
		System.out.println(empData.firstName); // Output: JRDN
		System.out.println(empData.lastName); // Output: DSouza
		System.out.println(empData.empNumber); // Output: 4567

		
		// We can modify and override an attribute value from another class
		
		// Below demonstrates overriding an attribute value from another class
		int newEmpNum = 9999;
		
		empData.empNumber = newEmpNum;
		
		System.out.print("\n");		
		System.out.println("New Employee Number: " + empData.empNumber); // Output: New Employee Number: 9999
		
		
		
		// Recall this important detail:
		// When the individual objects are created, they inherit all the variables and methods from the class.
		
		
		// Remember that we can create multiple objects of the same class
		EmployeeData2 object1 = new EmployeeData2();
		EmployeeData2 object2 = new EmployeeData2();
		
		// When the objects above are created, they "inherit" all of the variables and methods at that time.
		// So when we modify or override an attribute value, it ONLY affects that particular object.
		// This is why the attribute "systemRole" can have two different values.
		
		object1.systemRole = "Junior Programmer";
		object2.systemRole = "Senior Programmer";
		
		System.out.println("Object 2: " + object2.systemRole); // Output: Object 2: Senior Programmer
		System.out.println("Object 1: " + object1.systemRole); // Output: Object 1: Junior Programmer
		
		// The above code has been reversed in order to remove the idea of systematic compiling.

	}

}
