package various;

/**
 * QUESTION: WHEN DOES FINALLY NOT EXECUTE?
 * 
 * 0). IT DOES WHEN NO EXCEPTION IS THROWN, AND IF ONE IS THROWN AND A CATCH BLOCK CATCHES IT
 * 1). IT DOES WHEN AN EXCEPTION IS THROWN AND NO MATCHING CATCH BLOCK EXISTS
 * 2). IT DOES EVEN WHEN THE LAST STATEMENT IN THE TRY BLOCK IS A RETURN (!!!)
 * 
 * 3). IT DOESN'T WHEN THE LAST STATEMENT IN THE TRY BLOCK IS A SYSTEM.EXIT() OR THE JVM CRASHES
 *
 *
 */
public class FinallyExecution {

	
	// 1).
	private static void finallyExecutesWhenExceptionNotCaught() {

		try {

			System.out.println("Trying...");
			int a = 1/0; // causes exception to be thrown (no one will catch it)
		}
		catch (NumberFormatException exception) {}

		finally {

			System.out.println("Finally!");
		}
	}
	
	// 2). !!!
	private static void finallyExecutesWhenReturn() {

		try {

			System.out.println("Trying...");
			return; // this is postponed until the finally block is executed
		}
		catch (Exception exception) {}

		finally {

			System.out.println("Finally!");
		}
	}

	// 3).
	private static void finallyDoesNotExecuteWhenExit() {

		try {

			System.out.println("Trying...");
			System.exit(0); // this causes the finally block not to execute (the same as if the JVM would crash)
		}
		catch (Exception exception) {}

		finally {

			System.out.println("Finally!");
		}
	}
	
	
	// Test client
	public static void main(String[] args) {
		
		try {
			finallyExecutesWhenExceptionNotCaught();
		} catch (Exception e) {}
		System.out.println("---------");
		finallyExecutesWhenReturn();
		System.out.println("---------");
		finallyDoesNotExecuteWhenExit();
	}
}
