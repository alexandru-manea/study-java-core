package code_style;

/**
 * OBS> ALWAYS PUT OPENING AND CLOSING BRACES IN AN IF EXPRESSION WITH ONE STATEMENT INSIDE.
 * 
 * WHY --> For MAINTAINABILITY, i.e. if you put another statement after the one inside, it will be a stand-alone one,
 * and not within the scope of the if expression, even though the indentation might suggest otherwise. 
 *
 */
public class IfAlwaysWithBraces {

	/*
	 * Example of things going horribly wrong.
	 * 
	 */
	class ItWithoutBracesInitial {

		public void method() {
			
			if ("someErrorCode".equals("knownErrorCode"))
				System.exit(0);
			//...
		}
	}
	
	// x months later, a further clause is added
	
	class ItWithoutBracesAfter {

		public void method() {
			
			if ("someErrorCode".equals("knownErrorCode"))
				System.exit(0);
				System.exit(1); // NOT BOUND TO IF CLAUSE -- WILL ALWAYS EXECUTE
			//...
		}
	}
}
