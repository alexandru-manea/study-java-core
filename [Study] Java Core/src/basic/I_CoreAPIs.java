package basic;

public class I_CoreAPIs {

	/**
	 * ARRAYS
	 * ------
	 * 
	 * -> Declaration
	 * 		- int[] array;
	 * 		- int[]array;
	 * 		- int [] array;
	 * 		- int array[];
	 * 		- int array [];
	 * 
	 * -> Instantiation
	 * 		- int[] array = new int[3];
	 * 		- int[] array = new int[3] {1, 2, 3};
	 * 		- int[] array = {1, 2, 3};
	 * 			OBS> Can have a 0 or a negative size -> it will compile fine. 0 will be ok at runtime, negative will throw an exception
	 * 
	 * -> Equals
	 * 		- An array is an object
	 * 		- equals() will do reference comparison
	 * 			- Two arrays with the same content are NOT equal
	 * 
	 * -> Casting
	 * 		- String[] test;							  // points to null
	 * 		- String[] strings = {"value"};				  // points to an array
	 * 		- Object[] objects = strings;				  // works fine because Object is a broader type than String
	 * 		- String[] otherStrings = (String[]) objects; // need case because moving to a more specific type
	 * 		- otherString[0] = new StringBuilder();		  // does not compile
	 * 		- objects[0] = new StringBuilder();			  // comiles, but fails at runtime with ArrayStoreException
	 * 
	 * -> Methods in java.util.Arrays
	 * 		- Arrays.sort()
	 * 		- Arrays.binarySearch();
	 * 
	 * -> Multidimensional arrays
	 *		- Declaration
	 *			int[][] vars1;			  // 2D
	 *			int vars2 [][];			  // 2D
	 *			int[] vars4, vars 5 [][]; // 1D and 3D
	 *		- Instantiation
	 *			- Same as for the regular ones, either declare size or list elements
	 *			- The first dimension has to be specified, the rest can be declared later
	 *		- The inner arrays can be different in size
	 *			e.g. int[] differentSize = {{1, 4}, {3}, {9, 8, 7}};
	 *
	 * -> Various
	 * 		- Pretty print
	 * 			Arrays.toString(Array);
	 * 		- String[] array = new String[6]; array.length -> 6, even though they all point to null
	 * 		- Can use a variables defined with varargs as a regular array
	 * 
	 */
	
	
	/**
	 * ARRAYLISTS
	 * ----------
	 * 
	 * -> Declaration and initialization
	 * 		- Java5 - Java7:
	 * 			ArrayList<String> list = new ArrayList<String>();
	 * 		- Post Java7
	 * 			ArrayList<String> List = new ArrayList<>();
	 * 
	 * -> Methods
	 * 		- add/remove/set
	 * 		- isEmpty/size/contains/clear
	 * 		- equals
	 * 			- provided implementation to check whether two arraylists have the same elements in the same order
	 * 
	 * -> Converting FROM ARRAYLIST TO ARRAY
	 * 		- Use list.toArray() method
	 * 		- List<String> list = new ArrayList<>(); list.add("A"); list.add("B");
	 * 			Object[] objectArray = list.toArray();				// defaults to array of type object
	 * 			String[] stringArray = list.toArray(new String[0]); // creates an array of proper type and size
	 * 
	 * -> Converting FROM ARRAY TO ARRAYLIST
	 * 		- There is NO array.asList() method
	 * 		- Use Arrays.asList(array)
	 * 			- The original array and the created array-backed list are linked, they refer to the same data store, changes to the one reflect in the other
	 * 				String[] array = {"A", "B"};
	 * 				List<String> list = Arrays.asList(array);
	 * 				list.set(1, "test");
	 * 				array[0] = "test";
	 * 				--> now both are {"test", "test"}
	 * 				list.remove(1); // UnsupportedOperationException because we are not allowed to change the size of the list
	 * 
	 * -> Various
	 * 		- Creating an ArrayList quickly with varargs
	 * 			List<String> list - Arrays.asList("one", "two", "three""};
	 * 		- Sorting an ArrayList
	 * 			Collection.sort(list);
	 * 				OBS> Sorting is done char by char. Numbers before letters and strings alphabetically. e.g., {"30", "3A", "8", "FF"})
	 * 		- Searching an ArrayList
	 * 			Collections.binarySearch();
	 * 
	 */
	
	
	/**
	 * STRINGS
	 * -------
	 * 
	 * -> Instantiation
	 * 		1. String literal
	 * 		2. With 'new'
	 * 
	 * -> Concatenation
	 * 		- If either of the operands is a string, '+' means concatenation
	 * 		- The expression is evaluated left to right
	 * 			e.g. "a" + "b" + 3 => "ab3"
	 * 				 1 + 2 + "a"   => "3a"
	 * 
	 * -> Immutability
	 * 		- Whenever a method is called on a string, it will stay the same, only the returned new string will be different
	 * 
	 * -> The String Pool
	 * 		- Strings use a lot of memory (in some applications, up to 40%)
	 * 		- Literal values in the program are reused from a string pool in the JVM
	 * 
	 * -> StringBuilder
	 * 		- Method to avoid creating many String objects when modifying one
	 * 			- Number of StringBuilder objects = number of new(); methods on it and reassigning to other references -> same object
	 * 		- StringBuffer is a thread-safe version (slower, only used if multiple threads access the object)
	 * 
	 */
}
