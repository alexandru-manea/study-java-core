package deep_copy;

/**
 * CONCEPTS OF DEEP COPY 
 *
 */
public class Introduction {

	/**
	 * Implementing a deep copy of an object, especially of the object in question is complex in that it references
	 * many others, is very daunting. Traditionally, each class in the object must be individually inspected and edited
	 * to implement the Cloneable interface and override its clone() method in order to make a deep copy of itself as
	 * well as its contained objects. An alternative is to use serialization.
	 * 
	 */
	
	/**
	 * 
	 * SHALLOW COPY :: WHEN AN OBJECT IS COPIED WITHOUT ITS CONTAINED OBJECTS
	 * DEEP COPY    :: WHEN AN OBJECT IS COPIED ALONG WITH THE OBJECTS TO WHICH IT REFERS
	 * 
	 * If either of these contained objects themselves contain objects, then, in a deep copy, those objects are copied
	 * as well, and so on until the entire graph is traversed and copied. The default clone() method, inherited from
	 * Object, makes a shallow copy of the object. To achieve a deep copy, extra logic has to be added that explicitly
	 * calls all contained objects' clone() methods, and so on.
	 *
	 */
	
	/**
	 * PROBLEMS WITH TRADITIONAL WAYS
	 * ------------------------------
	 * 
	 * -> Implementing the clone() method in all these classes is time consuming and error-prone
	 * -> If an object can't be modified directly and its clone method produces a shallow copy, then the class must be
	 * extended, clone() overridden, and this new class used in place of the old
	 * -> If you want to write code defers until runtime the question of whether to make a deep or shallow copy, there
	 * must be two copy functions
	 * -> If the object being copied contains multiple references to another object, the latter object has to be copied 
	 * once to prevent the proliferation of objects or circular reference loops 
	 * 
	 */
}
