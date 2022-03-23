
// |=========================|
// |   DATE AND TIME CLASS   |
// |=========================|

import java.time.LocalDate; // Date class
import java.time.LocalTime; // Time class
import java.time.LocalDateTime; // Date and Time class combined
import java.time.format.DateTimeFormatter; // Date and Time formatter

public class Main_4_2 {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); // Output: [current date in yyyy-mm-dd]
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime); // Output: [current time in hh:mm:ss:mmmmmm]
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime); // Output: [current date in yyyy-mm-ddThh:mm:ss:mmmmmm]
		
		DateTimeFormatter defaultDateTimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String newFormattedCurrentDateTime = currentDateTime.format(defaultDateTimeFormat);

		System.out.println(newFormattedCurrentDateTime); // Output: [current date in ] [current time]
	}
}

