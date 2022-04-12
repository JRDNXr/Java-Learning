
// |=================|
// |   ABSTRACTION   |
// |=================|

// If there is even a single method that is abstract, the entire class must become abstract as well. Take a look at the class name.
// For the class name, (instead of public) we used abstract.
// For the method name, we want this class to be inherited by Pig.java, so we made it public.

abstract class Animal {

	public abstract String animalSound();
	
	// There is no body for an abstract method. This only exists in an inherited class (look at Pig.java for more info).
	
}
