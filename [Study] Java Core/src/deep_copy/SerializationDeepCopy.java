package deep_copy;

import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 * USING SERIALIZATION AS AN ALTERNATIVE TO THE DEEP COPY 
 *
 */
public class SerializationDeepCopy {

	/**
	 * *************************************************************************************************************
	 * SERIALIZATION :: ABILITY TO TURN A GRAPH OF OBJECTS (INCLUDING THE DEGENERATE CASE OF A SINGLE OBJECT) INT AN
	 * ARRAY OF BYTES THAT CAN BE TURNED BACK INTO AN EQUIVALENT GRAPH OF OBJECTS
	 * *************************************************************************************************************
	 * 
	 * --> An object is said to be serializable if it or one of its ancestors implements java.io.Serializable or
	 * java.io.Externalizable.
	 * --> A serializable object can be serialized by passing it to the writeObject() method of an ObjectOutputStream 
	 * --> This writes out the objects primitive data types, arrays, string, and other object references
	 * --> The writeObject() method is then called on the referred objects to serialize them as well and so on
	 * !!! This resembles the functionality which we need for deep copying !!!
	 * 
	 */
	
	/**
	 * DEEP COPY SERIALIZATION
	 * -----------------------
	 * 
	 * 1. Ensure that all classes in the object's graph are serializable
	 * 2. Create input and output streams
	 * 3. Use the input and output streams to create object input and object output streams
	 * 4. Pass the object that you want to copy to the object output stream
	 * 5. Read the new object from the object input stream and cast it back to the object you sent
	 * 
	 */
	
	/*
	 * Example of deep copy through serialization
	 * 
	 * Assumption :: All classes in the object's graph are serializable
	 * 
	 */
	private static class ObjectCloner {
		
		// prevent creating ObjectCloner object
		private ObjectCloner() {}
		
		
		// MAIN METHOD
		public static Object deepCopy(Object oldObject) throws Exception {
			
			ObjectOutputStream objectOutputStream = null; // used to write the object to
			ObjectInputStream objectInputStream = null; // used to read the new object from
			
			try {
				
				// create the object output stream wrapped on a byte array output stream
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
				
				// serialize and pass the object
				objectOutputStream.writeObject(oldObject); // recursively traverses the graph and send the bytes to the stream
				objectOutputStream.flush(); // ensure the whole object has been sent
				
				// create the object input stream wrapped around a byte array input stream WITH THE CONTENTS ON THE OUTPUT BYTE ARRAY STREAM
				ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
				objectInputStream = new ObjectInputStream(byteArrayInputStream);
				
				// object is deserialized and returned
				return objectInputStream.readObject(); 
			}
			catch (Exception e) {
				System.out.println("Exception in ObjectCloner = " + e);
				throw e;
			}
			finally {
				objectOutputStream.close();
				objectInputStream.close();
			}
		}
	}
	
	// Test client
	public static void main(String[] args) {
		
		// create a vector and add a point to it
		Vector vector = new Vector();
		Point point = new Point(1, 1);
		vector.addElement(point);
		
		Vector copy;
		
		// shallow copy
		copy = (Vector) vector.clone();
		
		// deep copy
		try {
			
			copy = (Vector)(ObjectCloner.deepCopy(vector));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * THINGS TO WATCH OUT FOR
	 * -----------------------
	 * 
	 * # Class that is not serializable and cannot be edited (e.g., 3rd party class with no source code) => Extend it
	 * # Performance -- much slower than implementing the classical deep copy via clone() and whole graph manual traversal (!!!)
	 * # Transient variables -- will not be copied
	 * 
	 */
}
