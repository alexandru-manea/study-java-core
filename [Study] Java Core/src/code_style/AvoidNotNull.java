package code_style;


public class AvoidNotNull 
{
	
	/**
	 * AVOIDING '!= null' STATEMENTS
	 * -----------------------------
	 * 
	 * PROBLEM :: Code is cluttered with tests for null before using an object, to avoid NPEs e.g.:
	 * 
	 * ...
	 * if (someObject != null)
	 * {
     *    someObject.doCalc();
	 * }
	 * ...
	 * 
	 * -> This is a common problem for beginner to intermediate developers, because they either 
	 *    --- don't know/trust the contract they are participating in and defensively overcheck for nulls
	 *    --- tend to rely on returning nulls to indicate something and thus require the caller to check
	 * 
	 * SOLUTION
	 * 
	 * (C) Situations where null comes up
	 * 
	 * (1) :: Where NULL IS A VALID RESPONSE in terms of the contract 
	 * 		(a) you don't have control over the code you're calling
	 * 		     => HAVE TO CHECK FOR NULLS
	 * 		(b) you do have control over the code
	 * 			 => AVOID USING NULLS AS A RESPONSE
	 * 			 => RETURN EMPTY COLLECTIONS/ARRAYS
	 * 			 => THROW AN EXCEPTION
	 * 
	 * (2) :: Where NULL IS NOT A VALID RESPONSE in terms of the contract
	 * 		(a) TESTING
	 * 			=> USE ASSERTIONS
	 * 		(b) PRODUCTION
	 * 			=> ALLOW FAILURE (NPEs) because assertions are disabled by default and it's risky
	 * 
	 * OBSERVATIONS
	 * 
	 * --> There were talks about alleviating this problem in Java with something like an ELVIS OPERATOR (GROOVY)
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
