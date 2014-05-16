package various;

/**
 * ISSUE :: ONE SHOULD NOT CALL OVERRIDABLE METHODS IN THE CONSTRUCTOR, DIRECTLY OR INDIRECTLY; THIS WILL LEAD TO BUGS.  
 * 
 */
public class OverridableMetodCallsInConstructor {

	/*
	 * Example - base class with overridable method called from within the constructor
	 * 
	 */
	private static class Base {
		
		public Base() {
			
			overrideMe(); // call in question [2]
		}
		
		// method in question
		public void overrideMe() {
			
			System.out.println("Fuc iu!");
		}
	}
	
	/*
	 * Example - subclass which overrides the method
	 * 
	 */
	private static class Child extends Base {
		
		private final int x;
		
		public Child(int x) {
			
			// super(); -- hidden [1]
			this.x = x; // [4]
		}
		
		// overriden method
		@Override
		public void overrideMe() {
			
			System.out.println(x); // [3]
		}
	}
	
	
	// Test Client
	public static void main(String[] args) {
		
		new Child(42); // WILL PRINT 0!!!
		/*
		 * Base's constructor calls overrideMe(), Child has not finished initializing the final int x, and so the method
		 * gets the default (wrong) value.
		 */
	}
	
	
	/**
	 * Reason: The superclass constructor runs before the subclass constructor, so the overriding method in the subclass
	 * will be invoked before the subclass constructor has run.
	 * 
	 * If the overriding method depends on any initialization performed by the subclass constructor, the method will not 
	 * behave as expected.
	 * 
	 */
}
