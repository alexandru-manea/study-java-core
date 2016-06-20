package advanced;

public class UsingInstanceof {

	/**
	 * INSTANCEOF
	 * ----------
	 * 
	 * DEF> a instanceof B -> returns true if the reference to which a points is either:
	 * 						1. an instance of class B
	 * 						2. a subclass of B (directly or indirectly)
	 * 						3. a class that implements the B interface (directly or indirectly)
	 * 
	 * --> There are two levels at which the check is made:
	 * 		1. compilation-level
	 * 			- Only when called on a class, not on an interface
	 * 		2. at runtime
	 * 
	 */
	
	// mock classes used to illustrate the points bellow
	private static class HeavyAnimal {}
	private static class Hippo extends HeavyAnimal {}
	private static class Elephant extends HeavyAnimal {}
	
	/*
	 * Example of using instanceof with false at compile-time
	 */
	void doChecksV1() {
		Hippo aHippo = new Hippo();
		
		/*
		 * -- intentionally commented out to avoid error --
		 * 
		 *	boolean b = aHippo instanceof Elephant; // does not compile because the compiler knows there is no way a Hippo reference can be an Elephant
		 * 
		 */
	}
	
	/*
	 * Example of using instanceof with false at runtime
	 */
	void doChecksV2() {
		HeavyAnimal hippo = new Hippo();
		
		boolean b1 = hippo instanceof Hippo;       // true
		boolean b2 = hippo instanceof HeavyAnimal; // true
		boolean b3 = hippo instanceof Elephant;    // false --> although the reference of type HeavyAnimal could be an Elephant, at runtime it isn't
	}
			
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * -> Because all classes descend from Object, a instanceof Object will always return true, except:
	 * 		1. a is the literal null
	 * 		2. a is a reference pointing to null
	 * 
	 * -> The compilation check only applies when instanceof is called on a class. When checking whether an object is an instanceof an interface, Java waits until
	 * runtime to determine the result
	 * 	e.g.
	 * 		interface Mother {}
	 * 		class Hippo extends HeavyAnimal {}
	 * 
	 * 		HeavyAnimal hippo = new Hippo();
	 * 		boolean b = hippo instanceof Mother; // COMPILES
	 * 
	 * 		-- Although Hippo does not implement Mother, there could later be a class such as:
	 * 		class MotherHippo extends Hippo implements Mother {}
	 * 
	 * -> The instanceof operator is commonly used if an instance is a particular subclass before applying a particular cast
	 * 	e.g.
	 * 		public void feedAnimal(Animal animal) {
	 * 			if (animal instanceof Cow) {
	 * 				((Cow)animal).addHay();
	 * 			} else if (animal instanceof Bird) {
	 * 				((Bird)animal).addSeeds();
	 * 			}
	 * 		}
	 * 	BUT> BAD PRACTICE
	 * 
	 */
}
