
// |=================================|
// |   IMPORTS, PACKAGES, AND APIS   |
// |=================================|

package Main;

	/* 
		A package in Java is used to group related classes. Think of it as a folder in a file directory.
		We use packages to avoid name conflicts, and to write better, maintainable, and reusable code. Packages are divided into two categories:
		
		- Built-in Packages (packages from the Java API)
		- User-defined Packages (create your own packages). We created "package Main;" to group our class (there's only 1 file, but you get the idea)
	*/ 

// import java.util.*; // Imports the ENTIRE java util package (this includes Scanner).
import java.util.Scanner; // Imports a single Java built class
//import Secondary.*; // This and the below option both work. However, one can be more efficient than the other.
import Secondary.Main_Secondary_1_1; // This one is the more efficient one in our use case.

// ** NOTE ** It's best practice to import only what you need, as it makes your program more efficient. 

public class Main_1_1 {
	
	public static void main(String[] args) {
		
		/*
		  	The Java API is a library of pre-written classes, that are free to use, included in the Java Development Environment (JDE).
		  	
		  	** NOTE **
		  	*
		  	* JDK stands for Java Developer Kit. It is any software development environment used to develop Java applications. This includes the JRE.
		  	* 
		  	* JRE stands for Java Runtime Environment. JRE consists of JVM, Java Libraries, and all other components required to run Java.
		  	* 
		  	* JVM stands for Java Virtual Machine. It is responsible for loading the Java class files into memory and execution.
		  	* 
		  	* JDE stands for Java Development Environment. This is exactly like JDK, except comparable in power consumption. 
		  	* 
		  	* IDE stands for Integrated Developer Environment. This means any application cable of running a programming language. Eg. Eclipse.
		
			The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and
			attributes), or a whole package that contain all the classes that belong to the specified package.
		*/
		
		// To import a single Java built class, type: "import [package name].[class];".  Eg. "import java.util.Scanner".
		// To import a Java built package (a collection of similar classes), type "import [package name].*;".  Eg. "import java.util.*;".
		
		// To import a single User built class, type "import [package name].[class];".  Eg. "import Secondary.Main_Secondary_1_1".
		// To import a User built package, type "import [package name].*;"  Eg. "import Secondary.*;"
		
		// ** NOTE ** Think of importing a user built package like this:
		// 			  Each package is a folder (Main and Secondary). When you import, you are saying the contents of your Secondary folder are
		//			  available in your Main folder. It's as if the files are already there in the Main folder, however, we organized them in
		//			  different folders.
		
		// This calls the main method in the Secondary Package > Main_Secondary_1_1.java.
		Main_Secondary_1_1.main(args); // Output: Hello, JRDN D'Souza!
		
		// This creates an object of the class Main_Secondary_1_1. On the next line, we invoke one of the methods from this class.
		Main_Secondary_1_1 object = new Main_Secondary_1_1();
		object.printSomething(); // Output: This is a test!
		
	}

}
