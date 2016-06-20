package class_design;

public class A_Inheritance {

	/**
	 * CLASS INHERITANCE
	 * -----------------
	 * 
	 * DEF> Process by which a subclass automatically includes any PUBLIC or PROTECTED PRIMITIVES, OBJECTS, or METHODS
	 * - Java only supports single inheritance, to avoid complex, difficult to maintain code
	 * - Any class can be subclassed, except those marked with final
	 *  
	 * DEFINING CONSTRUCTORS
	 * 	- super() is used to call constructors in the direct parent class
	 *  - The first statement of every constructor is either this() or super()
	 * 		- Compiler automatically introduces a call to the no-arg constructor super() if the first statement is not a call to a parent constructor
	 * 		- If the parent class does not have a default no-argument constructor (another one is defined), the constructor in the child will fail compilation 
	 * 
	 */
	
	
	 /**
	  * CONSTRUCTORS
	  * ------------
	  * 
	  * RULES
	  *  1. The first statement is a call to another constructor within the class using this(), or a call to a constructor in the parent using super()
	  *  2. The super() call may not be used after the first statement in the constructor
	  *  3. If no super() call is declared in the constructor, Java will insert a no-argument super() as the first statement
	  *  4. If the parent doesn't have a no-argument constructor, and the child doesn't define any constructors => compiler error
	  *  5. If the parent doesn't have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor
	  *  
	  * ORDER
	  *  --> PARENT CONSTRUCTOR IS ALWAYS EXECUTED BEFORE THE CHILD CONSTRUCTOR
	  * 
	  */
	
	
	/**
	 * CALLING INHERITED MEMBERS
	 * -------------------------
	 * 
	 * WHAT
	 * - Children may use public/protected members of the parent, including methods, primitives, and references
	 * - If parent and child are in the same package, the child may also use default members in the parent
	 * 
	 * HOW
	 * - Directly
	 * - With this.
	 * - With super.
	 * 
	 */
}