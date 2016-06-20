package various;

/**
 * QUESTION :: WHY IS THE GET METHOD FROM JAVA.UTIL.MAP<K, V) NOT FULLY GENERIC?
 * 
 * i.e., Now     -> V get(Object key)
 * 		 Why not -> V get(K key)
 *
 */
public class MapGetNotGeneric {

	/**
	 * The reason is that the key of the entry you are retrieving does not have to be the same type as the object that you pass in to the get() method. 
	 * The specification of the method only requires that they are equal.
	 * 
	 * Although it is commonly true that most classes have the equals() method defined so that its objects can only be
	 * equal to objects of its own class, this is not always the case. For example, java.util.List is such a case,
	 * the equals() method does not enforce the two lists to be the same concrete List class type; only that they both
	 * implement List and that they have the same contents.
	 * 
	 * On the same principle, Set<E>.contains() takes an object, not an E.
	 * 
	 * OBS> Methods of the Java Collections Framework never restrict the types of their parameters except when it's necessary to prevent the collection 
	 * from getting broken.
	 *  
	 */
}