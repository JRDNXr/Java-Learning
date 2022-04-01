
// |======================================================|
// |   MULTIDIMENSIONAL ARRAYS / TWO-DIMENSIONAL ARRAYS   |
// |======================================================|

public class Main_1_10_1 {
	
	public static void main(String[] args) {
		
		// A multidimensional array is an array of arrays.

		// Multidimensional arrays are also known as Two-Dimensional arrays
		
		String[][] teams = { {"Red", "Green", "Blue"}, {"3", "5", "4"} };
		
		// Element Number:	    0       1        2       0    1    2
		// Array Number:			    0					  1
		
		// Red, Green, and Blue are a part of teams array 1
		// 3, 5, and 4 are a part of teams array 2
		
		// In array 1, we have named 3 different teams. In array 2, we have the number of people on that team
		// Red has 3 team members, Green has 5 team members, and Blue has 4 team members
		
		// We want to see how many people are on the red team. We can do it like so:
		
		System.out.println(teams[1][0]); // Output: 3
		
		// In the first [ ], you enter the Array Number
		// In the second [ ], you enter the element within that array
		
		// To get the Team Colour and the number of people on that specific team, we do the following:
		
		// We want the Green Team and the number of people on that team
		System.out.println(teams[0][1] + ": " + teams[1][1]); // Output: Green: 5
		
		// We can also find out the length of a multidimensional array.
		// Keep in mind that this length refers to the "Array Number" of a multidimensional array
		System.out.println(teams.length); // Output: 2
		
		// We can also iterate (go through)
		
//		for (int countI = 0; countI < teams.length; countI++) {
//			for (int countJ = 0; countJ < teams.length; countJ++) {
//				
//			}
//		}
		
	}

}
