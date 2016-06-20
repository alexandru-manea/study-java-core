package various;

/**
 * PROBLEM :: WHEN DEALING WITH SPECIAL CASES WHICH HAVE A SIMPLER SOLUTION, BUT STILL CAN BE SOLVABLE BY THE GENERIC ONE,
 * AND THEY ARE RARE ENOUGH, IT IS BETTER NOT TO TREAT THEM SEPARATELY. DON'T OPTIMIZE CASES THAT HARDLY EVEN EXIST, AT THE
 * EXPENSE OF ALL THE CASES THAT DO EXIST (EXPENSE == CHECKS FOR THEM).
 * 
 */
public class OptimizationWhichDoesWorse {
	
	/**
	 * Assume we have to implement a method repeat(String base, int count) whose purpose is to return a String consisting of count copies of the base 
	 * string. e.g., repeat("hey", 3) --> "heyheyhey".
	 * 
	 */
	
	/*
	 * Apparently optimized version
	 * 
	 */
	public static String repeatVersion1(String base, int count) {
		
		if (base.equals("") || count == 0) { // [1] & [2]
			return "";
		}
		
		if (count == 1) { // [3]
			return base;
		}
		
		// [4]
		StringBuilder builder = new StringBuilder(base.length() * count); // better constructor usage
		for (int i = 0; i < count; i++) {
			
			builder.append(base);
		}
		return builder.toString();
	}
	
	/*
	 * We treat the following cases:
	 * [1] -- base is empty string, so return the same, no need to do something else
	 * [2] -- count is 0; same as above
	 * [3] -- count is 1; just return the base
	 * [4] -- other cases in which we actually have to loop
	 * 
	 */
	
	/*
	 * PROBLEM --> we're going through the first three checks EVERY TIME, even if the parameters are legitimate for case 4. Even more, users of this 
	 * method will only rarely call it with an empty string or with 0 or 1 as counts.
	 * 
	 */
	
	/*
	 * SOLUTION --> remove all special cases
	 * 
	 */
	public static String repeatVersion2(String base, int count) {
		
		StringBuilder builder = new StringBuilder(base.length() * count); // better constructor usage
		for (int i = 0; i < count; i++) {
			
			builder.append(base);
		}
		return builder.toString();
	}
}
