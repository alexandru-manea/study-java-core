package advanced;

public class VirtualMethodInvocation {

	/**
	 * VIRTUAL METHODS
	 * ---------------
	 * 
	 * DEF> ANY NON-STATIC METHOD
	 * 
	 * --> Java looks for an OVERRIDDEN method rather than just using the one in the class that the compiler says we have
	 * --> So it will look at the type of the object AT RUNTIME
	 * 
	 */
	
	/*
	 * Example of virtual method invocation
	 */
	private static abstract class Animal {
		public abstract void feed();
	}
	
	// concrete subclasses
	private static class Cow extends Animal {
		public void feed() {}
	}
	private static class Bird extends Animal {
		public void feed() {}
	}
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * 1. IT DOESN'T WORK WITH INSTANCE VARIABLES
	 * 	e.g.
	 * 		abstract class Animal {
	 * 			String name = "???";
	 * 			public void printName() {System.out.println(name);}
	 * 		}
	 * 		class Lion extends Animal {
	 * 			String name = "LEO";
	 * 		}
	 * 		class PlayWithAnimal {
	 * 			...
	 * 				Animal animal = new Lion();
	 * 				animal.printName();        // WILL PRINT "???"
	 * 			...
	 * 		}
	 * --> The name declared in Lion would only be used if it was referred to from Lion
	 * 
	 * 2. IT DOESN'T WORK WITH STATIC METHODS
	 * 
	 */
}