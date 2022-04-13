
// |=========================|
// |   DATE AND TIME CLASS   |
// |=========================|

import java.time.LocalDate; // Date class
import java.time.LocalTime; // Time class
import java.time.LocalDateTime; // Date and Time class combined
import java.time.format.DateTimeFormatter; // Date and Time formatter

public class Main_5_2 {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); // Output: [current date in yyyy-mm-dd]
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime); // Output: [current time in hh:mm:ss:mmmmmm]
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime); // Output: [current date in yyyy-mm-ddThh:mm:ss:mmmmmm]
		
		// Customizing Date and Time (03-23-2022 12:00:00)
		DateTimeFormatter defaultDate = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		String newFormattedCurrentDateTime = currentDateTime.format(defaultDate);
		System.out.println(newFormattedCurrentDateTime); // Output: [current date] [current time]
		
		
		// Customizing Date and Time (Wednesday, March 23, 2022)
		DateTimeFormatter formatter_fullDate = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
		String fullDate = currentDateTime.format(formatter_fullDate);
		System.out.println(fullDate); // Output: [day of the week, month dayNumber, year] 
		
		
		// Customizing Date and Time (
		DateTimeFormatter formatter_hourMin = DateTimeFormatter.ofPattern("h:mm");
		String time = currentDateTime.format(formatter_hourMin);
		System.out.println(fullDate + " at " + time); // Output: [day of the week, month dayNumber, year] at [current time]
	}
}

