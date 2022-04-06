
// |===============|
// |   RECURSION   |
// |===============|

public class Main_2_4 {

	static int recursionAdd(int j) {
	
		if (j <= 10) {
			return j + (recursionAdd(j + 1));
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		int recursionResult = recursionAdd(5);
		
		System.out.println(recursionResult);
	}
		
}
