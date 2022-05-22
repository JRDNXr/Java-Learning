package Main;

public class Menus {
	
	public void printMainMenu() {		
		System.out.println("=================");
		System.out.println("|   MAIN MENU   |");
		System.out.println("=================");
		System.out.println("[1] Create a New Entry");
		System.out.println("[2] Check Data");
		System.out.print("[0] Exit / Quit");
	}
	
	public void printQuitMenu() {
		System.out.println("Program closed.");
	}
	
	public void printCreateNewEntryMenu() {
		System.out.println("==========================");
		System.out.println("|   CREATE A NEW ENTRY   |");
		System.out.println("==========================");
		System.out.println("[1] Finance");
		System.out.println("[2] Package: Delivery");
		System.out.println("[3] Package: Return");
		System.out.println("[4] Response");
		System.out.print("[5] Special");
	}
	
	public void printCheckDataMenu() {
		System.out.println("==================");
		System.out.println("|   CHECK DATA   |");
		System.out.println("==================");
		System.out.println("[1] Current date and time");
		System.out.println("[2] Print items in Array");
		System.out.print("[0] <-- Go back");
	}
	
	public void printUserChoice() {
		System.out.print("Choice: " );
	}

}
