package advanced.object_methods;

public class HashCode {

	/**
	 * GENERAL CONTRACT
	 * ----------------
	 * 
	 * IMP> ALWAYS OVERRIDE hashCode WHEN YOU OVERRIDE equals
	 * 	- Failure to do so will prevent your class from functioning properly in conjunction with all hash-based collections
	 * 
	 * 1. The hashCode must consistently return the same integer when invoked multiple times, provided no significant field has changed
	 * 2. If a.equals(b) => hashCode(a) == hashCode(b)
	 * 3. It is not required that two unequal objects have unequal hash coded, but it is desired
	 * 
	 */
	
	/**
	 * HOW TO
	 * ------
	 * 
	 * IMP> A good hash function tends to produce unequal results for unequal objects
	 * 
	 * 1. Start with result = 17, or any constant non-zero value
	 * 2. Compute an int has code for each field (c)
	 * 3. Combine the hash code into result
	 *    result = 31 * result + c
	 * 
	 */
	
	/*
	 * Example of hashCode implementation
	 */
	private static class PhoneNumber {
		private int areaCode;
		private int prefix;
		private int lineNumber;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 17;
			result = prime * result + areaCode;
			result = prime * result + lineNumber;
			result = prime * result + prefix;
			return result;
		}
	}
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * - If the class is immutable and the cost of computing the hashCode is significant, consider CACHING the hash code in the object
	 * 	e.g.
	 * 		private volatile int hashCode;
	 * 		
	 * 		@Override public int hashCode() {
	 * 			if (hashCode == 0) {
	 * 				... // compute it
	 * 			}
	 * 			return hashCode;
	 * 		}
	 */
}
