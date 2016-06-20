package basic;

public class B_Variables {

	/**
	 * IDENTIFIERS
	 * -----------
	 * 
	 * Naming rules applying to variables, methods, classes, and fields
	 * 	- The name must begin with a letter, '$", or '_'
	 *  - Subsequent chars can also be numbers
	 *  - Cannot use the same name as a reserver word
	 * 
	 */
	
	
	/**
	 * PRIMITIVE DATA TYPES
	 * --------------------
	 * 
	 * HOLDS --> value in the memory that the variable is allocated
	 * 
	 * TYPES
	 * 	- boolean :: true/false
	 *  ---
	 *  - byte    :: 8-bit integer
	 *  - short   :: 16-bit integer
	 *  - int     :: 32-bit integer
	 *  - long    :: 64-bit integer
	 *  ---
	 *  - float   :: 32-bit floating point ('f' has to follow the number)
	 *  - double  :: 64-bit floating point
	 *  ---
	 *  - char    :: 16-bit Unicode
	 *  
	 * NUMERIC LITERALS
	 * 	- When a number is present in the code -> numeric literal
	 * 	- By default, Java assumes you are defining an int; it it is out of range, you have to add 'L' at the end
	 *  - Java allows to specify digits in other formats as well (octal - 017, hexa - 0xFF, binary - 0b1010)
	 *  - Since Java 7, you can add '_' to numbers for readability
	 *  	- Can add it anywhere, except at the beginning, the end, right before, or right after the decimal point
	 *  - Assigning to a variable of one type and incompatible type value results in a compilation failure
	 * 
	 */
	
	/**
	 * REFERENCE DATA TYPES
	 * --------------------
	 * 
	 * HOLDS --> memory address where the object is located
	 * 
	 * IMPORTANT
	 * 	- Only way an object can be accessed
	 *  - Differences from primitives
	 *  	- Can be assigned null
	 *      - Can call methods on them
	 * 
	 */
	
	/**
	 * WRAPPER CLASSES
	 * ---------------
	 * 
	 * - Boolean, Byte, Short, Integer, Long, Float, Double, Character
	 * - Can convert Strings to primitives or wrappers using the parse and valueOf methods
	 * 		int primitive = Integer.parse("123");
	 * 		Integer wrapper = Integer.valueOf("123");
	 * - Autoboxing and Autounboxing
	 * 	- Since Java 5
	 * 	- With autounboxing, a NullPointerException is thrown when trying to unbox a null
	 * 		e.g. List<Integer> heights = new ArrayList<>(); heights.add(null); int h = heights.get(0); // NLP
	 * 
	*/
	
	
	/**
	 * OBSERVATIONS
	 * ------------
	 * 
	 * DECLARING MULTIPLE VARIABLES
	 * - Can declare multiple variables in the same statement as long as they share the same type and type declaration (otherwise compilation fail)
	 * - Can initialize any of them inline
	 * 	   e.g. String s1, s2 = "yes", s3 = "no";
	 * - Each snippet separated by a comma is a little declaration in its own. 
	 * 	   e.g., int i1, i2, i3 = 0;
	 * 
	 * DEFAULT INITIALIZATION OF VARIABLES
	 * 	- Local variables (within a method)
	 * 		- They must be initialized before use (no default value, just garbage data until intialized)
	 *      - The compilation will fail if you try to read an uninitialized value
	 *  - Instance variables and class variables
	 *  	- They do not require an initialization
	 *  	- They are given a default value
	 *  		- boolean                -> false
	 *  		- byte, short, int, long -> 0
	 *          - float, double          -> '\u0000' 
	 *          - reference              -> null
	 * 
	 * VARIABLE SCOPE
	 * 	- Local variables    --> from declaration to end of blocks 
	 * 	- Instance variables --> from declaration until garbage collected
	 * 	- Class variables    --> from declaration until program ends
	 * 
	 * EQUALITY
	 * 	- '==' only used to compare numbers and object references (true if they refer to the same location in memory)
	 * 		- Cannot use '==' to compare references of different types
	 * 	- '==' can return true for two String objects if they are instantiated using literals (known at compile-time)
	 *  - 'equals' should be used for logical equality
	 * 
	 */
}
