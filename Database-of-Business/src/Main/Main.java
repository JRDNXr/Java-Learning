package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.time.LocalDateTime;

import Designs.Design;

public class Main {
	
	public static void main(String[] args) {
		
		int userChoice = -1;
		
		Scanner userInput = new Scanner(System.in);
		
		Design objectDesign = new Design();
		Menus objectMenu = new Menus();
		
		
		while(true) {
			objectMenu.printMainMenu();
			objectDesign.printNewLines(1);
			objectMenu.printUserChoice();
			
			userChoice = userInput.nextInt();
			
			switch(userChoice) {
			case 0:
				objectMenu.printQuitMenu();
				break;
				
			case 1:
				objectDesign.printNewLines(6);
				objectMenu.printCreateNewEntryMenu();
				objectDesign.printNewLines(1);
				objectMenu.printUserChoice();
				
				userChoice = userInput.nextInt();
			
			case 2:
				objectDesign.printNewLines(6);
				objectMenu.printCheckDataMenu();
				objectDesign.printNewLines(1);
				objectMenu.printUserChoice();
				
				userChoice = userInput.nextInt();
					
				switch(userChoice) {
				case -2:
					userChoice = -3;
				}
			}
		}
		
		
//		final String LETTER_B = "B";
//		final String NUMBER_ZERO = "0";
//		
//		String businessDay = null, categoryMonth;
//		String updateNum;
//		
//		LinkedList<String> data = new LinkedList<String>();
//		
//		DateTimeFormatter dateFormatStr = DateTimeFormatter.ofPattern("MMddyy");
//		DateTimeFormatter timeFormatStr = DateTimeFormatter.ofPattern("H");
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		
//		String date = currentDateTime.format(dateFormatStr);
//		String time = currentDateTime.format(timeFormatStr);
//
//
//		
//		try {
//			File counterFile = new File("/Users/JRDN/Library/Mobile Documents/com~apple~CloudDocs/Coding/Java/Playground/Database-of-Business/info.txt");
//			Scanner scanObj = new Scanner(counterFile);
//			
//			while (scanObj.hasNextLine()) {
//				String line = scanObj.nextLine();
//		        data.add(line);
//		    }
//		    
//			scanObj.close();
//		    
//		} catch (FileNotFoundException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		}
//		
//		System.out.println(data.get(0));
//		
//		
//		Integer data_financeMonthNum = 0, data_packageDel_MonthNum = 0, data_packageRtn_MonthNum = 0, data_responseMonthNum = 0, data_specialMonthNum = 0;
//	
//		int data_businessDayNum = Integer.parseInt(data.get(0));
//		data_financeMonthNum = Integer.parseInt(data.get(1));
//		data_packageDel_MonthNum = Integer.parseInt(data.get(2));
//		data_packageRtn_MonthNum = Integer.parseInt(data.get(3));
//		data_responseMonthNum = Integer.parseInt(data.get(4));
//		data_specialMonthNum = Integer.parseInt(data.get(5));
//
//		
//		System.out.println("T: " + data_businessDayNum);
//
//		
//		if (data_financeMonthNum <= 9) {
//			data.set(1, NUMBER_ZERO.concat(NUMBER_ZERO).concat(data.get(1)));
//		} 
//		else if (data_financeMonthNum <= 99) {
//			data.set(1, NUMBER_ZERO.concat(data.get(1)));
//		}
//		
//		
//		if (data_packageDel_MonthNum <= 9) {
//			data.set(2, NUMBER_ZERO.concat(NUMBER_ZERO).concat(data.get(2)));
//		} 
//		else if (data_packageDel_MonthNum <= 99) {
//			data.set(2, NUMBER_ZERO.concat(data.get(2)));
//		}
//		
//
//		if (data_packageRtn_MonthNum <= 9) {
//			data.set(3, NUMBER_ZERO.concat(NUMBER_ZERO).concat(data.get(3)));
//		} 
//		else if (data_packageRtn_MonthNum <= 99) {
//			data.set(3, NUMBER_ZERO.concat(data.get(3)));
//		}
//		
//		
//		
//		
//		
//		if (data_specialMonthNum <= 9) {
//			data.set(5, NUMBER_ZERO.concat(NUMBER_ZERO).concat(data.get(5)));
//		} 
//		else if (data_specialMonthNum <= 99) {
//			data.set(5, NUMBER_ZERO.concat(data.get(5)));
//		}
//		
//		
//		
//		
//		
//		Scanner userInput = new Scanner(System.in);
//		
//		
//		int userChoiceInt = -1, loopValidation = 1;
//		
//		while (loopValidation == 1) {
//			
//			objectMenu.printUserChoice();
//			
//			userChoiceInt = userInput.nextInt();
//			
////			try {
////				userChoice = userInput.nextInt();
////			} catch (InputMismatchException e) {
////				System.out.println("ERROR: Please enter a valid number.");
////				e.printStackTrace();
////				break;
////			}
//			
//			switch(userChoiceInt) {
//			
//				case 1:
//					objectDesign.printNewLines(3);
//					
//					objectMenu.printMainMenu();
//					objectMenu.printUserChoice();
//					
//					userChoiceInt = userInput.nextInt();
//					
//					switch(userChoiceInt) {
//					
//						case 4:
//							
//							if (data_businessDayNum <= 9) {
//								businessDay = NUMBER_ZERO.concat(data.get(0));
//							} else {
//								businessDay = data.get(0);
//							}
//							
//							
//							if (data_responseMonthNum <= 9) {
//								categoryMonth = NUMBER_ZERO.concat(NUMBER_ZERO).concat(data.get(4));
//							}
//							else if (data_responseMonthNum <= 99) {
//								categoryMonth = NUMBER_ZERO.concat(data.get(4));
//							}
//							else {
//								categoryMonth = data.get(4);
//							}
//							
//							System.out.println(LETTER_B.concat(businessDay).concat(date).concat("C").concat(categoryMonth));
//							
//							
//							data_responseMonthNum++;
//							
//							updateNum = data_responseMonthNum.toString();
//							
//							data.set(4, updateNum);
//							
//					}
//					
//					break;
//				
//				case 0:
//					System.out.println("Closing program.");
//					System.out.print("\n");
//					
//					loopValidation = 0;
//					
//					break;
//					
//				default:
//					System.out.println("ERROR: Please enter a valid number.");
//					
//					objectDesign.printNewLines(6);
//					userChoiceInt = -1;
//			}
//		}
//		
//		userInput.close();
	}		   
}
