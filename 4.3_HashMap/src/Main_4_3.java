
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
			same type, like: String keys and String values:
		*/
		
		// The syntax here is almost the same as ArrayList and LinkedList:
		HashMap<String, String> capitals = new HashMap<String, String>();
		

		// To add values, we use the put() method.
		capitals.put("Canada", "Ottawa");
		capitals.put("U.S.A.", "Washington");
		capitals.put("Mexico", "Mexico City");
		
		System.out.println(capitals);
	}

}
