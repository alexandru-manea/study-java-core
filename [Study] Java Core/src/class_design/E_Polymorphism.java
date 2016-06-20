package class_design;

public class E_Polymorphism {

	/**
	 * POLYMORPHISM
	 * ------------
	 * 
	 * DEF> Property of objects to take many different forms
	 * 
	 * An object can be accessed through a reference
	 * 	1. With the same type as the object
	 *  2. With a superclass type
	 *  3. That defines an interface the objects implements, directly or through a superclass
	 *  
	 * IMP> Once an object has been assigned a new reference type, ONLY THE MEMBERS AVAILABLE TO THAT REFERENCE TYPE ARE CALLABLE
	 * 	- The type of the object determines which properties exist within the object in memory
	 * 	- The type of the reference determines which methods and variables are accessible
	 * 
	 */
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * CASTING
	 * 	1. Casting an object from a subclass to a superclass doesn't require an explicit cast
	 *  2. Casting an object from a superclass to a subclass requires an explicit cast
	 *  3. Casting to unrelated types => compiler error
	 *  
	 * VIRTUAL METHODS
	 * 	- Methods in which a specific implementation is not determined until runtime
	 *  - All non-final, non-static, non-private methods are virtual methods because any of them can be overridden
	 * 
	 */
}