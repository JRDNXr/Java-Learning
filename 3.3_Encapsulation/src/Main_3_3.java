
public class Main_3_3 {

	private String name;
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	public static void main(String[] args) {
		
		Main_3_3 object1 = new Main_3_3();
		object1.setName("JRDN");
		
		System.out.println("First Name: " + object1.getName());
	}
}
