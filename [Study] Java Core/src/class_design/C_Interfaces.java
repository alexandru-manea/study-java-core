package class_design;

public class C_Interfaces {

	/**
	 * INTERFACE
	 * ---------
	 * 
	 * DEF> ADT that defines a list of abstract public methods for classes to implement and can also include constants and default methods
	 * 
	 * RULES
	 *  1. An interface cannot be instantiated directly
	 *  2. An interface is not required to have any methods
	 *  3. All interfaces are assumed to have public or default access
	 *  4. All methods are assumed to have public/default and abstract in their definition
	 *  5. Marking an interface as private, protected, or final will trigger a compiler error
	 *
	 * INHERITING AN INTERFACE
	 * - An interface that extends another interface, or an abstract class that implements it, inherits all abstract methods as its own abstract methods
	 * - The 1st concrete class that implements the interface/extends the abstract class must provide implementation for all the abstract methods 
	 * 
	 * MULTIPLE INTERFACE AND ABSTRACT METHODS
	 * 	- If a class inherits from two interfaces that contain the same abstract method
	 * 		=> No problem, just provide one implementation
	 * 	- If the methods have the same name, but different parameter lists
	 * 		=> No problem, overloading
	 * 	- If the methods have the same name and parameter list, but different return types
	 * 		=> Compiler error
	 * 
	 * INTERFACE VARIABLES/CONSTANTS
	 * 	- They are ASSUMED to pe public, static, and final
	 * 		- private, protected, or abstract => compiler error
	 * 	- Value must be set when declared
	 * 
	 */ 
	
	
	/**
	 * DEFAULT METHODS
	 * ---------------
	 * 
	 * - Since Java 8
	 * 
	 * RULES
	 * 	1. May only be declared within an interface
	 *  2. Must be marked with the default specifier and to provide an implementation
	 *  3. A default method is not allowed to be static, final, or abstract
	 *  4. Has to be public, will not compile if declared private or protected
	 *  
	 * RATIONALE
	 * 	- Backward compatibility when adding a new method to an interface
	 *  - Classes have the option of overriding it, but are not required to do so
	 * 
	 * INHERITANCE
	 * 	- When an interface extends or when an abstract class implements an interface that has default methods, it can either:
	 * 		A. Ignore it => default implementation will be used
	 * 		B. Override it (standard rules)
	 * 		C. Redeclare it as abstract => implementing classes have to provide implementation
	 * 
	 * MULTIPLE INHERITANCE
	 * 	- If a class implements two interfaces that have default methods with the same signature, the compiler will throw an error
	 * 		- Exception: if the class overrides the method
	 * 
	 */
}
