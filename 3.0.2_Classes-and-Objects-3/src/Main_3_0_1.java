
// |===========================|
// |   CLASSES AND OBJECTS 3   |
// |===========================|

public class Main_3_0_1 {

	public static void main(String[] args) {
		
		// Below is an example of how objects and classes work
		
		// Creating objects. Notice how the objects "inherit" all of the "Vehicle.java" class variables
		// These "cars" inherited the attributes "company", "colour', and "value"
		Vehicle JRDN_Car = new Vehicle();
		Vehicle Thiya_Car = new Vehicle();
		
		// Initializing values for these attributes 
		JRDN_Car.company = "Audi";
		JRDN_Car.colour = "Lime Green";
		JRDN_Car.value = 500000;
		
		Thiya_Car.company = "Mercedes-Benz";
		Thiya_Car.colour = "Silver";
		Thiya_Car.value = 750000;
		
		System.out.println("JRDN's Car: " + JRDN_Car.company);
		System.out.println("\t    " + JRDN_Car.colour);
		System.out.println("\t    $" + JRDN_Car.value);
		
		System.out.print("\n");
		
		System.out.println("Thiya's Car: " + Thiya_Car.company);
		System.out.println("\t     " + Thiya_Car.colour);
		System.out.println("\t     $" + Thiya_Car.value);
		
	}
}
