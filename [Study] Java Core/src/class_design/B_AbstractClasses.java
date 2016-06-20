package class_design;

public class B_AbstractClasses {

	/**
	 * ABSTRACT CLASS
	 * ----------------
	 * 
	 * e.g. public abstract class Cat {
	 * 			public abstract void clean();
	 * 		}
	 * 
	 * RATIONALE
	 * 	- Provide reusable variables and methods in a class that has no point in being instantiated
	 * 	- Subclasses provide specific implementations, overrides, and add new stuff
	 * 
	 * RULES
	 * 	1. Abstract classes cannot be instantiated directly
	 * 	2. Abstract classes may be defined with any number, including 0, of abstract or non-abstract methods
	 *  3. Abstract classes may not be marked as private or final
	 *  4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods
	 *  5. The first concrete class that extends an abstract class must provide an implementation for all the inherited abstract methods
	 *  6. Abstract methods may not appear in a class that is not abstract 
	 * 
	 */
}
