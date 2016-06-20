package class_design;

public class G_StaticStuff {

	/**
	 * STATIC MEMBERS
	 * --------------
	 * 
	 * General rule
	 * 	- Make/Use a member shared at the class level
	 * 
	 * Where static can be used
	 * 	A. Methods
	 *  B. Variables
	 *  C. Initializer blocks
	 *  D. Classes
	 *  E. Imports
	 * 	
	 * Calling a static member
	 * 	1. Prefixed by the class name
	 *  2. Prefixed by an instance of the class => compiler checks for the reference type and uses that instead of the object
	 *  
	 * OBSERVATIONS
	 * 	- Static members cannot call an instance member
	 *
	 */
	
	
	/**
	 * STATIC METHODS
	 * --------------
	 * 
	 * Rationale
	 * 	- Utilities/Helper methods that don't require any object state
	 *  - For state that is shared among all instances of a class (e.g., a counter)
	 * 
	 */
	
	
	/**
	 * STATIC INTIALIZERS
	 * ------------------
	 * 
	 * 	- Like instance initializer blocks, but with static in front of the block
	 *  - Common usage: when you need to initialize a static field and the code requires >1 line (like a colleciton)
	 *  - They are run when the class is first used
	 *  - Static final fields can be left uninitialized when declared if they are initialized in a static initializer because that is run first
	 *  - Should be avoided if possible, and if necessary, all code should go into one block
	 * 
	 */
	
	
	/**
	 * STATIC IMPORTS
	 * --------------
	 * 
	 * - For importing static members of classes (not whole classes like the regular imports) to avoid referring to them with Class.member
	 * - Can use wildcards or import specific members. Don't overdue it because it can be confusing to know there members come from
	 * 
	 */
}
