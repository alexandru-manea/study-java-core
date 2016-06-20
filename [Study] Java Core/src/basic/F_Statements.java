package basic;

public class F_Statements {

	/**
	 * IF STATEMENT
	 * ------------
	 * 
	 * - Make sure expression in parentheses is a boolean
	 * 
	 * 
	 * SWITCH STATEMENT
	 * ----------------
	 * 
	 * - The variable that can be tested on can be: 
	 * 	  1. byte, short, char, int, and wrapper classes (< JSE5) 
	 *    2. enum (< JSE7) 
	 *    3. String (> JSE7)
	 * - The values on each case statement: compile-time constant value of the same data type as the switch value
	 * 	  1. literals
	 *    2. enum constants
	 *    3. final constant variables
	 * - Make sure each case has a break statement, otherwise flow will continue to all following statements 
	 * 
	 * 
	 * FOR STATEMENT
	 * -------------
	 * 
	 * - All components are optional: for (initialization; booleanExpression; updateStatement)
	 * - Infinite loop: for ( ; ; ) {...}
	 * - Loop variables have the scope of the loop
	 * - The initialization and updateStatement parts may contain multiple statements, separated by commas, with the same type
	 * 
	 * 
	 * ENHANCED-FOR STATEMENT
	 * ----------------------
	 * 
	 * - Rhs has to be an array or a class which implements java.lang.Iterable
	 * - Syntactic sugar --> converted to a normal for by the compiler
	 * 
	 * 
	 * LABELS, BREAK, AND CONTINUTE
	 * ----------------------------
	 * 
	 * - Optional pointers to the head of a statement (if, switch, loops)
	 * 	- Same rules as for identifier naming (commonly uppercase), preceded by a colon
	 * - Can parameterize a break/continue statement with the label of the statement to break from
	 * 
	 */
}
