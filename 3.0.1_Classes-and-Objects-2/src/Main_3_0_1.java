
// |===========================|
// |   CLASSES AND OBJECTS 2   |
// |===========================|

public class Main_3_0_1 {
	
	public static void main(String[] args) {
		
		// Employee Data Example
		EmployeeData empData = new EmployeeData();
		
		System.out.println(empData.firstName);
		System.out.println(empData.lastName);
		System.out.println(empData.empNumber);

		
		// We can modify and override an attribute value from another class
		// Below demonstrates overriding an attribute value from another class
		int newEmpNum = 9999;
		
		empData.empNumber = newEmpNum;
		
		System.out.print("\n");		
		System.out.println("New Employee Number: " + empData.empNumber);
		

	}

}
