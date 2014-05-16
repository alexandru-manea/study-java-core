package various;

/**
 * VARIOUS CASES WHERE AUTO-BOXING AND AUTO-UNBOXING ARE TRICKY AND CAN LEAD TO SUBTLE BUGS.
 * 
 */
public class DangersOfAutoBoxingAndUnboxing {

	private static void referenceVsValueComparison() {
		
		// create two different objects wrapped over the same int value
		Integer i = new Integer(0);
		Integer j = new Integer(0);
		
		/* The following will surprisingly print TRUE */
		
		System.out.println(i <= j // <= (same as <, >, >=) will force unboxing, so the int values 0 and 0 will be used => true
					    && j <= i // same as above
						&& i != j // == and != work for both reference and value comparison, here the former is used => true
						  );
		
	}
	
	public static void main(String[] args) {
		
		referenceVsValueComparison();
	}
}
