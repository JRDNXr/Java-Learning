
// |=========================|
// |   DATE AND TIME CLASS   |
// |=========================|

import java.time.LocalDate; // Date class (default: year, month, day [yyyy-MM-dd])
import java.time.LocalTime; // Time class (default: hour, minute, second, and nanosecond [HH-mm-ss-ns])
import java.time.LocalDateTime; // Date and Time class combined (default: year, month, day, hour, minute, second, and nanosecond 
								// [yyyy-MM-dd-HH-mm-ss-ns])
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
		
		// DateTimeFormatter defaultDate = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		// System.out.println(currentDateTime.format(defaultDate)); <-- You can also do the above in just 2 lines of text.
		
		
		// Customizing Date and Time (Wednesday, March 23, 2022)
		DateTimeFormatter formatter_fullDate = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
		String fullDate = currentDateTime.format(formatter_fullDate);
		System.out.println(fullDate); // Output: [day of the week, month dayNumber, year] 
		
		
		// Customizing Date and Time (Wednesday, March 23, 2022 at 12:00)
		DateTimeFormatter formatter_hourMin = DateTimeFormatter.ofPattern("H:mm a");
		String time = currentDateTime.format(formatter_hourMin);
		System.out.println(fullDate + " at " + time); // Output: [day of the week, month dayNumber, year] at [current time] [a.m. / p.m.]
	}
}

