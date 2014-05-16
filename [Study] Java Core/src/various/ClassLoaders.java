package various;

/**
 * STUFF ABOUT CLASS LOADERS 
 *
 */
public class ClassLoaders {

	/**
	 * ********************************************************************************************************
	 * CLASS LOADER :: ENTITY WHICH RETURNS BYTECODE FOR A NAME AND PROVIDES IT TO THE JVM (DEFINING THE CLASS)
	 * ********************************************************************************************************
	 * 
	 * -> What VARIES between different class loader implementations is the MECHANISM used to come up with the bytecode
	 * -> Simple case: might look at the classpath, read and unpack a JAR, and get the bytes of a file ending in .class
	 * 
	 */
	
	/**
	 * UNIQUE ENTRIES FOR CLASSES IN THE JVM
	 * -------------------------------------
	 * 
	 * -> Whenever a classloader defines a new class, the class contains an immutable reference back to the class loader
	 * instance that defined it (class.getClassLoader())
	 * 
	 * ***************************************************************************
	 * EVERY CLASS IN MEMORY IN THE RUNTIME ENVIRONMENT CAN BE UNIQUELY DEFINED BY
	 * - ITS FULL NAME
	 * - THE CLASS LOADER THAT LOADED IT
	 * ***************************************************************************
	 * 
	 */
	
	/**
	 * DIFFERENT TYPES OF CLASSLOADERS
	 * -------------------------------
	 * 
	 * - Bootstrap
	 * - System
	 * - Extension
	 * - Application
	 * - Context
	 * 
	 */
}

