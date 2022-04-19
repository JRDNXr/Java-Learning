
// |==============|
// |   HASHMAPS   |
// |==============|

// Import HashMap
import java.util.HashMap;
import java.util.LinkedList;

public class Main_4_3 {
	
	public static void main(String[] args) {
		
		/*
			A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

			One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the
			same type, like: String keys and String values.
		*/
		
		// The first "String" is known as the key (index is another word, too). The second "String" is known as the value.
		// The syntax here is almost the same as ArrayList and LinkedList:
		HashMap<String, String> capitals = new HashMap<String, String>();
		

		// To add values, we use the put() method.
		capitals.put("Canada", "Ottawa");
		capitals.put("U.S.A.", "Washington");
		capitals.put("Mexico", "Mexico City");
		
		System.out.println(capitals); // Output: {Canada=Ottawa, Mexico=Mexico City, U.S.A.=Washington}
		
		
		// To access a value, use the get() method and call the "key".
		System.out.println(capitals.get("Canada")); // Output: Ottawa
		System.out.print("\n");
		
		
		// To get the size of a HashMap, use the size() method.
		System.out.println(capitals.size()); // Output: 3
		System.out.print("\n");
		
		
		// To loop through a HashMap, we can use both a for-loop and a for-each loop.
		// ** NOTE ** We must use the keySet() method to print out keys, and the and values() method to print out values.
		for (String outputHashMap_capitals_countries : capitals.keySet()) {
			System.out.println(outputHashMap_capitals_countries);
			
			// Output: Canada
			//		   Mexico
			//		   U.S.A.
		}
		System.out.print("\n");
		
		// Here is the values() method within a for-each loop in action:
		for (String outputHashMap_capitals_capital : capitals.values()) {
			System.out.println(outputHashMap_capitals_capital);
			
			// Output: Ottawa
			//		   Mexico City
			//		   Washington
		}
		System.out.print("\n");
		
		
		
		// In case you wish to print them both, there is a solution to that as well:
		for (String outputHashMap : capitals.keySet()) {
			System.out.println("Key: " + outputHashMap + "  |  Value: " + capitals.get(outputHashMap));
			
			// Output: Key: Canada  |  Value: Ottawa
			//		   Key: Mexico  |  Value: Mexico City
			//		   Key: U.S.A.  |  Value: Washington
		}
		System.out.print("\n");
		
		
		// To remove a value, use the remove() method.
		capitals.remove("Mexico");
		
		System.out.println(capitals.get("Mexico")); // Output: null
		System.out.print("\n");
		
		
		// To clear all values, use the clear() method.
		capitals.clear();
		
		
		//////////////////////////
		//   OTHER DATA TYPES   //
		//////////////////////////
		
		// To create another data type, just specify the type within the carrot symbols (< >).
		// Below we created a HashMap with an Integer data type:
		// ** NOTE ** Remember, we use Integer, NOT int for HashMap.
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		
		// Below are all the other data types that you can have with a HashMap.
		HashMap<Byte, Byte> btye = new HashMap<Byte, Byte>();
		
		HashMap<Short, Short> shrot = new HashMap<Short, Short>();
		
		HashMap<Long, Long> lnog = new HashMap<Long, Long>();
		
		HashMap<Float, Float> flaot = new HashMap<Float, Float>();
		
		HashMap<Double, Double> duoble = new HashMap<Double, Double>();
		
		HashMap<Boolean, Boolean> Boolaen = new HashMap<Boolean, Boolean>();
		
	}

}
