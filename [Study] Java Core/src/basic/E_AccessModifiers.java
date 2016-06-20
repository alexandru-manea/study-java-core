package basic;

public class E_AccessModifiers {

	
	/**
	 * ACCESS MODIFIERS
	 * ----------------
	 * 
	 *  There are two levels of access control:
	 * 	- top-level    :: public, or default/package-private (no explicit modifier)
	 * 	- member-level :: public, default, protected, or private
	 * 
	 * - PRIVATE   :: Can be accessed only from the same class
	 * - DEFAULT   :: Can be accessed from classes in the same package (also called PACKAGE PRIVATE)
	 * - PROTECTED :: Can be accessed from classes in the same package and from subclasses
	 * - PUBLIC    :: Can be accessed from everywhere
	 * 
	 */
	
	
	/**
	 * ACCESS TO A PROTECTED MEMBER FROM SUBCLASSES IN A DIFFERENT PACKAGE
	 * -------------------------------------------------------------------
	 * 
	 * 		package A;
	 * 		public class Bird {
	 * 			protected void swim() {...}
	 * 		}
	 * 
	 * 	1. Member is used without referring to a variable => inheritance => access allowed
	 * 
	 * 		package B;
	 * 		public class Swan extends Bird {
	 * 			public void doAction() {
	 * 				swim();	// OK
	 * 			}
	 * 		}
	 * 
	 * 	2. Member is used through a variable
	 * 		
	 * 		a. Variable is of subclass type
	 * 				
	 * 			package B;
	 * 			public class Swan extends Bird {
	 * 				public void help() {
	 * 					Swan other = new Swan();
	 * 					other.swim(); // OK
	 * 				}
	 * 			}
	 * 
	 * 		b. Variable is of parent type
	 * 			
	 * 			package B;
	 * 			public class Swan extends Bird {
	 * 				public void help() {
	 * 					Bird other = new Bird();
	 * 					other.swim(); // DOES NOT COMPILE
	 * 				}
	 * 			}
	 * 			
	 * 		EXPLANATION :: Not allowed to refer to members of the Bird class because:
	 * 					    - we are not in the same package
	 * 					    - Bird is not a subclass of Bird (!)
	 * 
	 */
}