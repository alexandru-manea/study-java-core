package class_design;

public class D_OverridingAndOverloading {

	/**
	 * OVERRIDING METHODS
	 * ------------------
	 * 
	 * RULES
	 * 	1. Method in child has the same signature (name + parameter list) as the one in the parent
	 *  2. Method is child is at least as accessible or more accessible than the one in the parent
	 *  3. Method in child may not throw a checked exception which is new or broader than any exception thrown by the one in the parent (but can hide one)
	 *  4. Method in child must return the same type or a subclass of that type of the return value in the parent version
	 *  
	 * OBSERVATIONS
	 *  - If 1. is satisfied, but any of the others are not => compile error
	 *  - When overriding a method, you can use super and this to refer to the parent or child versions, respectively
	 *  	e.g. public class Canine { public double getWeight() { return 50; } }
	 *  		 public class Wolf extends Canine { public double getWeight() { return super.getWeight() + 20; } }
	 *  - Remember overriding only applies for public and protected methods => can re-define a private method in the child => no override (or rules)
	 *  - The methods must not be static. If they are, the method is hidden and not overridden.
	 *  - Using @Override to explicitly indicate that a method (from a superclass or interface) is being overridden is good practice
	 *  	- If the declaration is not compatible with the one in the superclass/interface or with the rules => compiler error
	 *  
	 *  HIDING STATIC METHODS
	 *   - When a child class defines a method with the same signature as a static method defined in the parent
	 *   - All 4 rules from overriding apply. In addition, the new method has to be static, otherwise compilation will fail 
	 *   OBS> Can also hide variables, by re-defining them in the child 
	 *   
	 */
	
	
	/**
	 * OVERLOADING METHODS
	 * -------------------
	 * 
	 * METHODS WITH:
	 * 	- SAME NAME
	 *  - DIFFERENT NUMBER, TYPE, OR ORDER OF PARAMETERS
	 *  
	 * Overloaded methods, can have, IN EXCESS OF different parameter lists,:
	 *  - Different access modifiers
	 *  - Different optional specifiers (e.g., static)
	 *  - Different return types
	 *  - Different exception lists 
	 * 
	 * RULE> Java will follow the 'most specific parameter list' rule in general
	 * 		1. Exact match by type
	 * 		2. Matching a superclass type
	 * 		2. Converting to a larger primitive type
	 * 		3. Converting to an autoboxed type
	 * 		4. Varargs
	 *  
	 *  OBS> Java will do only one conversion when matching up to a method
	 * 		public static void play(Long l) {...}
	 *  	public static void play(Long... l) {...}
	 *  	...
	 *  	play(4); // DOES NOT COMPILE because it has to convert first to a long and then to a Long (2 conversions)
	 *  	play(4L); // calls the Long version
	 *  
	 */
}
