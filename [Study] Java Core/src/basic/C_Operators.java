package basic;

public class C_Operators {

	/**
	 * ORDER OF OPERATION
	 * ------------------
	 * 
	 * -- By decreasing order of operator precedence; if the same, then left-to-right, if parentheses not present
	 * 
	 * 1. Post-unary						a++
     * 2. Pre-unary							++a
	 * 3. Other unary						+, -, !
	 * 4. Multiplications/Division/Modulus	*, /, %
	 * 4. Addition/Subtraction				+, -
	 * 5. Shift operators					<<, >>
	 * 6. Relational operators				<, >, instanceof
	 * 7. Equal/Not equal					==, !=
	 * 8. Logical operators					&, |
	 * 9. Short-circuit logical				&&, ||
	 * 10. Ternary							a ? e1 : e2
	 * 11. Assignment						=, +=
	 * 
	 * 
	 * NUMERIC PROMOTION
	 * -----------------
	 * 
	 * - If two values have different data types, one of them will be promoted to the larger of the two
	 * - If one value is integral, and the other is floating-point, the integral value will be promoted to the floating-point data type
	 * - Byte, short, and char are promoted to int any time they're used with a BINARY arithmetic operator, even if neither of the operands is an int
	 * - After all promotion has occurred, the resulting value will have the same data type as its promoted operands
	 * 
	 * 
	 * PRE AND POST UNARY OPERATORS
	 * ----------------------------
	 * 
	 * - Pre-increment/decrement (++a, --a)	 --> operator applied first, then return the new value of the expression
	 * - Post-increment/decrement (a++, a--) --> original value returned, operator applied afterwards
	 * 
	 * 
	 * AUTOMATIC CONVERSION AND CASTING
	 * --------------------------------
	 * 
	 * - Java will automatically promote from smaller to larger data types, but will throw a compiler error if trying the other way around
	 * - Also if it will notice that the declared type and the literal value are not compatible, it will complain
	 * 		e.g. short x = 123456789; // COMPILER ERROR - outside of range
	 *           int y = 1.0;         // COMPILER ERROR - incompatible types
	 * - Can use casting anytime we are going from a larger data type to a smaller one or from a floating-point type to an integral one
	 * 		e.g. short x = (short)123456789; // stored as 12345
	 * 		     int y = (int)1.0;
	 * - Be careful that the cast is only applied to one of the operands 
	 * - Compound assignment operators can cast for us
	 * 
	 * 
	 * OBSERVATIONS
	 * ------------
	 * 
	 * - Assignment returns a value
	 * 		e.g. long y = (x = 3); --> y will be 3
	 * - Short-circuit versions of logical operators (&&, ||): the second part of the expression may not be executed
	 * - Ternary operator: as of Java 7, only one of the rhs expressions will be evaluated at runtime
	 * 
	 */
}
