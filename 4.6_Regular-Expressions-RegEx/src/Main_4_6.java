
// |=================================|
// |   REGULAR EXPRESSIONS (REGEX)   |
// |=================================|

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_4_6 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("jrdn", Pattern.LITERAL);
	    //Matcher matcher = pattern.matcher("This guide was created by!");
		Matcher matcher = pattern.matcher("This guide was created by jrdn!");
	    
	    boolean matchFound = matcher.find();
	    
	    if (matchFound) {
	      System.out.println("Match found");
	      
	    } else {
	      System.out.println("Match not found");
	    }
	}
}
