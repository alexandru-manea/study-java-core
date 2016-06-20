package advanced.object_methods;

public class Equals {

	/**
	 * WHEN TO OVERRIDE AND WHEN NOT TO DO IT
	 * --------------------------------------
	 * 
	 * OBS> Object's implementation: each instance is equal only to itself (== comparison)
	 * 
	 * WHEN NOT TO OVERRIDE
	 * 	- Each instance of the class is inherently unique (e.g., Thread)
	 *  - You don't care about logical equality (e.g., Random)
	 *  - A superclass has already provided an implementation which is appropriate for this subclass as well (e.g., AbstractSet -> Set)
	 *  - The class is private or package-private and its equals method will never be invoked
	 *  
	 * WHEN TO OVERRIDE
	 * 	- A class has a notion of logical equality that differs from mere object identity AND
	 * 	- A superclass has not already overridden it to implement the desired behavior
	 * 
	 * WHY
	 * 	- Provide logical equality
	 *  - Enable instances to serve as map keys or set elements with predictable behavior
	 * 
	 */
	
	/**
	 * GENERAL CONTRACT
	 * ----------------
	 * 
	 * The equals relation must be:
	 * 	1. REFLEXIVE: for any non-null reference value x, x.equals(x) must return true
	 *  2. SYMMETRIC: for any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true
	 *  3. TRANSISIVE: for any non-null reference values x, y, and z, x.equals(y) returns true and y.equals(z) return true => x.equals(z) returns true
	 *  4. CONSISTENT: for any non-null reference value x and y, multiple invocation of x.equals(y) consistently return the same value, if no modofications to objects
	 *  5. x.equals(null) must return false
	 * 
	 */
	
	/**
	 * HOW TO
	 * ------
	 * 
	 * 1. Use the == operator to check if the argument is a reference to this object
	 * 	- If so, return true
	 * 	- Performance optimization
	 * 
	 * 2. Use the instanceof operator to check if the argument has the correct type
	 * 	- If not, return false
	 * 
	 * 3. Cast the argument to the correct type
	 * 	- Guaranteed to succeed, because of check made on step 2
	 * 
	 * 4. For each "significant" field in the class, check that the one in the argument and the one in this object match
	 * 	- If all tests succeed, return true; otherwise, return false
	 *  - For primitive values, except float and double, use the == operator
	 *  - For float and double, use the Float.compare and Double.compare methods
	 *  - For object reference fields, invoke the equals method recursively
	 *  	- Some object references may legitimately contain null. To avoid NLPs, use this idiom:
	 *  		(field == null ? o.field == null : field.equals(o.field))
	 *  - Performance optimization 1: first compare fields that are more likely to differ, less expensive to compare, or ideally both
	 *  - Performance optimization 2: Don't compare derived fields
	 *  
	 * 5. At the end, ask yourself three questions
	 * 	- Is it symmetric?
	 *  - Is it transitive?
	 *  - Is it consistent?
	 *  
	 */
	
	/*
	 * Example of equals implementation
	 */
	private static class MyClass {
		private int a;
		private double b;
		private String c;

		@Override
		public boolean equals(Object object) {
			// 1
			if (this == object) {
				return true;
			}
			
			// 2
			if (!(object instanceof MyClass)) {
				return false;
			}
			
			// 3
			MyClass other = (MyClass) object;
			
			// 4
			if (a != other.a) { // primitive non-floating point
				return false;
			}
			if (Double.compare(b, other.b) != 0) { // double
				return false;
			}
			if (c == null) { // reference type
				if (other.c != null) {
					return false;
				}
			} else if (!c.equals(other.c)) {
				return false;
			}
			
			return true;
		}
	}
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * - Always override hashCode when you override equals
	 * - Don't substitute another type for Object in the equals declaration
	 * 	 	public boolean equals(MyClass o) // OVERLOADING, NOT OVERRIDING
	 */
}
