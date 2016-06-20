package basic;

public class H_Exceptions {

	/**
	 * EXCEPTION HIERARCHY
	 * -------------------
	 * 
	 * 								Object
	 *								  |
	 *							  Throwable
	 *							  /       \
	 *				java.lang.Exception		java.lang.Error
	 *					/		   \
	 * java.lang.RuntimeException   Checked Exceptions
	 * 
	 * # Throwable - all such events
	 * # Error - something serious from which the program should not attempt to recover from
	 * # RuntimeException - unchecked exception, unexpected, but not fatal
	 * # Checked Exceptions - More anticipated events, such as a file not existing
	 * 						- Handle or declare rule
	 * 
	 * 
	 *  COMMON EXCEPTIONS
	 * 	- Runtime/Unchecked exceptions (subclasses of RuntimeException, CAN BE handled or declared, can be thrown by both the JVM and you)
	 * 		- ArithmeticException (int answer = 1 / 0;)
	 * 		- ArrayIndexOutOfBoundsException
	 * 		- ClassCastException (String type = "a"; Object object = type; Integer number = (Integer) object;)
	 * 		- IllegalArgumentException (thrown by programmer for protection)
	 * 		- NullPointerException
	 * 		- NumberFormatException (usually thrown by the programmer, e.g. Integer.parseInt("abc");)
	 * 	- Checked exceptions (have Exception in their hierarchy, but not RuntimeException, MUST BE handled or reclared, can be thrown by both the JVM and you)
	 * 		- FileNotFoundException
	 * 		- IOException
	 *  - Errors (extend the Error class, CAN BE handled or declared, can only be thrown by the JVM)
	 *  	- ExceptionInInitializerError (if one of the static initializers throws an exception)
	 *  	- StackOverflowError
	 *  	- NoClassDefFoundError
	 * 
	 */
	
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * THROWING AN EXCEPTION
	 * 	1. Running code that can result in one
	 *	2. Requesting java to throw one
	 *
	 * TRY-CATCH-FINALLY
	 * 	- Used to separate logic that might throw an exception from the logic to handle it
	 *  - Execution is stopped in the try block at the statement that throws it and control flow is passed to the catch block
	 *  - The finally block will run, regardless of whether an exception is thrown or not (unless System.exit())
	 * 
	 */
}
