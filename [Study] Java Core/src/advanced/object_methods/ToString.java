package advanced.object_methods;

public class ToString {

	/**
	 * ALWAYS OVERRIDE toString
	 * ------------------------
	 * 
	 * - Object provides an implementation (class name + '@' + hexadecimal representation of the hash code)
	 * 	- BUT this is not what the user of the class generally wants
	 * 	- SO always try to override it
	 *  - General contract: "An informative representation that is easy for a person to read" 
	 * 
	 * RULES
	 * 1. WHEN PRACTICAL, toString SHOULD RETURN ALL OF THE INTERESTING INFORMATION CONTAINED IN THE OBJECT
	 * 2. FOR VALUE CLASSES, IT IS USEFUL TO SPECIFY THE FORMAT OF THE RESULT
	 * 	  - If you specify it, also provide matching static factories or constructors to easily translate between object and string representation
	 *    - Make sure you think it through, you will be stuck with that format and clients will use it accordingly
	 * 3. PROVIDE PROGRAMMATIC ACCESS TO ALL OF THE INFORMATION CONTAINED IN THE VALUE RETURNED BY toString
	 * 
	 * OBSERVATIONS
	 * - toString is always invoked when an object is passed to println, printf, string concatenation, assert, printed by a debugger, etc.
	 * 
	 */
}
