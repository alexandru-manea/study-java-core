package basic;

public class D_Methods {

	/**
	 * METHOD STRUCTURE
	 * ----------------
	 * 
	 * (access modifier) (optional specifier) [return type] [method name] [parameters]     (exception) 	    {method body}
	 * 		public 			   static			  int		   getAge      (Person p)   throws Exception 	    {...}
	 * 
	 * 	- access modifiers    :: private, package private, protected, public
	 * 	- optional specifiers :: static, abstract, final, synchronized
	 *  - return type         :: void or any variable type
	 *  - method name         :: identifier rules (letters, numbers, '$', '_', but not start with a number of be a reserved word)
	 *  - parameter list      :: comma-separated, can use varargs
	 *  - exception           :: comma-separated list
	 *  - method body		  :: required, except for abstract methods and interfaces
	 *  
	 */
	
	
	/**
	 * VARARGS
	 * -------
	 * 
	 * Rules
	 * 	- There can only be one varargs parameter per method
	 *  - The varargs parameter has to be the last one in the parameter list
	 *  
	 * When calling a method declared with varargs, you can:
	 * 	1. Call it with an array
	 *  2. List the elements in the array and let Java create it for you
	 *  3. Omit it, and Java will create a 0-length array
	 *  OBS> Passing in null will result in an exception
	 *  
	 */
	
	
	/**
	 * PASSING DATA AMONG METHODS
	 * --------------------------
	 * 
	 * Passing data INTO a method
	 * 	- Java is PASS-BY-VALUE
	 * 		- A copy of the variable is made and the method receives the copy
	 * 		- Assignments in the method do not affect the caller
	 *      - But calling methods on the reference parameters will, because they refer to the same object
	 * 
	 * Passing data OUT OF a method
	 * 	- By return type	
	 * 
	 */
	
}
