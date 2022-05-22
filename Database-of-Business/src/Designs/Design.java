package Designs;

public class Design {
	
	public int printNewLines(int numberOfLines) {
		final String NEWLINE = "\n";
		
		for (int count = 0; count <= numberOfLines; count++) {
			System.out.print(NEWLINE);
		}
		
		return 0;
	}
}
