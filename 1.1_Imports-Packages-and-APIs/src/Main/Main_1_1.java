
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

import java.util.Scanner; // Imports a class
import Secondary.Main_Secondary_1_1; // Imports a user built package

public class Main_1_1 {
	
	public static void main(String[] args) {
		
		/*
		  	The Java API is a library of pre-written classes, that are free to use, included in the Java Development Environment (JDE).
		  	
		  	** NOTE **
		  	* JDE stands for Java Development Environment.
		  	* 
		  	* JDK stands for Java Developer Kit. 
		  	* 
		  	* JRE stands for Java Runtime Environment. JRE consists of JVM, Java Libraries, and all other components required to run Java.
		  	* 
		  	* JVM stands for Java Virtual Machine. Enables a computer to run Java programs. Eg. macOS
		  	* 
		  	* IDE stands for Integrated Developer Environment. This means any application cable of running a programming language. Eg. Eclipse.
		
			The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and
			attributes), or a whole package that contain all the classes that belong to the specified package.
		
			import package.name.Class;   // Import a single class
			import package.name.*;   	// Import the whole package
		
			You will learn more about the Scanner class later.
		 */
		
		// To organize this file into a package, type "package [Name];"
		// To import an API, type "import [Name];"
		// To import a user built package, type "import [Name];"
		
		// This calls the main method in the Secondary Package > Main_Secondary_1_1.java.
		Main_Secondary_1_1.main(args); // Output: Hello, JRDN D'Souza!
		
		// This creates an object of the class Main_Secondary_1_1. On the next line, we invoke one of the methods from this class.
		Main_Secondary_1_1 object = new Main_Secondary_1_1();
		object.printSomething(); // Output: This is a test!
		
	}

}
