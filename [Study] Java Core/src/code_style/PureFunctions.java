package code_style;

/**
 * WHAT ARE PURE FUNCTIONS AND WHY THEY ARE GOOD 
 * 
 */
public class PureFunctions {

	/**
	 * ****************************************************************************************************************
	 * PURE FUNCTION :: FUNCTION IN THE MATHEMATICAL SENSE - IT PERFORMS A CALCULATION WITH NO OBSERVABLE SIDE-EFFECTS,
	 * AND ITS RESULT DEPENDS ONLY ON ITS ARGUMENTS.
	 * ****************************************************************************************************************
	 * 
	 * OBS> A function is pure when all its dependencies are pure functions themselves of constants
	 * 
	 * Unfortunately, Java makes no distinction between a pure function and any plain old subroutine. Even in the core
	 * libraries, the two are intermingled with no obvious distinguishing characteristic. 
	 * 
	 */
	
	/**
	 * ADVANTAGES OF PURE FUNCTIONS
	 * ----------------------------
	 * 
	 * -> Testable
	 * -> Thread-safe
	 * -> Deterministic
	 * -> Never need to be mocked out
	 * -> Easier to understand and reason about
	 * 
	 * Idea :: They're the easier kind of functions to work with, just as immutables are the easy variety of objects.
	 * 
	 */
	
	/**
	 * IMPURITY
	 * --------
	 * 
	 * Sources:
	 * - mutable state
	 * - system clock
	 * - I/O
	 * 
	 * OBS> Impure functions are not evil, they are necessary, but keeping your functions pure just gives you less to
	 * worry about.
	 * 
	 * THEN> Can deal with impurity by separating the impure things from the pure ones with DEPENDENCY INJECTION.
	 * 
	 */
}
