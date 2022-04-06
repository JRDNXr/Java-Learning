
// |===========================|
// |   CLASSES AND OBJECTS 2   |
// |===========================|

public class Main_3_0_1 {
	
	public static void main(String[] args) {
		
		EmployeeData empData = new EmployeeData();
		
		System.out.println(empData.firstName);
		System.out.println(empData.lastName);
		System.out.println(empData.empNumber);

		
		// We can override data from another class too
		int newEmpNum = 9999;
		
		empData.empNumber = newEmpNum;
		
		System.out.print("\n");		
		System.out.println("New Employee Number: " + empData.empNumber);
		
		// Talk about overriding data and 
	}

}
