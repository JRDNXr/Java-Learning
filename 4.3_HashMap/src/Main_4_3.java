
// |==============|
// |   HASHMAPS   |
// |==============|

// Import HashMap
import java.util.HashMap;

public class Main_4_3 {
	
	public static void main(String[] args) {
		
		/*
			A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

			One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the
			same type, like: String keys and String values.
		*/
		
		// The first "String" is known as the index (key is another word, too). The second "String" is known as the value.
		// The syntax here is almost the same as ArrayList and LinkedList:
		HashMap<String, String> capitals = new HashMap<String, String>();
		

		// To add values, we use the put() method.
		capitals.put("Canada", "Ottawa");
		capitals.put("U.S.A.", "Washington");
		capitals.put("Mexico", "Mexico City");
		
		System.out.println(capitals);
		
		
		// To access a value, use the get() method and call the "index".
		System.out.println(capitals.get("Canada")); // Output: Ottawa
		System.out.print("\n");
		
		// To remove a value, use the rmeove() method.
		capitals.remove("Mexico");
		
		System.out.println(capitals.get("Mexico")); // Output: null
		System.out.print("\n");
		
		
		// To get the size of a HashMap, use the size() method.
		System.out.println(capitals.size()); // Output: 
		
		// To clear all values, use the clear() method.
		capitals.clear();
		
	}

}
